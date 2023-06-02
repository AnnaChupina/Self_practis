package day05;

public class NetIncomeCalc {

    public static void main(String[] args) {

        boolean married = false;
        int salaryBeforeTax = 79000;
        int tax=0;
        int taxSpouse=0;
        int salaryAfterTax=0;

        if (married == true){
        taxSpouse=5;
        }

        if (salaryBeforeTax <= 79000){
            tax = salaryBeforeTax*(20-taxSpouse)/100;
        }
        if (salaryBeforeTax > 79000 && salaryBeforeTax <=99000 ){
            tax = salaryBeforeTax*(25-taxSpouse)/100;
        }
        if (salaryBeforeTax > 99000 && salaryBeforeTax <=129000 ){
            tax = salaryBeforeTax*(30-taxSpouse)/100;
        }
        if (salaryBeforeTax > 129000 ){
            tax = salaryBeforeTax*(35-taxSpouse)/100;
        }

        salaryAfterTax = salaryBeforeTax - tax;
        System.out.println(salaryAfterTax);
        System.out.println(married);

    }

}
/*
Create a class named NetIncomeCalc, Write a program that can calculate the salary after tax based on the following requirements
                the tax rates are:
                        35% for salary of 130K or more
                        30% for salary of 100K to 129k
                        25% for salary of 80K to 99K
                        20% for salary of 79K or less

                in addition, if the person is married, he/she will pay 5% less tax
 */