package edu.tucn.str.labs.recap_exercises.lab2;

import java.util.Scanner;


public class lab2_ex6 {
    //recursive method
    static int factorial(int n){
        if(n!=0)
            return n*factorial(n-1);
            else
                return 1;

    }
    public static void main(String[] args) {

        //non recursive way
        Scanner s=new Scanner(System.in);
        System.out.println("Introduce number:");
        int N=s.nextInt();
        long value=1;
        for(int i=2;i<=N;i++){
            value*=i;
        }
        System.out.println("The final factorial value is:"+value);

        //Recursive way
        System.out.println("Introduce number(recursive):");
        int n=s.nextInt(),result;
        result=factorial(n);
        System.out.println("Recursive factorial: "+result);
    }
}
