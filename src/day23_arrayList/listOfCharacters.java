package day23_arrayList;
/*
7. Write a program that can extract the special characters, digits and letters from a string and stores them into separate ArrayLists of Characters
                Ex:
                    str = "ABCD123$%#@&456EFG!"

                output:
                    list1: {1, 2, 3, 4, 5, 6}
                    list2: {A, B, C, D, E, F, G}
                    list3: {$, %, #, @, &, !}
 */
import java.util.ArrayList;

public class listOfCharacters {
    public static void main(String[] args) {

        String str = "ABCD123$%#@&456EFG!";
        ArrayList<Character> digits = new ArrayList<>();
        ArrayList<Character> spec = new ArrayList<>();
        ArrayList<Character> letters = new ArrayList<>();

        for( char each : str.toCharArray()){
            if(Character.isDigit(each)){
                digits.add(each);
            }
            if(Character.isLetter(each)){
                letters.add(each);
            }
            if(!Character.isLetterOrDigit(each)){
                spec.add(each);
            }
        }
        System.out.println("digits: " + digits);
        System.out.println("Letters: " + letters);
        System.out.println("Spec: " + spec);


    }
}
