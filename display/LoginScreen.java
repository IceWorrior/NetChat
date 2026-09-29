package display;

import info.Credentials;

public class LoginScreen {
    
    private static String uname;
    private static String password;

    static void loginDisplay(){
        System.out.println("Enter details:");
        new Credentials();
    }

    public static void setUname(String uname){
        LoginScreen.uname = uname;
    }
    public static void setPassword(String password){
        LoginScreen.password = password;
    }

    public static String getUname(){
        return uname;
    }
    public static String getPassword(){
        return password;
    }

    public LoginScreen(){
        loginDisplay();
    }

}
