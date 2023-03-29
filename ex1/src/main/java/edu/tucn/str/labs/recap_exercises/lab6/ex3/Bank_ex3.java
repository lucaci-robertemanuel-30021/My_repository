package edu.tucn.str.labs.recap_exercises.lab6.ex3;

import edu.tucn.str.labs.recap_exercises.lab6.ex2.BankAccount;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.TreeSet;

public class Bank_ex3 {

    private TreeSet<BankAccount_ex3> list=new TreeSet<>();
    private double minBalance;
    private double maxBalance;

    public Bank_ex3() {
    }

    void addAccount(BankAccount_ex3 b){
        list.add(b);
    }

    void printAccounts(){

 for(BankAccount_ex3 a: list){

            System.out.println("Owner:"+a.getOwner()+" has balance "+a.getBalance());
        }
    }
    void getAllAccounts(){

        System.out.println("Sorted alphabetically:");
        for(BankAccount_ex3 a: list){

            System.out.println("Owner:"+a.getOwner()+" has balance "+a.getBalance());
        }
    }
    void printAccounts(double minBalance, double maxBalance){
        this.minBalance = minBalance;
        this.maxBalance = maxBalance;
        {
            for(BankAccount_ex3 a: list){
                if((a.getBalance() >= minBalance) && (a.getBalance() <= maxBalance))
                    System.out.println("Owner:"+a.getOwner()+" has balance "+a.getBalance());
            }

        }}
    BankAccount_ex3 getAccount(String owner){
        for(BankAccount_ex3 a: list){
            if(a.getOwner().equals(owner))
                return a;
        }
        return null;
    }

    public void setMinBalance(double minBalance) {
        this.minBalance = minBalance;
    }

    public void setMaxBalance(double maxBalance) {
        this.maxBalance = maxBalance;
    }

    public double getMinBalance() {
        return minBalance;
    }

    public double getMaxBalance() {
        return maxBalance;
    }
}
