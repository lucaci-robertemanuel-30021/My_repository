package edu.tucn.str.labs.recap_exercises.lab6.ex4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Word anime=new Word("anime");
        Definition a=new Definition("a style of Japanese film and television animation," +
                " typically aimed at adults as well as children.");
        Word discombobulated = new Word("discombobulated");
        Definition d= new Definition("confused and disconcerted");
        Word conscerned= new Word("conscerned");
        Definition c = new Definition("worried, troubled, or anxious.");

        Dictionary dictionary=new Dictionary();
        dictionary.addWord(anime,a);
        dictionary.addWord(discombobulated,d);
        dictionary.addWord(conscerned,c);


        System.out.println("Command options:");
        System.out.println("1 - Add word");
        System.out.println("2 - Get definition");
        System.out.println("3 - Get all words");
        System.out.println("4 - Get all definitions");
        System.out.println("5 - End program");

        Scanner s=new Scanner(System.in);
        Scanner s2=new Scanner(System.in);
        String input=s.next();

            switch (input) { //need to get the switch fixed
                case "1": {
                    System.out.println("Introduce the word you want to add:");
                    String input2=s2.nextLine();
                    System.out.println("Now introduce the definition:");
                    String input3=s2.nextLine();
                    dictionary.addWord(new Word(input2), new Definition(input3));
                    break;
                }
                case "2": {
                    System.out.println("Introduce the word whose definition you want to find:");
                    String input2=s2.nextLine();
                    dictionary.getDefinition(new Word(input2));
                    break;
                }
                case "3": {
                    System.out.println("All the words are:");
                    dictionary.getAllWords();
                    break;
                }
                case "4": {
                    System.out.println("All the definitions are:");
                    dictionary.getAllDefinitions();
                    break;
                }
                case "5": {
                    System.out.println("The program was closed");
                    break;
                }
            }while (input!="5");
        }

}
