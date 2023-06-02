package day22_arrayList;

public class UpperOrLower {

    public static void main(String[] args) {

        String str = "JAVA java";
        int lower = 0;
        int upper = 0;

        for(char each : str.toCharArray()){
            if(Character.isUpperCase(each)){
                upper +=1;
            }else if(Character.isLowerCase(each)){
                lower +=1;
            }

        }
        if(upper == lower){
            System.out.println("True");
        }else{
            System.out.println("False");
        }


    }
}
/*

2. Write program that returns true if the total number of upper case characters are equal to total number of Lowercase characters of a string
        Ex:
            str = "JAVA java";

        output:
            true



 */