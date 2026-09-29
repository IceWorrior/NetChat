package info;

import java.util.Scanner;

import display.LoginScreen;

public class Credentials {
    
    public Credentials(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Username: ");
        String name = sc.next();
        LoginScreen.setUname(name);

        System.out.print("Password: ");
        String pass = sc.next();
        LoginScreen.setPassword(pass);
    }
    
}
