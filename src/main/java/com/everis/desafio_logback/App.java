package com.everis.desafio_logback;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author jjimemon
 *
 */
public class App {

	//creator of the first logger (LOG).
	final static Logger LOG = LoggerFactory.getLogger(App.class);
	//creator of the second logger (LOG2).
	final static Logger LOG2 = LoggerFactory.getLogger("com.everis.desafio_logback.debug");

	/**
	 * 
	 * Main method
	 * 
	 * @param args
	 */

	public static void main(String[] args) {

		final int numero = 100;

		/**
		 * loop that roams 100 times.
		 */

		for (int i = 0; i < numero; i++) {

			// prints the configured message in a log.
			LOG.info("Iterando {}", i);
			// prints the configured message in a second log.
			LOG2.debug("Debugeando {}", i);

		}

	}
}
