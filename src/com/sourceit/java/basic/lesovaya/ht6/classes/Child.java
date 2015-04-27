package com.sourceit.java.basic.lesovaya.ht6.classes;

import java.util.Date;

import com.sourceit.java.basic.lesovaya.ht6.interfaces.Eatable;
import com.sourceit.java.basic.lesovaya.ht6.interfaces.Fedable;

/**
 * Represents a child attending kindergarten
 * 
 * @author Anna Lesovaya
 *
 */
public class Child extends Human implements Fedable {
	/**
	 * variable represents repleting of child
	 */
	private boolean isReplete;

	/**
	 * Class constructor with parameters name. Creates new instance of class
	 * Child with his own name
	 * 
	 * @param newName
	 *            string parameters for own name of child
	 */
	public Child(String newName) {
		name = newName;
	}

	/**
	 * Returns state of child's replete
	 * 
	 * @return isReplete
	 */
	public boolean isReplete() {
		return isReplete;
	}

	/**
	 * Sets boolean field isReplete to true.
	 */
	@Override
	public void eat(Eatable e) {
		isReplete = true;
	}

}
