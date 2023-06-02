package day24_dateAndTime;
import java.time.LocalDate;

public class birstYear {

    public static void main(String[] args) {

        int by = 1987;

        System.out.println(by + " - is leap = " + leap(by));

    }
    public static boolean leap (int year){
        LocalDate birthYear = LocalDate.of(year,1,1 );

        return birthYear.isLeapYear();
    }


}
/*
. Create a function that accepts an int argument birthYear, return true if the person was born on leap year, otherwise return false



 */