package app.tool;

import java.util.Scanner;

public class Tool
{
    private static final Scanner s = new Scanner(System.in);
    private static Tool instance = null;

    private Tool(){}

    public static Tool getInstance()
    {
        if (instance == null)
        {
            return new Tool();
        }
        else
        {
            return instance;
        }
    }

    public void teardown()
    {
        instance = null;
    }

    public String getString(String str)
    {
        System.out.print(str);
        return s.nextLine();
    }

    public int getInt(String str)
    {
        System.out.print(str);
        return s.nextInt();
    }

    public double getDouble(String str)
    {
        System.out.print(str);
        return s.nextDouble();
    }

}