package day09;
import java.util.Scanner;

public class input_output {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter first number:");
        int num1 = input.nextInt();

        System.out.println("Enter second number:");
        int num2 = input.nextInt();

        System.out.println("Enter third number:");
        int num3 = input.nextInt();

        input.close();
        int result = 1;

        if (num1 > num2) {
            if (num2 > num3) {
                result = num2;
            } else if (num3 > num1) {
                result = num1;
            } else {
                result = num3;
            }

        }else if(num1>num3){
            result = num1;
        }else{result = num3;}

        System.out.println(result);
    }
}
