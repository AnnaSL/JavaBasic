package com.sourceit.java.basic.lesovaya.ht6.classes;


/**
 * Represents icecream with taste, kind and weight. Class IceCream implement
 * interface Eatable.
 * 
 * @author Anna Lesovaya
 *
 */
public class Icecream implements Eatable {
	private String taste;
	private String kind;
	private int weight;

	/**
	 * Class constructor specifying taste, kind and weight of icecream to
	 * create.
	 * 
	 * @param newTaste
	 * @param newKind
	 * @param newWeight
	 */
	public Icecream(String newTaste, String newKind, int newWeight) {
		this.kind = newKind;
		this.taste = newTaste;
		this.weight = newWeight;
	}

	/**
	 * Returns a value that describe taste of icecream
	 * 
	 * @return taste of icecream
	 */
	public String getTaste() {
		return this.taste;
	}

	/**
	 * Returns a value that describe kind of icecream like a cone or on stroke
	 * and etc.
	 * 
	 * @return kind of icecream like a cone or on stroke
	 */
	public String getKind() {
		return this.kind;
	}

	/**
	 * Returns a weight of icecream
	 * 
	 * @return weight
	 */
	public int getWeight() {
		return weight;
	}

	/**
	 * 
	 * @return a String representing of object
	 */
	public String toString() {
		return taste + " " + kind + " icecream ";
	}

}
