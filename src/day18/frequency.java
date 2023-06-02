package day18;

import java.util.Scanner;

public class frequency {
    public static void main(String[] args) {
        Scanner input=  new Scanner(System.in);
        System.out.println("Type a string: ");
        String str = input.nextLine();

        int max = 0;
       String result = "";
        for (int i = 0; i < str.length(); i++) {
            int amount = 0;
            char ch = str.charAt(i);
                for (int j = 0; j < str.length(); j++) {
                    if(str.charAt(j)==ch){
                        amount++;
                    }
                }
        if (amount > max && !(result.contains("" +ch))){
            result = "" + ch;
            max=amount;
        }else if(amount == max && !(result.contains("" +ch))){
            result += "" + ch;
            max=amount;
        }
        }
        for (int k = 0; k < result.length(); k++) {
            System.out.println(result.charAt(k));

        }
    }



}
/*
1. Write a program that can return the character that has the highest frequency from a string
	Ex:
		str = "aaabbccccddeeee"

		output:
			c
			e

 */