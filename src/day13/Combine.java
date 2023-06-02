package day13;

public class Combine {
    public static void main(String[] args) {

        String str1 = "one";
        String str2 = "eight";

        if(str1.charAt(str1.length()-1)==str2.charAt(0)){
            str1+=str2.substring(1);
        }else{
            str1+=str2;
        }
        System.out.println(str1);

    }
}
/*
5.  Create a method named combine that can take two string and hen add them together and returns it.
        But if the last letter of the first word and the first letter of the last letter are the same, return that character once.
    Ex:
        combine("one", "eight")  ==> oneight


 */