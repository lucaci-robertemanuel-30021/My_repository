package edu.tucn.str.labs.recap_exercises.lab6.ex1;

import java.util.Objects;

public class BankAccount {
    private String owner;
    private double balance;

    public BankAccount(String owner, double balance) {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BankAccount that = (BankAccount) o;
        return Double.compare(that.balance, balance) == 0 && Objects.equals(owner, that.owner);
    }

    @Override
    public int hashCode() {
        return Objects.hash(owner, balance);
    }
}
