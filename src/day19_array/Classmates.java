package day19_array;

import java.util.Arrays;

public class Classmates {
    public static void main(String[] args) {
        String [] classMat = {"Camilo Rojas", "Ekaterina Tsaregorodtceva", "Shinay Zahir", "Anna Chupina", "Natalia Shulga",
                "Emir Ayral", "Simona Petrovich", "Atman Raboua", "Sezgin Erdogan", "Larbi Azour"};

        for (int i = 0; i < classMat.length; i++) {
            String a = "";
            for (int j = 0; j < classMat[i].length(); j++) {

                if(classMat[i].charAt(j)>= 'A' && classMat[i].charAt(j)<= 'Z'){
                    a += " "+classMat[i].charAt(j);

                }

            }System.out.println(a);


        }
        System.out.println(Arrays.toString(classMat));
/*
1. create an array named classmates, and store 10 of your classmates' full names
            print the initials of each classmates in separate lines

 */
        for (int i = 0; i < classMat.length; i++) {
            String revers = "";
            for (int j = classMat[i].length()-1; j >=0; j--) {
             revers +=""+classMat[i].charAt(j);
            }
            System.out.println(revers);
        }
/*
2. create string array, and store the names of your  class mates (10)
            reverse each students names and print them in separate lines
            	ex:
            		arr = {java, python, c#}

        		output:
        			avaJ
        			nohtyp
        			#c
 */
        System.out.println("------------------------------");

        String[] items  = {"Shoes", "Jacket",  "Gloves", "AirPods", "iPad", "iPhone 12 case" };
        double[] prices = {99.99,      150.0,  9.99,     250.0 ,    439.50,  39.99};
        int[] itemIDs =   {12345 ,     12346,  12347,    12348,     12349,    12350};

        for (int i = 0; i < items.length; i++) {
            if ( items[i].contains("Gloves")){
              System.out.println(i);
            }
            if ( items[i].contains("iPad")){
                System.out.println(true);
            }

            System.out.println(items[i] + " " + prices[i] +" "+ itemIDs[i]);

        }


    }
}
/*
3. Given the following arrays:
        String[] items  = {"Shoes", "Jacket",  "Gloves", "AirPods", "iPad", "iPhone 12 case" };
        double[] prices = {99.99,      150.0,  9.99,     250.0 ,    439.50,  39.99};
        int[] itemIDs =   {12345 ,     12346,  12347,    12348,     12349,    12350};


        1. find out the first index number of "Gloves"

        2. find out if "iPad" is contained in the item list

        3. Print the report of each shopping item
            name - price - #ID
 */