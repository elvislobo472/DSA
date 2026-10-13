package Coding.Java.OOPS;




class Bank{
    String accountHolder;
    int accountNumber;
    double balance;


    Bank(String accountHolder, int accountNumber, double balance){
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit(double amount){

        balance += amount;
        System.out.println("Current Balance :" +balance);

    }

    public void withdraw(double amount){
        if(amount > 0 && amount <= balance) {

            balance -= amount;
            System.out.println("Current Balance :" +balance);
        }else{
            System.out.println("Transaction Failed");
        }
    }

    public void displayBalance(){
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Current Balance: " + balance);
    }



}

public class BankAccount {


    public static void main(String[] args) {

        Bank ac1 = new Bank("Elvis Lobo", 32923, 2000);

        ac1.deposit(2000);
        ac1.withdraw(500);

        ac1.displayBalance();



    }
}
