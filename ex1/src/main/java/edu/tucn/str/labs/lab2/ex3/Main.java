package edu.tucn.str.labs.lab2.ex3;

import edu.tucn.str.labs.lab2.ex2.PrimeGenerator;

public class Main {
    public static void main(String[] args) {

        PrimeGen pg1=new PrimeGen();
        Thread t1=new Thread(pg1);
    }
}
