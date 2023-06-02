package sunday.march26;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Months {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("Hello, enter the month number 1 ~ 12");
        int month = input.nextInt();
        input.close();

        if(month >= 1 && month <= 12){
            String [] data = { "Jenuary", "Fenruary", "March", "April", "May", "June", "July" , "August", "September",
                    "October", "November", "December"};

            System.out.println(data [month-1]);

        }else {
            System.out.println("Sorry " + + month + " is not a valid month number");
        }
    }
}
