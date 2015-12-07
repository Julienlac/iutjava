package edu.iut.exception;

import java.util.logging.Logger;

import edu.iut.app.ApplicationSession;

public class exception extends Exception {
	public exception() {
		super();
		edu.iut.app.ApplicationSession.instance().getExceptionLogger().info("");
	}
	public exception(exception e) {
		super(e);
		edu.iut.app.ApplicationSession.instance().getExceptionLogger().info(e.getMessage());
	}
	public exception(String message) {
		super(message);
		edu.iut.app.ApplicationSession.instance().getExceptionLogger().info(message);
	}
	
}