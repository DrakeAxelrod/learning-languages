package exceptions;

public class InvalidInputException extends Exception {
    public InvalidInputException(){
        super("invalid input");
    }
    public InvalidInputException(String message){
        super(message);
    }

}
