package Ex2.p2.Completed;

import java.util.*;
/*
-Ask the user three multiple choice or T/F questions.
- function to Keep track of how many they get right & loop
-print Score
 */
public class InteractiveQuiz {
    private static String indent(String i) {
        return(i.replaceAll("(?m)^", "\t"));
    }

    public static void main(String[] args) {
        // Variables
        int score = 0;
        String qOne = " 1) American \n 2) Swedish \n 3) Crepes \n 4) All of them!";
        String trueFalse = " 1) True \n 2) False";
        String takeQuiz = "N";
        // Scanner Start
        Scanner input = new Scanner(System.in);
        // Quiz start
        do {
            System.out.print("Take quiz? Y/N: ");
            takeQuiz = input.next(); //next instead of nextLine
            takeQuiz = takeQuiz.toUpperCase();
            if (takeQuiz.equals("Y")) { //equals is a method of string class. checks if the string in the variable and in the params equals. if yes return true
                System.out.println("Q1 which pancake is superior?");
                System.out.println(indent(qOne));
                System.out.print("Answer: ");
                int ansOne = input.nextInt();
                input.nextLine();
                if (ansOne == 2) {
                    score++;
                } else {
                }
                System.out.println("Q2 Lexi is the funniest person in the world?");
                System.out.println(trueFalse);
                System.out.print("Answer: ");
                int ansTwo = input.nextInt();
                input.nextLine();
                if (ansTwo == 1) {
                    score++;
                } else {
                }
                System.out.println("Q3 Coding is fun?");
                System.out.println(trueFalse);
                System.out.print("Answer: ");
                int ansThree = input.nextInt();
                input.nextLine();
                if (ansThree == 1) {
                    score++;
                } else {
                }
                System.out.println("Score: " + (score) + "/3");
                score = 0;
            } else {
            }
        } while (!takeQuiz.equals("N"));
        //if takequiz is equals to N loop is finished

        //nothing left to do. say good bye and end the program
        System.out.println("Goodbye!");

        // Scanner Close
        input.close();
    }
}
