package quiz;

public class QuizQuestions {

	String question1 = "What is the range of data type short in Java ?\n" 
	+ " a. -128 to 127\n b. -32768 to 32767\n c.  None of the mentioned\n";

	String question2 = " What is the range of data type byte in Java?\n" 
	+ " a. -2147483648 to 2147483647\n b. -32768 to 32767\n c. -128 to 127\n";
	
	String question3 = "An expression involving byte, int, and literal numbers is promoted to which of these?\n" 
			+ " a.  int\n b. long\n c. double\n";
	
	String question4 = "Which data type value is returned by all transcendental math functions?\n" 
			+ " a.  int\n b. long\n c. double\n";
	
	String question5 = "Which of these coding types is used for data type characters in Java?\n" 
			+ " a. ASCII\n b. UNICODE\n c. NONE\n";
	
	String question6 = " Which of these values can a boolean variable contain?\n" 
			+ " a. True\n b. False\n c. true&false\n";
	
	String question7 = "Which of these literals can be contained in a data type float variable?\n" 
			+ " a. 3.4e-038\n b. 3.4e-050\n c.  1.7e+308\n";
	
	String question8 = " Which one is a valid declaration of a boolean?\n" 
			+ " a. bool b=true;\n b. boolean b4 = ‘true’\n c. boolean b3 = false;\n";
	
	String question9 = "Which of these occupy first 0 to 127 in Unicode character set used for characters in Java?\n" 
			+ " a. ASCII\n b. ISO-LATIN-1\n c. Both a&b\n";
	
	String question10 = " What is the numerical range of a char in Java?\n" 
			+ " a. 0 to 65535\n b. -128 to 127\n c.  0 to 256\n";

	Question[] questions = { 
			new Question(question1, "b"),
			new Question(question2, "c"),
			new Question(question3, "a"),
			new Question(question4, "c"),
			new Question(question5, "b"),
			new Question(question6, "c"),
			new Question(question7, "a"),
			new Question(question8, "c"),
			new Question(question9, "c"),
			new Question(question10, "a")
			};

}
