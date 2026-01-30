package RelationshipBtwClasses;
public class BankAccount {
    private double balance = 10000;

    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount();
        acc1.withdraw(3000);
        acc1.withdraw(8000);

    }

    class Transctionvalidator {
        boolean canWithdraw(double amt) {
            return amt <= balance;
        }
    }

    private void withdraw(double amt) {
        Transctionvalidator validate = new Transctionvalidator();
        if (validate.canWithdraw(amt)) {
            balance -= amt;
            System.out.println("Withdrawls successfull");

        } else {
            System.out.println("Insuffcinet funds");
        }
    }
}
