package front_end;

import java.util.Scanner;

public class Input 
{
    private static Input instance = null;
    private static final Scanner sc = new Scanner(System.in);

    private Input(){}
    
    public static Input getInstance() 
    {
        if (instance == null) {
            instance = new Input();
        }
        return instance;
    }

    public String getString(String format, Object ... args)
    {
        print(format, args);
        String tmp = sc.nextLine();
        return tmp;
    }

    public int getInt(String format, Object ... args)
    {
        print(format, args);
        int tmp = sc.nextInt();
        return tmp;
    }

    public void print(String format, Object ... args)
    {
        System.out.printf(format, args);
    }

    public static void close()
    {
        sc.close();
    }
    
}
