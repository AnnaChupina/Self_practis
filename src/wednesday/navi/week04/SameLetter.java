package wednesday.navi.week04;

import java.util.Arrays;
import java.util.Collections;

public class SameLetter {
    public  static boolean sameLetters(String str1, String str2){

        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        //white space
        str1 = str1.replaceAll("\\s", "");
        str2 = str2.replaceAll("\\s", "");

        // check the length of the str of the same

        if(str1.length() == str2.length()){
            return false;
        }
        // convert the string to char Arraay
        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();

        //Sort the character array
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        return Arrays.equals(charArray1,charArray2);
    }

    public static void main(String[] args) {
        System.out.println(sameLetters("ABD", "ABD"));
    }

}
