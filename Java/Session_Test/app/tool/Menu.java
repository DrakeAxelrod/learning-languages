package app.tool;

public class Menu 
{
    private String title;
    private String options[];
    private Tool tool = Tool.getInstance();

    public Menu(String title, String[] options)
    {
        this.title = title;
        this.options = options;
    }

    private void printTitle(Menu menu)
    {
        System.out.println(">> " + menu.title);
    }

    private void printOptions(Menu menu)
    {
        int i = 1;
        for (String option : options)
        {
            System.out.println(" " + i + ") " + option);
            i++;
        }
    }

    public String printMenu(Menu menu)
    {
        printTitle(menu);
        printOptions(menu);
        return tool.getString("Choice: ");
    }

}
