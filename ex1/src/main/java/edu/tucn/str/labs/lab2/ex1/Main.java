package edu.tucn.str.labs.lab2.ex1;

import edu.tucn.str.labs.lab2.utils.PrintUtils;

public class Main {
    public static void main(String[] args) {

        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();

        t1.setName("Thread 1");
        t2.setName("Thread 2");

        t1.start();
        t2.start();
    }
}
