package edu.tucn.str.labs.recap_exercises.lab6.ex2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Bank {
    private ArrayList<BankAccount> list=new ArrayList<>();
    private double minBalance;
    private double maxBalance;
    public Bank() {
    }

    void addAccount(BankAccount b){
        list.add(b);
    }

    //I know that the class diagram says I should make the methods public because of the + sign
    //but I decided to let them be package since I only use them for this exercise
    void printAccounts(){

        Collections.sort(list, new Comparator<BankAccount>() {
            @Override
            public int compare(BankAccount o1, BankAccount o2) {
                return Double.compare(o2.getBalance(),o1.getBalance());
            }
        }); for(BankAccount a: list){

            System.out.println("Owner:"+a.getOwner()+" has balance "+a.getBalance());
        }
    }

    void getAllAccounts(){

        Collections.sort(list, new Comparator<BankAccount>() {
            @Override
            public int compare(BankAccount o1, BankAccount o2) {
                return o1.getOwner().compareTo(o2.getOwner());
            }

        });
        System.out.println("Sorted alphabetically:");
        for(BankAccount a: list){

            System.out.println("Owner:"+a.getOwner()+" has balance "+a.getBalance());
        }
    }

    void printAccounts(double minBalance, double maxBalance){
        this.minBalance = minBalance;
        this.maxBalance = maxBalance;
    {
        for(BankAccount a: list){
            if((a.getBalance() >= minBalance) && (a.getBalance() <= maxBalance))
            System.out.println("Owner:"+a.getOwner()+" has balance "+a.getBalance());
        }

    }}
    BankAccount getAccount(String owner){
        for(BankAccount a: list){
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
