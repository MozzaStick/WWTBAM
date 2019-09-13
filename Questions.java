package chapter15;

/* ProgramName: Questions
 * Author: Jeffery Wright
 * Date: December 8, 2017
 * Description: The questions for Who Wants to be a Millionaire?
 */

public class Questions 
{
	public static String getQuestion(int level, int question)
	{
		switch(level)
		{
		//Case 1 is US History
		case 1:
			switch(question) 
			{
			case 1: return "Who is the first president of the United States?";
			case 2: return "When did the USA declare its independence?";
			case 3: return "Which war did the United States fought in in 1898?";
			case 4: return "Which US state is the 19th to gain statehood?";
			default: return "ERROR: NO QUESTION FOUND";
			}
		//Case 2 is Java
		case 2:
			switch(question)
			{
			case 1: return "What year was Java first released in?";
			case 2: return "Which of the following is not a reserved Java keyword?";
			case 3: return "Which of the following programming languages is object-oriented?";
			case 4: return "Which of the following is not a Java loop statement?";
			default: return "ERROR: NO QUESTION FOUND";
			}
		//Case 3 is Anime
		case 3:
			switch(question)
			{
			case 1: return "Which is the name of a real anime?";
			case 2: return "Who is Ash's first female travelling companion?";
			case 3: return "In which year was No Game No Life released?";
			case 4: return "Which anime character has pink hair?";
			default: return "ERROR: NO QUESTION FOUND";
			}
		//Case 4 is Geography
		case 4:
			switch(question)
			{
			case 1: return "Which of the following countries has the most people?";
			case 2: return "What is the capital of Hungary?";
			case 3: return "Which country has the highest gun ownership per capita?";
			case 4: return "Which country lies on the equator?";
			default: return "ERROR: NO QUESTION FOUND";
			}
		//Case 5 is a Grab Bag
		case 5:
			switch(question)
			{
			case 1: return "Which actor plays the main character in House of Cards?";
			case 2: return "What is the French word for \"Apple?\"";
			case 3: return "What percent of Earth's atmosphere is made up of Nitrogen?";
			case 4: return "A common Internet acronym, LOL typically stands for what?";
			default: return "ERROR: NO QUESTION FOUND";
			}
		default: return "ERROR: NO QUESTION FOUND";
		}
	}
	
	public static String getA(int level, int question)
	{
		switch(level)
		{
		case 1:
			switch(question)
			{
			case 1: return "A: George Washington";
			case 2: return "A: 1763";
			case 3: return "A: World War I";
			case 4: return "A: Florida";
			default: return "ERROR";
			}
		case 2:
			switch(question)
			{
			case 1: return "A: 1989";
			case 2: return "A: static";
			case 3: return "A: Java";
			case 4: return "A: for";
			default: return "ERROR";
			}
		case 3:
			switch(question)
			{
			case 1: return "A: Ultra Gate";
			case 2: return "A: Misty";
			case 3: return "A: 2007";
			case 4: return "A: Yui Hirasawa";
			default: return "ERROR";
			}
		case 4:
			switch(question)
			{
			case 1: return "A: France";
			case 2: return "A: Budapest";
			case 3: return "A: Somalia";
			case 4: return "A: India";
			default: return "ERROR";
			}
		case 5:
			switch(question)
			{
			case 1: return "A: Bryan Cranston";
			case 2: return "A: Eple";
			case 3: return "A: 18%";
			case 4: return "A: Laught out loud";
			default: return "ERROR";
			}
		default: return "ERROR";
		}
	}
	
	public static String getB(int level, int question)
	{
		switch(level)
		{
		case 1:
			switch(question)
			{
			case 1: return "B: Thomas Jefferson";
			case 2: return "B: 1776";
			case 3: return "B: World War II";
			case 4: return "B: Kentucky";
			default: return "ERROR";
			}
		case 2:
			switch(question)
			{
			case 1: return "B: 1992";
			case 2: return "B: start";
			case 3: return "B: SQL";
			case 4: return "B: while";
			default: return "ERROR";
			}
		case 3:
			switch(question)
			{
			case 1: return "B: The Gates of Doom";
			case 2: return "B: May";
			case 3: return "B: 2011";
			case 4: return "B: Yui Ikari";
			default: return "ERROR";
			}
		case 4:
			switch(question)
			{
			case 1: return "B: Germany";
			case 2: return "B: Belgrade";
			case 3: return "B: Switzerland";
			case 4: return "B: Thailand";
			default: return "ERROR";
			}
		case 5:
			switch(question)
			{
			case 1: return "B: Kevin Spacey";
			case 2: return "B: Manzana";
			case 3: return "B: 38%";
			case 4: return "B: Let off lightly";
			default: return "ERROR";
			}
		default: return "ERROR";
		}
	}
	
	public static String getC(int level, int question)
	{
		switch(level)
		{
		case 1:
			switch(question)
			{
			case 1: return "C: James Madison";
			case 2: return "C: 1781";
			case 3: return "C: Spanish-American War";
			case 4: return "C: Vermont";
			default: return "ERROR";
			}
		case 2:
			switch(question)
			{
			case 1: return "C: 1995";
			case 2: return "C: final";
			case 3: return "C: HTML";
			case 4: return "C: do while";
			default: return "ERROR";
			}
		case 3:
			switch(question)
			{
			case 1: return "C: Divine Gate";
			case 2: return "C: Dawn";
			case 3: return "C: 2014";
			case 4: return "C: Yui Funami";
			default: return "ERROR";
			}
		case 4:
			switch(question)
			{
			case 1: return "C: Italy";
			case 2: return "C: Hamburg";
			case 3: return "C: Iraq";
			case 4: return "C: Ecuador";
			default: return "ERROR";
			}
		case 5:
			switch(question)
			{
			case 1: return "C: Michael C. Hall";
			case 2: return "C: Pomme";
			case 3: return "C: 58%";
			case 4: return "C: Like it or leave it";
			default: return "ERROR";
			}
		default: return "ERROR";
		}
	}
	
	public static String getD(int level, int question)
	{
		switch(level)
		{
		case 1:
			switch(question)
			{
			case 1: return "D: Abraham Lincoln";
			case 2: return "D: 1787";
			case 3: return "D: Civil War";
			case 4: return "D: Indiana";
			default: return "ERROR";
			}
		case 2:
			switch(question)
			{
			case 1: return "D: 1998";
			case 2: return "D: for";
			case 3: return "D: Pascal";
			case 4: return "D: do until";
			default: return "ERROR";
			}
		case 3:
			switch(question)
			{
			case 1: return "D: Dress Gate";
			case 2: return "D: Sarah";
			case 3: return "D: 2016";
			case 4: return "D: Yui (Angel Beats!)";
			default: return "ERROR";
			}
		case 4:
			switch(question)
			{
			case 1: return "D: United Kingdom";
			case 2: return "D: Kiev";
			case 3: return "D: United States";
			case 4: return "D: South Africa";
			default: return "ERROR";
			}
		case 5:
			switch(question)
			{
			case 1: return "D: Bob Saget";
			case 2: return "D: Ringo";
			case 3: return "D: 78%";
			case 4: return "D: Let's order linguini";
			default: return "ERROR";
			}
		default: return "ERROR";
		}
	}
	
	public static int correctAnswer(int level, int question)
	{
		switch(level)
		{
		case 1:
			switch(question) 
			{
			case 1: return 1;
			case 2: return 2;
			case 3: return 3;
			case 4: return 4;
			default: return 0;
			}
		case 2:
			switch(question)
			{
			case 1: return 3;
			case 2: return 2;
			case 3: return 1;
			case 4: return 4;
			default: return 0;
			}
		case 3:
			switch(question)
			{
			case 1: return 3;
			case 2: return 1;
			case 3: return 3;
			case 4: return 4;
			default: return 0;
			}
		case 4:
			switch(question)
			{
			case 1: return 2;
			case 2: return 1;
			case 3: return 4;
			case 4: return 3;
			default: return 0;
			}
		case 5:
			switch(question)
			{
			case 1: return 2;
			case 2: return 3;
			case 3: return 4;
			case 4: return 1;
			default: return 0;
			}
		default: return 0;
		}
	}
	
	public static String showAnswer(int showMe, int level, int question)
	{
		switch(showMe)
		{
		case 1:
			return getA(level,question);
		case 2:
			return getB(level,question);
		case 3:
			return getC(level,question);
		case 4:
			return getD(level,question);
		default: return "ERROR";
		}
	}
}
