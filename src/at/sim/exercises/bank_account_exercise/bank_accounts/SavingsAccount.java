package at.sim.exercises.bank_account_exercise.bank_accounts;

public class SavingsAccount extends BaseAccount{
    @Override
    public double withdraw(double amount) {
        if ((getBalance() - amount)>0){
            return super.withdraw(amount);
        }else{
            System.out.println("Kein Deckung");
            return 0;
        }
    }
}