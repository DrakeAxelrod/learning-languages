import java.util.Scanner;

public class Input {
    private static Scanner s = new Scanner(System.in);
    private static Input instance = null;

    private Input(){}

    public static Input getInstance(){
        if(instance == null){
            return instance = new Input();
        } else {
            return instance;
        }
    }

    public String getInput(String str){
        System.out.print(str);
        return s.nextLine();
    }
}
