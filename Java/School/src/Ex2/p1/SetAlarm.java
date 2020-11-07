package Ex2.p1;

public class SetAlarm {
      public static boolean setAlarmTwo(boolean employed, boolean vacation) {

        if (employed == true && vacation == true) {
            return false;
        } else if (employed == false && vacation == false) {
            return false;
        } else if (employed == false && vacation == true) {
            return false;
        } else {
            return true;
        }
    }
        public static void main (String[]args){

            setAlarmTwo(true,true);

                    System.out.println("setAlarm(true,true)"+setAlarmTwo(true,true));

                    System.out.println("setAlarm(false,true)"+setAlarmTwo(false,true));

                    System.out.println("setAlarm(false,flase)"+setAlarmTwo(false,false));

                    System.out.println("setAlarm(true,false)"+setAlarmTwo(true,false));

        }
    }

    // import java.util.Scanner;

// public class setAlarm {
//     public static void main(String[] args) {

//         Scanner input = new Scanner(System.in);
//         System.out.print("Are you employed? Y/N: ");
//         String employedAnswer = input.nextLine();
//         System.out.print("Are you on vacation? Y/N: ");
//         String vacationAnswer = input.nextLine();
//         boolean employed = false;
//         boolean vacation = false;
//         checks employment status

//         if (employedAnswer.equals("Y")) {
//             employed = true;
//         }
//         if (vacationAnswer.equals("Y")) {
//             vacation = true;
//         }

//         if (employed == true && vacation == false){
//             System.out.print("Yes you should probably set an Alarm!");
//         } else {
//             System.out.print("Yay! No alarm for you! :)");
//         }
//         input.close();
//     }
// }

// Comment = CTRL(COMMAND) +K+C AND CTRL(COMMAND +K+U to remove

// import java.util.*;

// public class setAlarm {
//     public static void main (String[] args) {
//         // Start scanner
//         Scanner input = new Scanner(System.in);
//         // User input
//         System.out.println("Are you employed T/F?: ");
//         String eStat = input.nextLine();
//         eStat = eStat.toUpperCase();
//         System.out.println("Are you on vacation T/F?: ");
//         String vStat = input.nextLine();
//         vStat = vStat.toUpperCase();
//         // Determining validity of an alarm
        
//         // I Added Quotes "" on T and F here. 
//         if (eStat.equals("T") && (vStat.equals("F"))) {
//             System.out.println("You should set your alarm!");
//         } else {
//             System.out.println("You do not need to set an alarm!");
//         }
//         // Close scanner
//         input.close();
//     }
// }

// import java.util.Scanner;
// public class Ex3 {
    /*
setAlarm(true, true)   →  false
setAlarm(false, true)  →  false
setAlarm(false, false) →  false
setAlarm(true, false)  →  true
     */
/*
setAlarm: Write a function named setAlarm which receives two parameters. 
The first parameter, employed, is true whenever you are
employed and false otherwise. The second parameter, vacation is true 
whenever you are on vacation, and false otherwise.
The function should return true if you are employed 
and not on vacation (because these are the circumstances 
under which you needto set an alarm). 
It should return false otherwise.

*/