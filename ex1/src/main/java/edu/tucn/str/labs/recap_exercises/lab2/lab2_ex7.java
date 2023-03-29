package edu.tucn.str.labs.recap_exercises.lab2;

import java.util.Random;
import java.util.Scanner;

public class lab2_ex7 {
    //Guess the number game
    public static void main(String[] args) {
        int min = 0, max= 10, attempts=3;
        boolean won=false;
        Scanner keyboard=new Scanner(System.in);
        Random random= new Random();
        System.out.println("In this game you will have to guess a number between "+min+" and "+ max
                +". After 3 failed attempts you will lose the game");
        System.out.println("Insert the number to try and guess it");
        while(attempts!=0 && won==false)
        {
            //generates number from 0 to max but I added +min so I can choose my interval more accurately
            int r=random.nextInt(max)+min;

            int a=keyboard.nextInt();
            if(a>r) {
                System.out.println("Wrong answer, your number is too high, the correct answer was "+r);
                attempts--;
            }
            else
                if (a<r) {
                    System.out.println("Wrong answer, your number is too low, the correct answer was "+r);
                    attempts--;
                }
                else {
                    System.out.println("Congratulations, you won");
                    won=true;
                }
        }
        if(won==false)
            System.out.println("You lost");

    }
}
