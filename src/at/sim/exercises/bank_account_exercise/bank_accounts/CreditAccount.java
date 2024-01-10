package at.sim.exercises.bank_account_exercise.bank_accounts;

public class CreditAccount extends BaseAccount {

    @Override
    public void deposit(double amount) {
        if (this.getBalance() + amount < 0) {
            super.deposit(amount);
        }
    }
}
