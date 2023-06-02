package day15;

import java.rmi.ServerError;
import java.util.Scanner;

public class loginFunction {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String username = "";
        String password = "";

        System.out.println("Enter your username: ");
        username = input.nextLine();
        System.out.println("Enter your password: ");
        password = input.nextLine();

        if ( (username.equals("Cydeo") &&  password.equals( "Cydeo123")) ){
            System.out.println("Logged in.");
        }else{

        for (int i = 1; i < 3; i++) {  // 0,1,2

                if (i!=2){
                    System.err.println("Incorrect. Try again");
                }else {
                    System.err.println("This is your last attempt, please re-enter");
                }
                System.out.println("Enter your username: ");
                username = input.nextLine();
                System.out.println("Enter your password: ");
                password = input.nextLine();

                if ( (username.equals("Cydeo") &&  password.equals( "Cydeo123")) ){
                    System.out.println("Logged in.");
                    break;


            }

        }
        if ( !(username.equals("Cydeo") &&  password.equals( "Cydeo123")) )
             System.out.println("Your account is lucked.");

        input.close();

    }}
}
/*
7. you are writing a code for the log-in function of the Cydeo Application, assume that your credentials are:
                    username: Cydeo
                    password: Cydeo123

        Ask the user to enter their credentials.
                If credentials are matched, your program should print "Logged in."
                If the credentials are not matched, the program should allow the user to have
                three attempts to enter correct credentials and if all three attempts are failed,
                then print "Your account is lucked."

 */