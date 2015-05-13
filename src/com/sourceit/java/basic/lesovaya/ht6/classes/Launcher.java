package com.sourceit.java.basic.lesovaya.ht6.classes;

import java.util.*;

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

		System.out.println("***************IcecreamBox contains***************");
		for (int i = 0; i < kinderGarten.getSizeOfKinderGarten(); i++) {

			int randomTasteIndex = (int) (Math.random() * tasteofIceCream.length);
			int randomIceCreamKindIndex = (int) (Math.random() * kindOfIceCream.length);
			int randomWeightIndex = (int) (Math.random() * listOfWeight.length);

			iceBox.addIcecream(new Icecream(tasteofIceCream[randomTasteIndex],
					kindOfIceCream[randomIceCreamKindIndex],
					listOfWeight[randomWeightIndex]));
			System.out.println(iceBox.getIceCream(i));
		}

		Educator educator = new Educator("Stasy");

		System.out.println("***************Children eat icecreams:****************");
		for (int i = 0; i < kinderGarten.getSizeOfKinderGarten(); i++) {

			if (!kinderGarten.getChild(i).isReplete()) {
				int randomkindOfEatIndex = (int) (Math.random() * kindOfEat.length);
				educator.feedChildren(kinderGarten.getChild(i),iceBox.getIceCream(i));
				System.out.println(kinderGarten.getChild(i) + " " + kindOfEat[randomkindOfEatIndex] + " " + iceBox.getIceCream(i));				
			}
		}

	}

}
