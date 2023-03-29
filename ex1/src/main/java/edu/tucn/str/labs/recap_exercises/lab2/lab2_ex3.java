package edu.tucn.str.labs.recap_exercises.lab2;

import java.io.Console;
import java.util.Scanner;

public class lab2_ex3 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String input=s.next();
        while(input!="0")
        {
            input=s.next();
            switch (input){
            case "1":{
                System.out.println("One");
                break;}
            case "2":{
                System.out.println("Two");
                break;}
            case "3":{
                System.out.println("Three");
                break;}
            case "4":{
                System.out.println("Four");
                break;}
            case "5":{
                System.out.println("Five");
                break;}
            case "6":{
                System.out.println("Six");
                break;}
            case "7":{
                System.out.println("Seven");
                break;}
            case "8":{
                System.out.println("Eight");
                break;}
            case "9":{
                System.out.println("Nine");
                break;}
            case "0":{
                System.out.println("End");
                break;}
        }}

    }
}
