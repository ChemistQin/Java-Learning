package Exceptions;

import java.util.logging.*;
import java.io.*;

class LoggingException extends Exception {
	private static Logger logger = Logger.getLogger("LoggingException");
	public LoggingException() {
		StringWriter trace = new StringWriter();
		printStackTrace(new PrintWriter(trace));
		logger.severe(trace.toString());
	}
}

public class LoggingExceptions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			throw new LoggingException();
		} catch (LoggingException e) {
			// TODO: handle exception
			System.err.println("catch " + e);
		}
		try {
			throw new LoggingException();
		} catch (LoggingException e) {
			// TODO: handle exception
			System.err.println("catch " + e);
		}

	}

}
