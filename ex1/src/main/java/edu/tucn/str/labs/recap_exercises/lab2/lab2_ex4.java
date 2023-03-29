package edu.tucn.str.labs.recap_exercises.lab2;

import java.util.Scanner;
import java.util.Vector;

public class lab2_ex4 {
    public static void main(String[] args) {

        Scanner s=new Scanner(System.in);
        System.out.println("Introduce the number of elements you want" +
                " to insert:");
        int n=s.nextInt();
        int values[]=new int[n];
        System.out.println("Now introduce the elements:");
        for(int i=0;i<n;i++){
            values[i]=s.nextInt();
        }
        int max=-999999;
        for(int i=0;i<n;i++){
            if(values[i]>max)
                max=values[i];
        }

        System.out.println("The max value from the array is:"+max);
    }
}
