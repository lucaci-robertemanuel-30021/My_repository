package edu.tucn.str.labs.recap_exercises.lab6.ex2;

public class Main {
    public static void main(String[] args) {

        BankAccount b1=new BankAccount("Josh",2340);
        BankAccount b2= new BankAccount("Nathan",7542.9);
        BankAccount b3= new BankAccount("Daniel",850);

        Bank bank=new Bank();

        b2.deposit(2000);
        b2.withdraw(3000);
        System.out.println(b2.getBalance());

        bank.addAccount(b1);
        bank.addAccount(b2);
        bank.addAccount(b3);

        bank.printAccounts();

        bank.setMinBalance(500);
        bank.setMaxBalance(6000);

        bank.printAccounts(bank.getMinBalance(), bank.getMaxBalance());

        bank.getAllAccounts();


    }
}
