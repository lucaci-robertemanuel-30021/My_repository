package edu.tucn.str.labs.lab2.ex2;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class PrimeGenerator extends Frame implements Runnable {

    public PrimeGenerator() {

    }

    @Override
    public void run() {
        int i;
        for(i=2; i<=999999999; i++)
        {
          isPrime(i);
        }
    }
    void isPrime(int number){
        boolean prime=false;
        for (int i = 2; i <= number / 2; ++i) {

            if (number % i == 0) {
                prime = true;
                break;
            }
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {

                System.out.println("Last prime number printed was: "+number);
                System.out.println("This thread was interrupted: " + Thread.currentThread().getName());
            }

        }
        if (!prime)
            System.out.println(number + " is a prime number.");

    }
}

