package edu.tucn.str.labs.recap_exercises.lab6.ex4;

import java.util.HashMap;
import java.util.Set;

public class Dictionary {
    private HashMap<Word,Definition> hm=new HashMap<>();

    public Dictionary() {
    }

    void addWord(Word w, Definition d){
        hm.put(w,d);
    }

    Definition getDefinition(Word w){
        return hm.get(w);
    }

    void getAllWords(){
        Set<Word> words=hm.keySet();
        for(Word word:words){
            System.out.println(word);
        }
    }
    void getAllDefinitions(){
        Set<Word> words=hm.keySet();
        for(Word word:words){
            System.out.println(hm.get(word));
        }
    }
}
