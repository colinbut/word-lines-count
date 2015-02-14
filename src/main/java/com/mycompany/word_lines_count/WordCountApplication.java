package com.mycompany.word_lines_count;

import java.io.File;


/**
 * Main Driver program
 * 
 */
public class WordCountApplication {

	/**
	 * Main Entry
	 * 
	 * @param args program arguments
	 */
	public static void main(String[] args) {

		WordCountApplication wordCountApp = new WordCountApplication();
		wordCountApp.count(args);
		
	}
	
	
	private Counter counter = null;
	
	private void printUsage() {

		System.out
				.println("\nUsage:\n"
						+ "java -jar word-count-0.0.1-SNAPSHOT.jar [options] <input file>\n"
						+ "Optional arguments:\n" + "-l count lines\n");
	}

	/**
	 * Chooses what type of counting to do
	 * 
	 * A slightly custom modified implementation of the Strategy Design pattern where
	 * it chooses what type of counting to do by instantiating the appropriate counter 
	 * (word or line counter) based on what arguments passed in from cmd line
	 * 
	 * @param args argument list
	 */
	public void count(String[] args){
		
		// The main application logic here
		
		int numberOfCmdLineArguments = args.length;

		if (1 <= numberOfCmdLineArguments && numberOfCmdLineArguments <= 2) {
			
			if (numberOfCmdLineArguments == 1) {

				/*
				 * assume the only argument supplied is a file & let the
				 * Reader.java check for file existence
				 */
				counter = new WordCounter();
				counter.count(new File(System.getProperty("user.dir") + "\\" + args[0]));
				
			} 
			else {

				if (args[0].equals("-l")) {
					counter = new LineCounter();
					counter.count(new File(System.getProperty("user.dir") + "\\" + args[1]));
				} 
				else {
					System.err.println("ERROR: Invalid option " + args[0]);
					printUsage();
				}
			}

		} 
		else {
			System.err.println("ERROR: Invalid number of arguments passed");
			printUsage();
		}
	}
	
	
}
