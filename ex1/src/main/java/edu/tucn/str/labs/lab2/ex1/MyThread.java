package edu.tucn.str.labs.lab2.ex1;

import edu.tucn.str.labs.lab2.utils.PrintUtils;

public class MyThread extends Thread {
    public MyThread(){
    }

    @Override
    public void run() {
        System.out.println("Current thread name is: "+Thread.currentThread().getName());
    }
}
