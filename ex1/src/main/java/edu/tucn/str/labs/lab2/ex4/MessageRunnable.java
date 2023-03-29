package edu.tucn.str.labs.lab2.ex4;

import javax.swing.*;

public class MessageRunnable implements Runnable {
    public MessageRunnable() {
    }

    @Override
    public void run() {

        while(!Thread.interrupted()){
        for(int i=0;i<10;i++)
         System.out.println(Thread.currentThread().getName()+" - mesajul "+i);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {

        }}
    }
}
