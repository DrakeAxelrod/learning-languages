package front_end;


public class Menus
{
    private String title;
    private String[] items;
    private static Menus instance = null;
    private Input input = Input.getInstance();

    private Menus() {}

    public static Menus getInstance() 
    { 
        if (instance == null) 
            instance = new Menus(); 
  
        return instance; 
    } 

    public void teardown()
    {
        instance = null;
    }

    private Menus(String title, String[] items)
    {
        this.title = title;
        this.items = items;
    }

    private void printTitle()
    {
        input.print(">> %s <<%n", title);
    }

    private void printItems()
    {
        int i = 1;
        for (String str : items)
        {
            input.print(" %d) %s%n", i, str);
            i++;
        }
    }

    public void print()
    {
        printTitle();
        printItems();
    }

    public static void loginMenu() {
        String title = "Login Menu";
        String[] items = { "Login", "Register"};
        Menus m = new Menus(title, items);
        m.print();
    }

    public static void mainMenu() {
        String title = "Main Menu";
        String[] items = { "Game #1", "Game #2", "Game #3", "Game #4", "Game #5" };
        Menus m = new Menus(title, items);
        m.print();
    }
}
