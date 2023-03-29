package edu.tucn.str.labs.recap_exercises.lab2;

import java.util.Scanner;

public class lab2_ex2 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Insert the interval where you want to " +
                "find all the prime numbers:");
        System.out.println("Lower margin A=");
        int A=s.nextInt();
        System.out.println("Higher margin B=");
        int B=s.nextInt();

        System.out.println("The prime numbers are:");
        for(int i=A;i<=B;i++){
            int count=1;
            for(int j=2;j<=i/2;j++)
            {
                if(i%j==0){
                    count++;
                }
            }
            if(count==1)
                System.out.println(" "+i);
        }
    }
}
