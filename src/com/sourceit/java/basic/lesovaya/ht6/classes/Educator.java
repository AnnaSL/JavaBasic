package com.sourceit.java.basic.lesovaya.ht6.classes;

import com.sourceit.java.basic.lesovaya.ht6.interfaces.Eatable;

/**
 * Represents educator in kindergarten
 * 
 * @author Anna Lesovaya
 *
 */
public class Educator extends Human {

	/**
	 * 
	 * @param hungryChild
	 * @param food
	 */
	public void feedChildren(Child hungryChild, Eatable food) {
		hungryChild.eat(food);
	}
}
