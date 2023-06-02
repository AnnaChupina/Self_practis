package day21_multiDimentionalArray;

import java.util.Arrays;

public class drink {

    public static void main(String[] args) {

        String[][] items = {
                {"Apple", "Banana", "Grape", "Avocado"},
                {"Paper Towels", "Toilet Papers", "Tissues", "Diapers"},
                {"Coke", "Fanta", "Arizona Tea", "Pepsi", "Water"}
        };

        for (String[] eachOf3 : items) {

            String str = "";
            for (String each : eachOf3) {
                str += each + "\t";
            }
            str=str.trim();
            System.out.println(str);

        }
        System.out.println("----------------------");
        for (String[] each : items) {
            String str = "";
            for (int i = each.length - 1; i >= 0; i--) {
                str+= each[i] + "\t ";
            }
            str= str.trim();
            System.out.println(str);
        }
        System.out.println("----------------------");
        for (int i = items.length - 1; i >= 0; i--) {
            String str = "";
            for (String each : items[i]) {
                str +=each + "\t";
            }
            System.out.println(str);
        }


    }
}
/*
2. Given the Array:
		String[][] items = {
					{"Apple", "Banana", "Grape", "Avocado"},
					{"Paper Towels", "Toilet Papers", "Tissues", "Diapers"},
					{"Coke", "Fanta", "Arizona Tea", "Pepsi", "Water"}
					};

		1. print the following output: (add \t between two words)
				Apple    Banana   Grape    Avocado
				Paper Towels     Toilet Papers   Tissues    Diapers
				Coke   Fanta   Arizona Tea   Pepsi   Water

		2. print the following output: (add \t between two words)
				Avocado   Grape    Banana    Apple
				Diapers   Tissues   Toilet Papers   Paper Towels
				Water    Pepsi    Arizona Tea    Fanta   Coke

		3. print the following output: (add \t between two words)
				Coke   Fanta   Arizona Tea   Pepsi   Water
				Paper Towels     Toilet Papers   Tissues    Diapers
				Apple    Banana   Grape    Avocado

 */