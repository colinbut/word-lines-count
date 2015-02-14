/**
 * 
 */
package com.mycompany.word_lines_count;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Helper class for reading a file
 * 
 * @author Colin
 *
 */
public class Reader {

	/**
	 * Reads an input file and stores its contents (each line) in a list
	 * 
	 * @param inputFile the file 
	 * @return 
	 * 			a list containing each read line
	 */
	public final List<String> read(File inputFile)
	{
		List<String> fileLines = new ArrayList<String>();
		BufferedReader reader = null;
		
		try {
			
			reader = new BufferedReader(new FileReader(inputFile));
			
			String line = null;
						
			while ((line = reader.readLine()) != null) {
				fileLines.add(line);
			}
						
			reader.close(); //close resources
			
			
		} 
		catch (FileNotFoundException e) {
			System.err.println("ERROR: Input file does not exist.");
		} 
		catch (IOException e) {
			System.err.println("ERROR: IO problem in reading from input file.");
		}
		// catch all other exceptions
		catch (Exception e) {
			System.err.format("ERROR: Unknown problem in reading input file.%n%s",
					e.getMessage());
		}
		finally{
			
			//ensure reader is really closed
			if(reader != null){
				try {
					reader.close();
				} 
				catch (IOException e) {
					e.printStackTrace();
				}
				catch (Exception e) {
					e.printStackTrace();
				}	
			}
			
		}
		
		return fileLines;
	}
}
