package com.sourceit.java.basic.lesovaya.ht14;

import com.sourceit.java.basic.lesovaya.ht14.exceptions.ArrayLengthException;
import com.sourceit.java.basic.lesovaya.ht14.exceptions.ValidationException;

public class Launcher {

	public static void main(String[] args) {
		TestException test = new TestException();
		StringBuilder resultString = new StringBuilder();
		try {
			resultString = test.subString(args);
		} catch(ValidationException e) {
			System.out.println("ValidationException occured! Error message: " + e.getMessage());
		} catch(ArrayLengthException e) {
			System.out.println(" ArrayLengthException occured! Error message: " + e.getMessage());
		}
		System.out.println("Substring: " + resultString);
	}

}
