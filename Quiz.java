import java.util.Scanner;

public class Quiz {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] questions = {
            "1. Which planet has the most moons?",
            "2.How many hearts does an octopus have?",
            "3.Who is the first president of India?"
        };

        String[][] options = {
            {"A. Venus", "B.Saturn", "C. Mars"},
            {"A. 3", "B.5", "C.2"},
            {"A.Prathibha Patil", "B.Sarvepalli Radhakrishnan", "C.Rajendra Prasad"}
        };

        char[] correctAnswers = {'B', 'A', 'C'};

   
        int score = 0;
        int totalQuestions = questions.length;

        for (int i = 0; i < totalQuestions; i++) {
            System.out.println(questions[i]);

            for (String option : options[i]) {
                System.out.println(option);
            }

            System.out.print("Your answer: ");
            char userAnswer = scanner.next().toUpperCase().charAt(0);

            if (userAnswer == correctAnswers[i]) {
                System.out.println("Correct!\n");
                score++;
            } else {
                System.out.println("Incorrect. The correct answer is " + correctAnswers[i] + ".\n");
            }
        }

        System.out.println("Quiz completed!");
        System.out.println("Your score is: " + score + " out of " + totalQuestions);

        scanner.close();
    }
}
