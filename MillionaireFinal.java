package chapter15;

import java.applet.*;
import java.awt.*;
import java.awt.image.ImageObserver;

/* ProgramName: MillionaireFinal
 * Author: Jeffery Wright
 * Date: December 8, 2017
 * Description: Who Wants to be a Millionaire with graphics using the Applet
 */

public class MillionaireFinal extends Applet
{
	//All of these are class values
	Rectangle ansA,ansB,ansC,ansD,quit;
	String question;
	String answerA;
	String answerB;
	String answerC;
	String answerD;
	//qNum is a random number.
	int qNum = generateRandom();
	//Level indicates the level.
	int level = 1;
	//Money indicates how much money the contestant has earned.
	int money = 0;
	//lastL and lastQ stand for Last Level and Last Question. Used when the contestant quits
	int lastL;
	int lastQ;
	//quitGame, Lose, and Win are conditions.
	boolean quitGame = false;
	boolean lose = false;
	boolean win = false;
	//Image for the logo
	Image logo;
	
	//Adds in invisible rectangle that the users click on.
	public void init() 
    {
    	ansA = new Rectangle(20,340,290,50);
    	ansB = new Rectangle(330,340,290,50);
    	ansC = new Rectangle(20,410,290,50);
    	ansD = new Rectangle(330,410,290,50);
    	quit = new Rectangle(520,20,100,30);
    	logo = getImage(getDocumentBase(),"logo.png");
    }
	
	//Paints the applet using functions
	public void paint(Graphics g)
    {
    	drawFirst(g);
    	insertQuestionsAnswers(g);
    	if (quitGame)
    		drawQuitMessage(g);
    }

	public void drawFirst(Graphics g)
	{
		//Sets color to yellow
		g.setColor(Color.YELLOW);
		//Draws four rectangles in the bottom in the color yellow as placeholders for the answers
		g.fillRect(20,340,290,50);
    	g.fillRect(330,340,290,50);
    	g.fillRect(20,410,290,50);
    	g.fillRect(330,410,290,50);
    	//Sets a new font
    	g.setFont(new Font("Arial",Font.BOLD,24));
    	//Sets color to blue for the quit button in the upper right corner
    	g.setColor(Color.BLUE);
    	g.fillRect(520,20,100,30);
    	g.setColor(Color.WHITE);
    	g.drawString("QUIT", 542, 44);
    	//Sets color to dark green
    	g.setColor(new Color(0,128,0));
    	//Draws a string to represent the current amount of money on hand
    	g.drawString("Money: $" + getMoney(), 20, 44);
    	//Adds the logo
    	g.drawImage(logo, 280, 20, this);
    	
	}
	
	public void insertQuestionsAnswers(Graphics g) 
	{
		//Calls the getQuestion method in the Questions class to fetch a question.
		question = Questions.getQuestion(getLevel(),getQuestion());
		//Calls the get methods in the Questions class to fetch answers corresponding to the question.
		answerA = Questions.getA(getLevel(),getQuestion());
		answerB = Questions.getB(getLevel(),getQuestion());
		answerC = Questions.getC(getLevel(),getQuestion());
		answerD = Questions.getD(getLevel(),getQuestion());
		//Black font to display text of the questions
		g.setFont(new Font("Arial",Font.BOLD,18));
		g.setColor(Color.black);
		g.drawString(question,20,290);
		//New font for slightly smaller for answers
		g.setFont(new Font("Arial",Font.BOLD,16));
		g.drawString(answerA,30,372);
		g.drawString(answerB,340,372);
		g.drawString(answerC,30,442);
		g.drawString(answerD,340,442);
	}
	
	//This gets called only if the player has to quit
	public void drawQuitMessage(Graphics g)
	{
		//Covers up the questions section with a white rectangle
		g.setColor(Color.WHITE);
		g.fillRect(0, 250, 640, 230);
		//Sets color to black for text and font size big
		g.setColor(Color.BLACK);
		g.setFont(new Font("Arial",Font.BOLD,32));
		//Prints a custom message if the contestant lost or won.
		if (lose == true)
		{
			g.drawString("You lost the game.", 175, 220);
			g.setFont(new Font("Arial",Font.PLAIN,16));
			g.drawString("The answer was " + Questions.showAnswer(
					Questions.correctAnswer(getLastL(),getLastQ()),getLastL(),getLastQ()), 175, 270);
		}
		else if (win == true)
		{
			g.drawString("You won the game!", 175, 220);
			g.setFont(new Font("Arial",Font.PLAIN,16));
			g.drawString("This concludes the demo of this project.", 175, 270);
		}
		else
		{
			g.drawString("You quit the game.", 175, 220);
			g.setFont(new Font("Arial",Font.PLAIN,16));
			g.drawString("The answer was " + Questions.showAnswer(
					Questions.correctAnswer(getLastL(),getLastQ()),getLastL(),getLastQ()), 175, 270);
		}
		//Prints credits with the smaller font
		g.drawString("Created by Jeffrey Wright, Ivy Tech Community College, 2017",100,440);
		//Creates a retry button to cover up the quit button
		g.setColor(new Color(0,128,0));
    	g.fillRect(520,20,100,30);
    	g.setColor(Color.WHITE);
    	g.setFont(new Font("Arial",Font.BOLD,24));
    	g.drawString("RETRY", 530, 44);
	}
	
	//This is where all the interactive stuff happens.
	public boolean mouseDown(Event e, int x, int y)
	{
		//If the contestant has to quit the game, these functions will only happen.
		if (quitGame)
		{
			//Clicking on the quit button (retry button) restarts the game.
			if(quit.contains(x,y))
				retry();
			else
				return false;
			//Repaint calls on the paint method again
			repaint();
			//When player retries, random number is generated to bring up a random question with its answers
			qNum = generateRandom();
			return true;
		}
		//Calls on methods when the mouse is clicked in any rectangle defined in init
		if (ansA.contains(x, y))
			tapA();
		else if (ansB.contains(x, y))
			tapB();
		else if (ansC.contains(x, y))
			tapC();
		else if (ansD.contains(x, y))
			tapD();
		else if (quit.contains(x, y))
			quit();
		else
			return false;
		//Repaint calls on the paint method again
		repaint();
		return true;
	}
	
	//This is what happens if you click on the area where A is.
	public void tapA()
	{
		//The if statement determines that if A is correct, it will execute these commands
		if(Questions.correctAnswer(getLevel(),getQuestion()) == 1)
		{
			//Changes the money based on the level
			setMoney(level);
			//Increments level
			level++;
			//Generates a random number for the next question
			qNum = generateRandom();
			//The win condition is if the player reaches level 6.
			if (level == 6)
				win();
		}
		//If A is wrong, then the lose method gets executed.
		else
			lose();
	}
	
	public void tapB()
	{
		if(Questions.correctAnswer(getLevel(),getQuestion()) == 2)
		{
			setMoney(level);
			level++;
			qNum = generateRandom();
			if (level == 6)
				win();
		}
		else
			lose();
	}
	
	public void tapC()
	{
		if(Questions.correctAnswer(getLevel(),getQuestion()) == 3)
		{
			setMoney(level);
			level++;
			qNum = generateRandom();
			if (level == 6)
				win();
		}
		else
			lose();
	}
	
	public void tapD()
	{
		if(Questions.correctAnswer(getLevel(),getQuestion()) == 4)
		{
			setMoney(level);
			level++;
			qNum = generateRandom();
			if (level == 6)
				win();
		}
		else
			lose();
	}
	
	public void win()
	{
		//If you win, you win and you also have to quit.
		win = true;
		quitGame = true;
	}
	
	public void lose()
	{
		//Calls on quit method
		quit();
		//Lose all your money
		money = 0;
		//You lose
		lose = true;
	}
	
	public void quit()
	{
		//the program knows you quit.
		quitGame = true;
		//lastQ and lastL get assigned to the current level and question number.
		lastQ = getQuestion();
		lastL = getLevel();
	}
	
	public void retry()
	{
		//The game will set all boolean methods to false.
		quitGame = false;
		lose = false;
		win = false;
		//Money is reset to 0.
		money = 0;
		//Level is reset to 1.
		level = 1;
		//qNum gets a random number generated for the question.
		qNum = generateRandom();
	}
	
	public int getQuestion()
	{
		return qNum;
	}
	
	public int getLevel()
	{
		return level;
	}
	
	public int getMoney()
	{
		return money;
	}
	
	public int getLastL()
	{
		return lastL;
	}
	
	public int getLastQ()
	{
		return lastQ;
	}
	
	public void setMoney(int level)
	{
		//The level value determines how much money you have now.
		switch(level)
		{
			case 1:
				money = 100;
				break;
			case 2:
				money = 200;
				break;
			case 3:
				money = 300;
				break;
			case 4:
				money = 500;
				break;
			case 5:
				money = 1000;
				break;
			default:
				money = 0;
				break;
		}
	}
	
	public int generateRandom()
	{
		//returns a random int value between 1 and 3.
		return (int)(4 * Math.random() + 1);
	}
}
