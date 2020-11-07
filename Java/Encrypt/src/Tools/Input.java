package Tools;

import java.util.Scanner;

public class Input {

    private static final Scanner s = new Scanner(System.in);

    private Input(){
    }
    private static Input instance = null;

    public static Input getInstance(){
        if (instance == null){
            return instance = new Input();
        } else {
            return instance;
        }
    }

    public String input(String str){
        System.out.print(str);
        String ans = s.nextLine();
        return ans;
    }




}
