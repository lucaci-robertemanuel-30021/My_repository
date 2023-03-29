package edu.tucn.str.labs.lab2.ex2;

public class Main {
    public static void main(String[] args) {

        PrimeGenerator pg1=new PrimeGenerator();
        PrimeGenerator pg2=new PrimeGenerator();

        //when I have 3 threads I can finally notice the importance of setting the priority for each thread
      //  PrimeGenerator pg3=new PrimeGenerator();
      //  PrimeGenerator pg4=new PrimeGenerator();
       // Thread t3=new Thread(pg1);
      //  Thread t4=new Thread(pg2);
       // t3.setName("Thread 3");
      //  t4.setName("Thread 4");

        Thread t1=new Thread(pg1);
        Thread t2=new Thread(pg2);

        t1.setName("Thread 1");
        t2.setName("Thread 2");

        long start = System.currentTimeMillis();
        long end = start + 3 * 1000;
        boolean timePassed=false;

        t1.start();
        t2.start();
       // t3.start();
       // t4.start();
        while (System.currentTimeMillis() < end) {
            timePassed=true;
        }
        if(timePassed==true){
            t1.interrupt();
            t2.interrupt();
            //t3.interrupt();
           // t4.interrupt();
            System.out.println("The threads were stopped after: "+((end-start)/1000)+ " seconds");
            t1.stop();
            t2.stop();
            //t3.stop();
            //t4.stop();
        }


    }
}
