import java.util.Scanner;

public class Main {

    //GLOBAL STRINGS
    static final String disclaimer = " Be sure to use correct grammar and capitalization.";
    static final String correct = "Your answer is correct. Your new score is ";
    static final String incorrect = "Your answer is incorrect. The correct answer is ";

    public static void main(String[] args) {

        //QUESTIONS
        String[] questions = new String[5];
        questions[0] = "What is the capital of Colorado?";
        questions[1] = "What is the capital of Syria?";
        questions[2] = "What is the derivative of 2^2?";
        questions[3] = "What is the first number in the specific heat capacity of water?";
        questions[4] = "Which case established judicial review?";

        //ANSWERS
        String[] answers = new String[5];
        answers[0] = "Denver";
        answers[1] = "Damascus";
        answers[2] = "0";
        answers[3] = "4";
        answers[4] = "Marbury v. Madison";

        //UTILITY STRINGS
        final String proceed = "Type 'quit' if you wish to quit, and anything else if you wish to proceed.";
        int off = 0;
        int score = 0;

        //GAME MECHANISM
        while(off == 0) {
            for(int i = 0; i < questions.length; i++) {
                askQuestion(questions[i]);
                Scanner prompter = new Scanner(System.in);
                String input = prompter.nextLine();
                if(input.equals(answers[i])) {
                    score = updateScore(score);
                    System.out.println(correct + score + ".");
                } else {
                    System.out.println(incorrect + answers[i] + ".");
                }
            }
            Scanner scanner = new Scanner(System.in);
            System.out.println(proceed);
            String wishQuit = scanner.nextLine();
            if(wishQuit.equals("quit")) {
                off = 1;
                System.out.println("Thanks for playing! Your final score is " + score + ".");
            }
        }
    }

    public static void askQuestion(String question) {
        System.out.println(question + disclaimer);
    }

    public static int updateScore(int score) {
        return score + 1;
    }
}