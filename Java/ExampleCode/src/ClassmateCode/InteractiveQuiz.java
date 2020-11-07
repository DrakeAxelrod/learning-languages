package ClassmateCode;

import java.util.*;

class InteractiveQuiz {
  public static void main(String[] args) {
    quiz();
  }

  private static String indent(String a) {
    return(a.replaceAll("(?m)^", "\t"));
  }

  private static void quiz() {
    Scanner scan = new Scanner(System.in);
    String answer = "N";
    String answerOne = "1. Helsinki\n2. Stockholm\n3. Copenhagen";
    String answerTwo = "1. Two\n2. Five\n3. Zero";
    String answerThree = "1. Baby\n2. Don't\n3. Hurt\n4. Me";
    int score = 0;

    System.out.println("Are you ready for a quiz?");
    answer = scan.next();

    if(answer.equals("N")) {
      System.out.println("Please get ready and run me again!");
      System.exit(0);
    } else {
      while(true){
      score = 0;

      if (answer.equals("Y")) {
        System.out.println("Okay, here it comes! \n \n");
        System.out.println("Q1) What is the name of the capital of Sweden?");
        System.out.println(indent(answerOne));
        answer = scan.next();
        if(answer.equals("2")) {
          System.out.println("Correct! Nice!\n \n");
          score++;
        } else {
          System.out.println("Wrong! \n \n");
        }
        System.out.println("Current score is: " + score + "\n \n");
        System.out.println("Q2) How many fingers do you have on your left foot?");
        System.out.println(indent(answerTwo));
        answer = scan.next();
        if(answer.equals("3")) {
          System.out.println("Correct! Nice!\n \n");
          score++;
        } else {
          System.out.println("Wrong! \n \n");
        }
        System.out.println("Current score is: " + score + "\n \n");
        System.out.println("Q3) What is love?");
        System.out.println(indent(answerThree));
        answer = scan.next();
        System.out.println("Correct! Nice!\n \n");
        score++;
        System.out.println("Final score is " + score + "!! Thanks for playing. Would you like to go again?");
        answer = scan.next();
        if(answer.equals("N")) {
          System.exit(0);
        }
      }
      }
    }
    System.out.println("You entered something I cannot understand. Please run me again, and enter Y for yes, N for no.");

    }
  }
