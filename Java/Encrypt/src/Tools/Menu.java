package Tools;

public class Menu {
    private String title;
    private String[] options;
    private String choice;
    private Input tools = Input.getInstance();

    public Menu(String title, String[] options){
        this.title = ">> " + title + " <<";
        this.options = options;
        this.choice = ">> Choice: " ;
    }

    private void printTitle(Menu menu){
        System.out.println(menu.title);
    }

    private void printOptions(Menu menu){
        int i = 1;
        for (String str : menu.options){
            System.out.println(" " + i + ") " + str);
            i++;
        }
    }

    private String printChoice(Menu menu){
        return tools.input(menu.choice);
    }



    public String printMenu(Menu menu){
        printTitle(menu);
        printOptions(menu);
        return printChoice(menu);
    }
}
