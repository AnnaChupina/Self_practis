package day17;

import org.w3c.dom.ls.LSOutput;

public class SalaryCalculator {
    public double hourlyRate;
    public double stateTaxRate;
    public double federalTaxRate;
    public int weeklyHours;

    public void setInfo(double hourlyRate, double stateTaxRate, double federalTaxRate, int weeklyHours) {
        this.hourlyRate = hourlyRate;
        this.stateTaxRate = stateTaxRate;
        this.federalTaxRate = federalTaxRate;
        this.weeklyHours = weeklyHours;
    }

    public double salary(){
       double salary = ( hourlyRate * weeklyHours * 52);
               return salary;
    }
    public double stateTax(){
        double stateTax = (salary() * stateTaxRate)/100;
        return stateTax;
    }
    public double federalTax(){
        double federalTax = (salary() *federalTaxRate)/100;
        return federalTax;
    }
    public double salaryAfterTax(){
        double salaryAfterTax = salary() - stateTax() - federalTax();
        return salaryAfterTax;
    }


    public String toString() {
        return "SalaryCalculator{" +
                "Salary=" + salary() +
                ", stateTax=" + stateTax() +
                ", federalTax=" + federalTax() +
                ", salaryAfterTax=" + salaryAfterTax() +
                '}';
    }

    public static void main(String[] args) {
        SalaryCalculator s1 = new SalaryCalculator();
        s1.setInfo(45, 6,8,40 );
        System.out.println(s1);
    }

}
/*
4. Create a custom class named SalaryCalculator
        Attributes:
            hourlyRate, stateTaxRate, federalTaxRate, weeklyHours

            (stateTaxRate and federalTaxRate will be given as percentage, you will responsible for converting them to decimals)

        Actions:
            setInfo(): sets all the fields of SalaryCalculator object
            salary(): calculates the salary ( hourlyRate * weeklyHour * 52) and returns it as double
            stateTax(): calculates the total state tax, and returns it as double
            federalTax(): calculates the total federal tax, and returns it as double
            salaryAfterTax(): calculates the salary after tax, and returns it as double
            toString(): when a SalaryCalculator object is passed in print statement,
            	it should displays the salary, stateTax, federalTax, salaryAfterTax of the Object

 */