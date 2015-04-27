package com.sourceit.java.basic.lesovaya.ht6.classes;

import java.util.Date;

/**
 * Abstract class Human
 * 
 * @author Anna Lesovaya
 *
 */
public abstract class Human {

	public String name;
	public Date dateOfBirth;
	public char sex;

	/**
	 * Overriding method toString()
	 * 
	 * @return name String field with name of human
	 */
	public String toString() {
		return name;
	}

}
