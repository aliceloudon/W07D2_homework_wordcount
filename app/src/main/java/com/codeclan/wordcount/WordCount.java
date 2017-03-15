package com.codeclan.wordcount;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by user on 14/03/2017.
 */

public class WordCount {

    public int countWords(String input){
        String[] words = input.split("\\W+");
        if (words.length == 1 && words[0].length() == 0) {
            return 0;
        }
        return words.length;
    }

    // Put individual words into an array called words.
    // \\W+ is a regex (regular expression) which splits the words on word boundaries.


    public String countWordOccurrences(String input){

        HashMap<String,Integer> wordOccurrences = new HashMap<>();
        String[] words = input.split("\\W+");

        for ( String word : words ) {
            Integer integer = wordOccurrences.get(word);
            if ( integer == null ) wordOccurrences.put(word, 1);
            else wordOccurrences.put(word, integer + 1);
        }
        return wordOccurrences.toString();
    }

}
