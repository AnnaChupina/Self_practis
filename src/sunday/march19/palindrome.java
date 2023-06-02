package sunday.march19;

public class palindrome {

    /*public static boolean  idPolindrome(String str){ // racecar

        for(int begin =0, end = str.length()-1; begin < str.length()/ 2; begin++, end--){ // or end > str.length()/2
        if(str.charAt(begin)  != str.charAt(end))} //   the characters is different
        return false;
                }
                }
                return true;
                }
public ststic void main (String[] args){

        }
}
*/

public static boolean isPolindrome3(String str){

 String reverse = "";
    for (int i =str.length()-1; i>=0; i--){
        reverse += str.charAt(i);
    }
    return str.equals(reverse);


}
}