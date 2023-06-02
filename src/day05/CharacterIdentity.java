package day05;

import java.util.Arrays;

public class CharacterIdentity {

    public static void main(String[] args) {
        char ch =63;
        if( ch > 32 && ch < 47 || ch > 58 && ch < 64) {
            System.out.println("special character");
        }
        if (ch > 48 && ch < 57 ) {
            System.out.println("digit");
        }
        if ( ch > 65 && ch<90 || ch>97 && ch <122) {
            System.out.println("Alphabetic Character");
        }

    }

}
/*
Create a class named CharacterIdentity, and write a program that can identify if the given character is a digit or Alphabetic Character(A~Z or a~Z) or a special character

		Ex:
			ch = '@'

		output:
			Special Character


			ch = '1'

		output:
			digit

		HINT: You may wanna check out the numbers of the chracters on ASCII table

 */