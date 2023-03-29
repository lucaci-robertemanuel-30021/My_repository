package edu.tucn.str.labs.recap_exercises.lab6.ex3;

public class Main {  //doesnt work
    public static void main(String[] args) {
        BankAccount_ex3 b1=new BankAccount_ex3("Josh",2340);
        BankAccount_ex3 b2=new BankAccount_ex3("Nathan",7542.9);
        BankAccount_ex3 b3=new BankAccount_ex3("Daniel",850);

        Bank_ex3 bank=new Bank_ex3();

        bank.addAccount(b1);
        bank.addAccount(b2);
        bank.addAccount(b3);

        bank.printAccounts();

        bank.setMinBalance(200);
        bank.setMaxBalance(6000);

        bank.printAccounts(bank.getMinBalance(), bank.getMaxBalance());

        bank.getAllAccounts();
    }
}
