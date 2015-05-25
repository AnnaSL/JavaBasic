package com.sourceit.java.basic.lesovaya.ht14.exceptions;

public class ValidationException extends Exception{
	/**
	 * Constructor with parameters
	 * @param msg - describe kind of exception
	 */
	public ValidationException(String msg) {
		super(msg);
	}
}
