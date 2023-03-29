package edu.tucn.str.labs.recap_exercises.lab2;

import java.util.Random;
import java.util.Scanner;

public class lab2_ex5 {

    public static void main(String[] args) {
        Random random=new Random();
        int vector[]=new int[10];

        System.out.println("The unsorted elements are:");
        for(int i=0;i<10;i++){
            //I decided that the vector will have random values
            //between 0 and 100
            vector[i]= random.nextInt(100);
            System.out.println(" "+vector[i]);
        }

        for(int i=0;i<10;i++)
            for(int j=i;j<10;j++){
                if(vector[i]>vector[j]){
                    int aux=vector[i];
                    vector[i]=vector[j];
                    vector[j]=aux;
                }
            }

        System.out.println("The sorted elements are:");
        for(int i=0;i<10;i++)
            System.out.println(" "+vector[i]);
    }
}
