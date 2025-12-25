package PQDate8122025;

public class BankAccount {
    String AccountHolder;
    int balance;

    BankAccount(String accountHolder, int balance) {
        this.AccountHolder = accountHolder;
        this.balance =balance;
    }

    void deposit(int amount) {       // add money
        balance = balance + amount;
        System.out.println("deposit succesfully:" + amount);
    }

    void withdraw(int amount)  // subtracts money (only if balance is enough)
    {
        if (amount <= balance)
        {
            balance= balance- amount;
                    System.out.println("withdraw Successfuly."+amount);
        } else {
            System.out.println("Insufficient balance!");
        }
    }

    void display() //shows account holder & balance
    {
//        System.out.println("Account Holder:"+AccountHolder);
        System.out.println("Current Balance:"+balance);
    }

    public static void main(String[]args)
    {
        BankAccount acc = new BankAccount("pranali",5000);
        acc.display();
        acc.deposit(4000);
        acc.withdraw(2000);

        acc.display(); // Simple and clear for inheritance or OOP practice
    }


}
