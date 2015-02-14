package com.mycompany.word_lines_count;

import java.io.File;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for LineCounter.java
 * 
 * @author colin
 *
 */
public class LineCounterTest extends TestCase {

	/**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public LineCounterTest(String testName)
    {
        super(testName);
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite(LineCounterTest.class);
    }

    /**
     * Tests the count method
     */
    public void testCount()
    {
    	//hm.. hardcoded unix style
    	File sampleFile = new File(System.getProperty("user.dir") 
    			+ "/src/test/java/com/mycompany/word_lines_count/sample.txt");
    	
    	LineCounter lineCounter = new LineCounter();
    	
    	int result = lineCounter.count(sampleFile);
    	
    	// sample file has 3 lines in it
        assertEquals(3, result);
        
    }
}
