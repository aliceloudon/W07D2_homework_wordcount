package com.codeclan.wordcount;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by user on 14/03/2017.
 */

public class WordCountTest {

    @Test
    public void testCanCountWords(){
        WordCount wordCount = new WordCount();
        assertEquals(2, wordCount.countWords("Hello World"));
    }

    @Test
    public void testCanCountOccurrences(){
        WordCount wordCount = new WordCount();
        assertEquals("{world=1, hello=1}", wordCount.countWordOccurrences("hello world"));
    }

}

