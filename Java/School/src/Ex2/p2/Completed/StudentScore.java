package Ex2.p2.Completed;
import java.sql.SQLOutput;
import java.util.*;

public class StudentScore {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int topScore = 0;
        String name = "";
        System.out.print("Enter a number of students: ");
        int n = input.nextInt();
        input.nextLine();
        for (int i = 0; i < n; i++){
            System.out.print("Name: ");
            String sName = input.nextLine();
            System.out.print("Score: ");
            int score = input.nextInt();
            input.nextLine();
            while(topScore < score){
                topScore = score;
                name = sName;
            }
        }
        System.out.print(name + " " + topScore);
    }
}

//    Write a program that prompts the user to enter the number of students
//    and each student's name and score, and finally displays the name
//    of the student with the highest score.
