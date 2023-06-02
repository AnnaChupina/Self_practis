package ZoomClass;

public class JavaTecnical_Q {
    public static void main(String[] args) {
        System.out.println("\'");
        // 2. Print statement:
       //System.out.print


        // 3. Print method that starts with new line:
        System.out.println("S\"");
        // 4. Single line comment: => //

        // 5. Multi line comment:

        /*

         */
        // 6. How to do horizontal tab: \t

        // 7. how to print backslash: \\

        // 8. How to print double quote: \" \" ("\"S"");

        // 9. How to declare a variable: DataType VariableName = Date;

        // 10. Declare int variable: int name;

        // 11. String: String nameStr;

        // 12. int variable called myNum of type int and assign it the value 15: My number:
        int myNum = 15;

        // 13. Declare a variable without assigneng the value, and assign the value later:
        int age ;
        age = 20;

        // Change the value og myNum;
        myNum = 20;

        // float variable with value  of 5.99
        float number = 5.99F;

        //  Char variable:
        char letter = 'D';

        // boolean variable = true;

        boolean value =true;

        // Create a syntax that print "Hello"
        String word = "Hello";

        char c;
        System.out.println("default char = " + '\u0000');
        /*
        Defalt value:
        - int => 0
        - long => 0l;
        - double => 0.0;
        - boolean => false;
        - String => null;
        - chat => '\u0000';
        - float => 0.0f;
        - byte => 0;

         */

        // Concatenation
        String firstName = "John";
        String lastName = "Boe";
        System.out.println(firstName + " " + lastName);

        System.out.println("Hey, go next!");

        // call full name to combine first and last name;
        // String fullName = firstName + lastName;

        // create int variable 5 and 6, then add them together;
        int num1 = 5;
        int num2 = 6;
        int together = num1 + num2;
        System.out.println(together);

        // declare multiple int variable at the same line: x= 5, y=6, z=50, and their sum
        int x1 = 5, y = 6, z = 50;
        int sum = x1 + y + z;
        System.out.println(sum);
        System.out.println(x1 + y + z);

        // assign the same value 50 the multiple variables in one line: a, b, m
        // int a = b = c = 50; wrong
        int a, b, m;
        a = b = m = 50;

        // reassign the variables
        int n1 = 43;
        int n2 = 135;
        n1= n2;


        // Explicit casting: - from larger to smaller
        double myDouble = 9.78;
        int myInt = (int)myDouble;
        System.out.println(myInt);

        // implicit casting - from smaller to larger
        int d = 9;
        double v = d;
        System.out.println(v);

        int x2 = 9 / 3 + 20 * 4 - 2;  // Brackets -> deviding -> multiplication -> addition -> substraction
        //        3   +    80  -  2
        System.out.println(x2);

        double x = 9/(7+20)*3 - 2;
        //         9 / 27 * 3 - 2
        //         0.33  * 3
        System.out.println(9 / 27 * 3);
        System.out.println(x);
        System.out.println( (7+20)/9*3-2);
        System.out.println(9/(7+20));
        System.out.println(9/10);

        // next!

        // logical operators









    }
}
