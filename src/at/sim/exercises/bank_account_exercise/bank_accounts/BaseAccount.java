package at.sim.exercises.bank_account_exercise.bank_accounts;

public class BaseAccount {

    private double balance;


    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        this.balance += amount;
        System.out.println("Deposited: " + amount);
    }

    public double withdraw(double amount) {
        this.balance -= amount;
        System.out.println("Withdrawn: " + amount);
        return amount;
    }

}
