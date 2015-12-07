package edu.iut.exception;

import java.util.logging.Logger;

import edu.iut.app.ApplicationSession;

public class exception extends Exception {
	public exception() {
		super();
		
		ApplicationSession.instance().getExceptionLogger().info("");
	}
	public exception(exception e) {
		super(e);
		ApplicationSession.instance().getExceptionLogger().info(e.getMessage());
	}
	public exception(String message) {
		super(message);
		ApplicationSession.instance().getExceptionLogger().info(message);
	}
	
}