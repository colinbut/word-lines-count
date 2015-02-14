/**
 * 
 */
package com.mycompany.word_lines_count;

import java.io.File;

/**
 * 
 * "Marker" interface for 'counting'
 * 
 * @author Colin
 *
 */
public interface Counter {

	/**
	 * Generic count method
	 * 
	 * @param inputFile
	 * @return 
	 * 			the count
	 */
	int count(File inputFile);
}
