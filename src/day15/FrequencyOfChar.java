package day15;

import java.util.Scanner;

public class FrequencyOfChar {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a string");
        String str = input.nextLine().toLowerCase();

        System.out.println("Enter a char");
        char ch = input.next().toLowerCase().charAt(0);

        int result = 0;

        for (int i = 0; i < str.length(); i++) {
        if (ch == str.charAt(i)){
            result +=1;
        }
        }
        System.out.println(result);

        input.close();
    }
}
