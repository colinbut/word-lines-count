package com.mycompany.word_lines_count;

import java.io.File;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * 
 * Unit test for WordCounter.java
 * 
 * @author colin
 *
 */
public class WordCounterTest extends TestCase {

	/**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public WordCounterTest(String testName)
    {
        super(testName);
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite(WordCounterTest.class);
    }

    /**
     * As functionality is simple - this is a very simple unit test
     * that tests whether the expected count matches what we the actual is 
     */
    public void testCount()
    {
    	
    	File sampleFile = new File(System.getProperty("user.dir") 
    			+ "/src/test/java/com/mycompany/word_lines_count/sample.txt");
    	
    	WordCounter wordCounter = new WordCounter();
    	
    	int result = wordCounter.count(sampleFile);
    	
    	// sample file has 9 words in it
        assertEquals(9, result);
        
    }
}
