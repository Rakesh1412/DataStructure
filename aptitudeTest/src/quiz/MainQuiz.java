package quiz;

public class MainQuiz {

	public static void main(String[] args) {
		QuizQuestions qq = new QuizQuestions();

		TakeTest.takeTest(qq.questions);

	}

}
