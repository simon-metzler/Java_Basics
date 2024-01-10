package at.sim.exercises.bank_account_exercise;

import at.sim.exercises.bank_account_exercise.bank_accounts.CheckingsAccount;

public class Main {
    public static void main(String[] args) {
        CheckingsAccount checkingsAccount = new CheckingsAccount(10);
        checkingsAccount.deposit(10);

    }
}
