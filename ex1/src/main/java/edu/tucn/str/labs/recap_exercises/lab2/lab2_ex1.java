package edu.tucn.str.labs.recap_exercises.lab2;


import java.util.Scanner;

public class lab2_ex1 {
    public static void main(String[] args) {
        Scanner keyboard=new Scanner(System.in);
        System.out.println("Enter the values of the 2 number you want to commpare: ");
        int a=keyboard.nextInt();
        int b= keyboard.nextInt();

        System.out.println("The maximum number is: ");
        if(a>=b)
            System.out.println(a);
        else
            System.out.println(b);

    }
}
