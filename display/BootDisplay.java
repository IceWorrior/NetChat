package display;

import java.util.Scanner;

public class BootDisplay {
    
    private static final int LineLen = 30;

    static void printLine(){
        for(int i=0;i<LineLen;i++){
            System.out.print("=");
        }
        System.out.println();
    }

    static String printSpace(){
        String space = "";
        for(int i=0;i<5;i++){
            space += " ";
        }
        return space;
    }

    static void Title(){
        System.out.println(printSpace()+ "@"+   "      @"+printSpace()+"@@@@@@");
        System.out.println(printSpace()+ "@"+" @"+"    @"+printSpace()+"@");
        System.out.println(printSpace()+ "@"+"  @"+"   @"+printSpace()+"@");
        System.out.println(printSpace()+ "@"+"   @"+"  @"+printSpace()+"@");
        System.out.println(printSpace()+ "@"+"    @"+" @"+printSpace()+"@");
        System.out.println(printSpace()+ "@"+"      "+"@"+printSpace()+"@@@@@@");
    }

    static void MadeBy(){
        System.out.println(printSpace()+printSpace()+printSpace()+"--Saksham kumar");
    }

    static void AskLogin(){
        System.out.println("Enter to continue.........");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        if(input.isEmpty()){
            System.out.print("\033[H\033[2J");
            System.out.flush();
            new LoginScreen();
        }

    }

    public BootDisplay(){

        printLine();
        Title();
        printLine();
        MadeBy();
        AskLogin();
        
    }

}
