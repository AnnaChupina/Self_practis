package wednesday.navi.week05;

import day22_arrayList.UpperOrLower;

import java.lang.reflect.Array;

public class PasswordValidation {
    public static boolean PasswordValidations(String password){
        int lowerCase = 0;
        int digit = 0;
        int upperCase = 0;
        int specSimbol = 0;
        char[] arr = password.toCharArray();
        if(password.length()<6){
            return false;
        }else{
            for (int i = 0; i < arr.length; i++) {
                if ( arr[i]==' ') {
                    return false;

                } else if (Character.isDigit(arr[i])){
                    digit++;
                }else if( arr[i]>='a'&&arr[i]<='z'){
                    lowerCase++;
                }else if(arr[i]>='A'&&arr[i]<='Z'){
                    upperCase++;
                }else if(!Character.isLetterOrDigit(arr[i])){
                    specSimbol++;
                }
            }


        }
        return  digit!=0 && lowerCase!=0 && upperCase!=0 && specSimbol!=0;
    }

    public static void main(String[] args) {
        System.out.println("PasswordValidations(\"123456\") = " + PasswordValidations("123456"));
        System.out.println("PasswordValidations(\"12345d\") = " + PasswordValidations("12345d"));
        System.out.println("PasswordValidations(\"aaaa!4\") = " + PasswordValidations("aaaa!4"));
        System.out.println("PasswordValidations(\"aaaA!4\") = " + PasswordValidations("aaaA!4"));
        System.out.println("PasswordValidations(\"@#><$\") = " + PasswordValidations("@#><$"));
    }
}
