package sunday.march26;

import java.util.Arrays;

public class Countries {
    public static void main(String[] args) {

        String [] countries = {
                "Brazil", "China", "Cuba", "Sweden", "France", "Vietnam",
                "Albania", "Potugal", "Philippines", " Armenia", "Colombia",
                "Honduras", "Indonesia", "United States"
        };
        for (String country : countries ){  // country will be each element
            System.out.println(country.charAt(0) + " " + country.charAt(country.length()-1));  // country.toUpperCase(). charAt(counrty.length() - 1);
        }

        // Find the largest and smaller countries based on the length of their names

        String small = countries [0];
        String large = countries [0];

        for (String each : countries) {
           if( each.length() < small.length()){
               small = each;
           } else if(each.length() > large.length()){
               large = each;
           }

        }
        System.out.println("Smallest: " + small);
        System.out.println("Largest: " + large);


        System.out.println("---------------------------");
        // Show all the countries that  start with 'C"

        String hasC = "";

        for (int i = 0; i < countries.length; i++) {  // this loop iterates the array
            if(countries[i].startsWith("C")) { //if(countries[i].toLowerCase().startsWith("c")  )
                hasC += countries[i] + " ";
            }
        }
        System.out.println(hasC);

        String[] hasCArr = hasC.split(", ");
        System.out.println(Arrays.toString(hasCArr));

        System.out.println("------------------");
        // Show the countries names in alphabetical arder
        Arrays.sort(countries);
        System.out.println(Arrays.toString(countries));



    }

}
