

public class Account {
    int accNo;
    int balance;
    String name;

    
    
    public Account() {
        this.accNo = 1234;
        this.balance = 20000;
        this.name = "abhi";
    }

   
    
    public Account(int accNo, int balance, String name) {
        this.accNo = accNo;
        this.balance = balance;
        this.name = name;
    }

  
   
    public void withdraw(int amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Remaining balance: " + balance);
        } else {
            System.out.println("Insufficient balance");
        }
    }

    public Account maxBalance(Account acc1, int amount1, Account acc2, int amount2) {

        if(amount1 <= acc1.balance) {
            acc1.balance -= amount1;
        }
        if(amount2 <= acc2.balance) {
            acc2.balance -= amount2;
        }
        if(acc1.balance > acc2.balance) {
            return acc1;
        } else {
            return acc2;
        }
    }

    public static void main(String[] args) {

        Account acc1 = new Account(1, 2000, "Abhi");
        Account acc2 = new Account(2, 1500, "Uday");
        Account acc3 = new Account();
        Account result = acc3.maxBalance(acc1, 1000, acc2, 500);
        System.out.println("Max balance is: " + result.balance);
    }
}