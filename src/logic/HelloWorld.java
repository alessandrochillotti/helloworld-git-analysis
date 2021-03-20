package logic;

import java.util.logging.Logger;

public class HelloWorld {

	// Created logger and set string "Hello World!"
	private static final Logger LOGGER = Logger.getLogger("Hello World!");
	
	public static void main(String[] args) {
		//Use logger to print message
		LOGGER.info(LOGGER.getName());
		System.exit(1);
	}

}