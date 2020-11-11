package app.user;

public class User {
    private int userID;
    private int increment = 1;
    private String username;
    private String password;
    
    public User(String username, String password){
        this.userID = increment;
        this.username = username;
        this.password = password;
        increment++;
    }

    public String getUsername()
    {
        return this.username;
    }
    public String getPassword()
    {
        return this.password;
    }
}
