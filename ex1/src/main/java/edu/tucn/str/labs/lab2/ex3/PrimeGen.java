package edu.tucn.str.labs.lab2.ex3;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class PrimeGen extends Frame implements Runnable, ActionListener {
    Button start,stop;
    TextField tf;
    int x=0,y=0;
    String msg="";
    Thread t1=new Thread(this);
    @Override
    public void actionPerformed(ActionEvent e) {
        Button btn=(Button)e.getSource();

        if(btn==start)
        {
            System.out.println("Thread "+t1.getName()+ " started");
            t1.start();
        }


        if(btn==stop)
        {
            t1.stop();
            System.out.println("Thread "+t1.getName()+ " stopped");
        }
    }

    public PrimeGen() {
        //setting up the gui
        setLayout(new FlowLayout());
        start=new Button("start");
        stop=new Button("stop");
        add(start);
        add(stop);

        start.addActionListener(this);
        stop.addActionListener(this);
        addWindowListener(new WindowAdapter()
        {
            public void
            windowClosing(WindowEvent e)
            {
                System.exit(0);
            }
        });

        setSize(200,200);
        setVisible(true);
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
