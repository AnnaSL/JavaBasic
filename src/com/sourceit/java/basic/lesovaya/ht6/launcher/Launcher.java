package com.sourceit.java.basic.lesovaya.ht6.launcher;

import java.util.*;

import com.sourceit.java.basic.lesovaya.ht6.classes.Child;
import com.sourceit.java.basic.lesovaya.ht6.classes.Educator;
import com.sourceit.java.basic.lesovaya.ht6.classes.Icecream;
import com.sourceit.java.basic.lesovaya.ht6.classes.IcecreamBox;
import com.sourceit.java.basic.lesovaya.ht6.classes.KinderGarten;

/**
 * Launcher
 * 
 * @author Anna Lesovaya
 *
 */
public class Launcher {
	public static void main(String args[]) {

		String[] childName = { "Asya", "John", "Piter", "Mary", "Kathy" };
		String[] tasteofIceCream = { "chocolate", "milky", "vanilla", "frutty" };
		// TODO kindOfEat
		String[] kindOfEat = { "savour", "chew", "eat up" };
		String[] kindOfIceCream = { "on stroke", "plombieres", "cone" };
		int[] listOfWeight = { 60, 100, 200 };

		KinderGarten kinderGarten = new KinderGarten("Sun");

		for (int i = 0; i < childName.length; i++) {

			kinderGarten.addChild(new Child(childName[i]));

		}

		IcecreamBox iceBox = new IcecreamBox();

		for (int i = 0; i < kinderGarten.getSizeOfKinderGarten(); i++) {

			int randomTasteIndex = (int) (Math.random() * tasteofIceCream.length);
			int randomIceCreamKindIndex = (int) (Math.random() * kindOfIceCream.length);
			int randomWeightIndex = (int) (Math.random() * listOfWeight.length);

			iceBox.addIcecream(new Icecream(tasteofIceCream[randomTasteIndex],
					kindOfIceCream[randomIceCreamKindIndex],
					listOfWeight[randomWeightIndex]));
		}

		Educator educator = new Educator();

		for (int i = 0; i < kinderGarten.getSizeOfKinderGarten(); i++) {

			if (!kinderGarten.getChild(i).isReplete()) {
				// int randomEatKindIndex = (int)(Math.random() *
				// kindOfEat.length);
				educator.feedChildren(kinderGarten.getChild(i),
						iceBox.getIceCream(i));
			}
		}

	}

}
