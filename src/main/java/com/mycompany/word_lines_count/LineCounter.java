/**
 * 
 */
package com.mycompany.word_lines_count;

import java.io.File;

/**
 * Class for counting number or lines in a file
 * 
 * @author Colin
 *
 */
public class LineCounter extends Reader implements Counter{

	/*
	 * (non-Javadoc)
	 * @see com.mycompany.word_lines_count.Counter#count(java.io.File)
	 */
	public int count(File inputFile){
		
		int lineCount = super.read(inputFile).size();
		
		System.out.println(lineCount);
		
		return lineCount;
		
	}
	
}
