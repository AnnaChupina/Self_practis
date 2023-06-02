package wednesday;

import java.util.Scanner;

/*
1️⃣ Numbers-  Odd or even:
Write  a method which can identify given number is even or odd
Output ex:
identify(5); ->"Odd"
identify(6); ->"Even"

2️⃣ NDivide without / operator:umbers -
Write a method that can divide two numbers without using division operator

3️⃣ FINRA:
Write a function which prints out the numbers from 1 to 30 but for numbers which
are a multiple of 3, print "FIN" instead of the number and for numbers which are a multiple of 5,
print "RA" instead of the number. For numbers which are a multiple of both 3 and 5, print "FINRA" instead of the number.
 */
public class javaClass {

    public static void identify (int num){
        if(num%2 == 0){
            System.out.println(num + " is even");
        } else if(num%2==1){
            System.out.println(num + " is odd");
        }
    }

    public static void NDivide( int n1, int n2){
        int result = 0;
        int n = n1;
        while (n1>=n2){
                n1=n1-n2;
                result++;
        }
        System.out.println(n + " divide on " + n2 + " is " + result);
    }

    public static void NDivide2( int n1, int n2){
        if (n1 ==0 || n2 ==0){  // ensure that it can noot be divided by zero
            throw new ArithmeticException();
        }
        int sign = (n1 <0) || (n2 < 0) ? -1 : 1;

        int n = n1;
        n1 = Math.abs(n1);
        n2 = Math.abs(n2);

        int result = 0;

        while (n1>=n2){
            n1=n1-n2;
            result++;
        }
        System.out.println(n + " divide on " + n2 + " is " + result*sign);
    }

    public static void FINRA(){
        for (int i = 1; i <=30 ; i++) {
            if(i%3==0 && i%5==0){
                System.out.print("FINRA");
            } else if(i%3 ==0){
                System.out.print("FIN");
            }else if(i%5==0){
                System.out.print("RA");
            } else{
                System.out.print(i);
            }
        }
    }
    public static void swiping (int num1, int num2){
        System.out.println("num1 = "+ num1 + ", num2 = "+num2);
        num1=num1+num2;
        num2=num1-num2;
        num1=num1-num2;
        System.out.println("Now: num1 = "+ num1 + ", num2 = "+num2);

    }

    public static void Divisible3_5_15(int a){
        String divisibleBy15 = "divisibleBy15: ";
        String divisibleBy5 = "divisibleBy5: ";
        String divisibleBy3 = "divisibleBy3: ";

        for (int i = 1; i <= a; i++) {
            if(i%15==0){
                divisibleBy15 +=" " + i;
            }else if(i%3==0){
                divisibleBy3 +=" " + i;
            }else if(i%5 == 0){
                divisibleBy5 +=" " + i;
            }
        }
        System.out.println(divisibleBy15);
        System.out.println(divisibleBy5);
        System.out.println(divisibleBy3);
    }
    public static void Codility(int n ){
        for (int i = 1; i <=n ; i++) {
            if(i%2==0 && i%3==0 && i%5==0){
                System.out.println("CodilityTestCoders");
            } else if(i%2 == 0 && i%3 == 0){
                System.out.println("CodilityTest");
            }else if(i%2==0){
                System.out.println("Codility");
            }else if(i%3==0){
                System.out.println("Test");
            }else if(i%5==0){
                System.out.print("Coders");
            } else{
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {

        identify(9);
        NDivide(-20,5);
        NDivide2(-20, 5);
        FINRA();

        System.out.println("--------------------------");

        int a = 3;
        int b = 8;
        System.out.println("a=" + a + ", b=" + b);
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("a=" + a + ", b=" + b);
        System.out.println(a);
        swiping(3,8);
        Divisible3_5_15(100);
        Codility(24);
        

        
        









    }

}
