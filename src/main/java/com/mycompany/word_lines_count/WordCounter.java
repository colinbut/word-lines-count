/**
 * 
 */
package com.mycompany.word_lines_count;

import java.io.File;
import java.util.List;

/**
 * Class for counting number of words in a file
 * 
 * @author Colin
 *
 */
public class WordCounter extends Reader implements Counter{
	
	/*
	 * (non-Javadoc)
	 * @see com.mycompany.word_lines_count.Counter#count(java.io.File)
	 */
	public int count(File inputFile){
		
		int wordCount = 0;
		List<String> lines = super.read(inputFile);
		
		for(String line : lines){
			String[] words = line.split("\\s+"); //split on regex
			wordCount += words.length;
		}
		
		System.out.println(wordCount);
		
		return wordCount;
		
	}
}
