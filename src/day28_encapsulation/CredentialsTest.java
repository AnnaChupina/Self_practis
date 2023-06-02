package day28_encapsulation;

public class CredentialsTest {
    public static void main(String[] args) {

        Credentials credentials1 = new Credentials( "AnnaChupina", "30222112271");
        System.out.println(credentials1);

        System.out.println(credentials1.isStrongPassword());


        Credentials credentials2 = new Credentials( "AnnaChupina", "3071");
        System.out.println(credentials2);

        System.out.println(credentials2.isStrongPassword());

    }
}


/* if (!(isStrongPassword())){
            System.out.println("password MUST be a strong password");
            System.exit(1);
        }
 */