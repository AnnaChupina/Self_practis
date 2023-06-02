package day05;

public class AgeGroups {

    public static void main(String[] args) {

        int age = 84;
        String group = "";

        if( age >=1 && age <=2) {
            group = "infant";
        }
        if ( age >=3 && age <=5) {
            group = "Toddler";
        }
        if( age >=6 && age <=9) {
            group = "Kid";
        }
        if ( age >=10 && age <=12) {
            group = "Pre-Teen";
        }
        if( age >=13 && age <=17) {
            group = "Teenager";
        }
        if ( age >=18 && age <=20) {
            group = "Young Adult";
        }
        if( age >=21 && age <= 39) {
            group = "Teenager";
        }
        if ( age >=40 && age <=49) {
            group = "Young Middle-Aged Adult";
        }
        if( age >=50 && age <=54) {
            group = "Middle-Aged Adult";
        }
        if ( age >=55 && age <=64) {
            group = "Very Young Senior Citizen";
        }
        if ( age >=65 && age <=74) {
            group = "Young Senior Citizen";
        }
        if( age >=75 && age <=84) {
            group = "Senior Citizen";
        }
        if ( age >=85) {
            group = "Old Senior Citizen";
        }




        System.out.println(group);
    }

}
/*Create a class named AgeGroups, an integer variable named age is declared and given. write a program that can define the age groups of a person

	             age groups are:
	                    infant (1 - 2)
	                    Toddler (3 - 5),
	                    Kid (6 - 9),
	                    Pre-Teen (10 - 12),
	                    Teenager (13 - 17),
	                    Young Adult (18 - 20),
	                    Adult (21 - 39),
	                    Young Middle-Aged Adult (40 - 49),
	                    Middle-Aged Adult (50 - 54),
	                    Very Young Senior Citizen (55 - 64),
	                    Young Senior Citizen (65 - 74),
	                    Senior Citizen (75 - 84),
	                    Old Senior Citizen (85+)

            Note: Do not use more than one print statement


 */