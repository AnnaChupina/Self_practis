package day24_dateAndTime;

import java.util.ArrayList;
import java.util.Arrays;

public class Country {

    public static void main(String[] args) {

        ArrayList<String> countryNames = new ArrayList<>(Arrays.asList("Russia","Gvatemalla", "Domenican Republic"));

        countryNames.removeIf(p-> p.length()>=10);
        System.out.println(countryNames);

    }
}

/*
6. Create an ArrayList of string called country names, write a program that can remove all the country names that have length of 10 or greater


 */