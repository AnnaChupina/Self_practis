package day12;

import java.sql.SQLOutput;

public class tasks {
    public static void main(String[] args) {
        emailDomain("art@mail.com");
        capitalization("Anna", "Chupina");
        monthName(3);
        day(2);
        dayInMonth("MArCh");


    }

    public static void emailDomain(String email) {
        System.out.println("domain: " + email.substring(email.indexOf('@') + 1, email.indexOf('.')));
    /*    1. Create a method named emailDomain that can display the domain of the email
        Ex:
        emailDomain("Cydeo@gmail.com")

        output:
        domain: gmail

     */


    }

    public static void capitalization(String firstName, String lastName) {
        System.out.println(firstName.substring(0, 1).toUpperCase() + firstName.substring(1).toLowerCase() + " " +
                lastName.substring(0, 1) + lastName.substring(1).toLowerCase());
        /*
        2. Create a method named capitalization that can format the first and last names of the person and display the full name of the person
    Ex:
        capitalization("cyDeO", "sCHooL")

        output:
            full name: Cydeo School


         */
    }

    public static void monthName(int month) {

        String monthNamE = "Invalid Number";
        if (month > 0 && month <=12) {
            switch (month) {
                case 1:
                    monthNamE = "Jenuary";
                    break;
                case 2:
                    monthNamE = "February";
                    break;
                case 3:
                    monthNamE = "March";
                    break;
                case 4:
                    monthNamE = "April";
                    break;
                case 5:
                    monthNamE = "May";
                    break;
                case 6:
                    monthNamE = "Jine";
                    break;
                case 7:
                    monthNamE = "July";
                    break;
                case 8:
                    monthNamE = "August";
                    break;
                case 9:
                    monthNamE = "September";
                    break;
                case 10:
                    monthNamE = "October";
                    break;
                case 11:
                    monthNamE = "November";
                    break;
                default:
                    monthNamE = "December";
            }

        }
        System.out.println(monthNamE);

        /*
        3. Create a method named monthName that can display the name of the month based on the given number to the method, if the number is invalid, then the method should print the error message "Invalid Number"
    Ex:
        monthName(6)

        output:
            June
         */

    }
    public static void day(int day){
        String nameDay = "Invalid Number";
        if(day>=1&&day<=7){
            switch(day){
                case 1:
                    nameDay="Monday";
                    break;
                case 2:
                    nameDay="Tuesday";
                    break;
                case 3:
                    nameDay="Wednesday";
                    break;
                case 4:
                    nameDay="Thursday";
                    break;
                case 5:
                    nameDay="Friday";
                    break;
                case 6:
                    nameDay="Saturday";
                    break;
                default:
                    nameDay="Sunday";
            }

        }
        System.out.println(nameDay);
        /*
        4. Create a method named day that can display the name of the day based on the given number to the method, if the number is invalid, then the method should print the error message "Invalid Number"
    Ex:
        day(5)

        output:
            Friday

         */
    }
    public static void  dayInMonth(String month){
       month = month.substring(0,1).toUpperCase()+month.substring(1).toLowerCase();
       if (month.contains("February")){
           System.out.println(month + " has 28 days");
       }else if( month.contains("Jenuary") || month.contains("March") || month.contains("May") || month.contains("July") || month.contains("August") || month.contains("October") || month.contains("December")){
           System.out.println( month + " has 31 days");
       }else if(month.contains("February") || month.contains("April") || month.contains("June")||month.contains("September") || month.contains("November")) {
           System.out.println(month + " has 30 days");
       }else{
           System.out.println("Invalid name of month");
       }
       /*
       5. Create a method that can print how many days a month has
    Ex:
        month("jUNe")

        output:
            June has 30 days
        */
    }


}


/*


6. Create a method named eligibleToVote that takes two arguments:
        1. age (int)
        2. isAmerican (boolean)

    Then the method should determine if the person eligible to vote
        Ex:
            eligibleToVote(23, true)

        output:
            You are eligible to vote


7. Create a method named salary that takes two arguments:
        1. hourlyRate (double)
        2. weeklyHours (int)

    Then the method should display the salary of the person.
        Ex:
            salary(45, 40)

        output:
            You make $45.0 per hour
            You work 40 hours in a week
            Your gross income is $93600.0

 */