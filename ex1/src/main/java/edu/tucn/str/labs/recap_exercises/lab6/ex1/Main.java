package edu.tucn.str.labs.recap_exercises.lab6.ex1;

public class Main {
    public static void main(String[] args) {
        BankAccount b1=new BankAccount("Marcel",2500.4);
        BankAccount b2=new BankAccount("Marcel",2500.4);
        BankAccount b3=new BankAccount("Andrew",6900.7);
        b3.deposit(2000);
        b3.withdraw(3000.5);

        if(b1.equals(b3)==true)
            System.out.println("This is the same bank account");
            else
            System.out.println("This is a different bank account");
        if(b1.equals(b2)==true)
            System.out.println("This is the same bank account");
        else
            System.out.println("This is a different bank account");

        System.out.println(b1.hashCode());
        System.out.println(b2.hashCode());
        System.out.println(b3.hashCode());
    }
}
