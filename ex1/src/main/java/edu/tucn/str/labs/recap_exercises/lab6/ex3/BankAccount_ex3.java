package edu.tucn.str.labs.recap_exercises.lab6.ex3;

public class BankAccount_ex3 {
    private String owner;
    private double balance;

    public BankAccount_ex3(String owner, double balance) {
        this.owner = owner;
        this.balance = balance;
    }
    void withdraw(double amount){
        System.out.println("The current amount in your bank account after withdrawing is:"+(balance-amount));
        this.balance=balance-amount;
    }

    void deposit(double amount){
        System.out.println("The current amount in your bank account after depositing is:"+(balance+amount));
        this.balance=balance+amount;
    }

    public String getOwner() {
        return owner;
    }

    public double getBalance() {
        return balance;
    }
}
