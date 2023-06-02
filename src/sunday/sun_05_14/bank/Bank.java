package sunday.sun_05_14.bank;

public class Bank {

    private double balance;
    private long accountNumber;

    public Bank(double balance, long accountNumber) {
        this.balance = balance;
        this.accountNumber = accountNumber;
    }

    public void withdraw(double amount){
        if(amount > balance){
            throw new NotEnoughMoneyException("You only have " + balance + " so, you can not withdraw " + amount);
        }
        System.out.println("Withdraw " + amount);
        balance -=amount;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance)  throws
            CannotBeNegativeException {  // we use throws here beacuse as developer of this method I don't want to handle it

        if(balance < 0){
            //CannotBeNegativeException e = new CannotBeNegativeException();  this os optional
           // throw e;  // this os optional
            throw new CannotBeNegativeException();
        }
        this.balance = balance;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }
}
