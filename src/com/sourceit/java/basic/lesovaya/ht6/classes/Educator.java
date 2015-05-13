package com.sourceit.java.basic.lesovaya.ht6.classes;


/**
 * Represents educator in kindergarten
 * 
 * @author Anna Lesovaya
 *
 */
public class Educator extends Human {

	public Educator(String name){
		this.name = name;
	}
	/**
	 * 
	 * @param hungryChild
	 * @param food
	 */
	public void feedChildren(Child hungryChild, Eatable food) {
		hungryChild.eat(food);
	}
}
