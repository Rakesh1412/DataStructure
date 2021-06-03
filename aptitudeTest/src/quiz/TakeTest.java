package quiz;

import java.util.Scanner;

public class TakeTest {
	public static void takeTest(Question[] questions) {
		int score = 0;
		int noOfQuestion=questions.length;
		Scanner s = new Scanner(System.in);
		for (int i = 0; i < noOfQuestion; i++) {
			System.out.println(questions[i].question);
			String answer = s.nextLine();
			if (answer.equals(questions[i].answer)) {
				score++;
			}
		}
		float scr=(float)score/noOfQuestion;
		float percentage=scr*100f;
		System.out.println("you got " + score + " out of" + questions.length);
		System.out.println("you got "+percentage+" percentage");
	}

}
