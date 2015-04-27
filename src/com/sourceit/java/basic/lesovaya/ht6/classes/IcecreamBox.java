package com.sourceit.java.basic.lesovaya.ht6.classes;

import java.util.*;

/**
 * Represents box with icecreams
 * 
 * @author Anna Lesovaya
 *
 */
public class IcecreamBox {
	/**
	 * Contains list of icecream object as an ArrayList
	 */
	private ArrayList<Icecream> listOfIcecream;

	/**
	 * Class constructor with initializing collection of icecreams
	 */
	public IcecreamBox() {
		listOfIcecream = new ArrayList<Icecream>();
	}

	/**
	 * Method addiding object of class Icecream to collection listOfIcecream
	 * 
	 * @param newIcecream
	 */
	public void addIcecream(Icecream newIcecream) {
		listOfIcecream.add(newIcecream);
	}

	/**
	 * Method takes out object of class Icecream from collection listOfIcecream
	 * 
	 * @param index
	 * @return an object of class Icecream
	 */
	public Icecream getIceCream(int index) {
		return listOfIcecream.get(index);
	}

}
