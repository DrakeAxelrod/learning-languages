import controller.DartController;
import tools.Input;

public class DartMain {
    private static final String WELCOME_MESSAGE = Input.EOL + Input.ANSI_BLUE + "Welcome to DART, your good old game rental system. The competition has no steam to keep up!" + Input.EOL;

    public static void main(String[] args){
        Input input = Input.getInstance();
        input.slowPrint(WELCOME_MESSAGE);
        DartController start = new DartController();
        start.run();
    }
}