package sunday.sun_05_14.bank;

import sunday.sun_05_14.bank.Bank;
import sunday.sun_05_14.bank.CannotBeNegativeException;

public class UseBank {
    // this class it the user, the person who would use this Bank/code
    public static void main(String[] args) {

        Bank bank = new Bank(1000, 13124124);

        bank.withdraw(400); // had unchecked exception, so exception would occur during runtime

        System.out.println(bank.getBalance());

        Bank bank2 = new Bank(0, 0);
        try {
            bank2.setBalance(-100);
        } catch (CannotBeNegativeException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }

        System.out.println("END");

    }
}
