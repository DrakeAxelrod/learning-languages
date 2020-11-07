import java.util.Scanner;

public class Tool {
    public static final Scanner s = new Scanner(System.in);
    public static Tool instance = null;

    private Tool(){
    }

    public static Tool getInstance(){
        if(instance == null){
            return instance = new Tool();
        } else {
            return instance;
        }
    }

    public String input(String str){
        System.out.println(str);
        return s.nextLine();
    }
}
