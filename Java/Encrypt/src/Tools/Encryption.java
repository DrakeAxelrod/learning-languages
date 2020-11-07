package Tools;


public class Encryption {
    private Input tools = Input.getInstance();

    private Encryption(){
    }
    private static Encryption instance = null;

    public static Encryption getInstance(){
        if (instance == null){
            return instance = new Encryption();
        } else {
            return instance;
        }
    }

    public String rot13(String message){
        String str = tools.input(message);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if       (c >= 'a' && c <= 'm') c += 13;
            else if  (c >= 'A' && c <= 'M') c += 13;
            else if  (c >= 'n' && c <= 'z') c -= 13;
            else if  (c >= 'N' && c <= 'Z') c -= 13;
            sb.append(c);
        }
        return sb.toString();
    }


}