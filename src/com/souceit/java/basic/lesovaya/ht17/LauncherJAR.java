package com.souceit.java.basic.lesovaya.ht17;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class LauncherJAR {
	private static List<String> nameOfPackage = new ArrayList<String>();;
	
	public static void main(String[] args) {
		createListOfPackages();
		printList();
		Integer numberOfProject = 0;		
		
		try {
			BufferedReader in = new BufferedReader(new InputStreamReader(System.in));				
			while(true){
				String inputString = in.readLine();
				try {
					numberOfProject = Integer.parseInt(inputString);
					if(numberOfProject < 0 || numberOfProject > 17) {
						System.out.println("Введите номер от 1 до 17");
					} else {
						break;
					}
				} catch(NumberFormatException nex) {
					nex.printStackTrace();
				}
			}			
		} catch(IOException e) {
			e.printStackTrace();
		}
		
		runChoosenPackage(numberOfProject,args);
	}
	
	private static void createListOfPackages() {
		 nameOfPackage.add("1 - com.sourceit.java.basic.lesovaya.ht2(Maze)");
		 nameOfPackage.add("2 - com.sourceit.java.basic.lesovaya.ht4(Sorting)");
		 nameOfPackage.add("3 - com.sourceit.java.basic.lesovaya.ct5(FooBar)");
		 nameOfPackage.add("4 - com.sourceit.java.basic.lesovaya.ct5(Search)");
		 nameOfPackage.add("5 - com.sourceit.java.basic.lesovaya.ct6(OOP)");
		 nameOfPackage.add("6 - com.sourceit.java.basic.lesovaya.ht6.classes(IceCream)");
		 nameOfPackage.add("7 - com.sourceit.java.basic.lesovaya.ct7(IntArrays)");
		 nameOfPackage.add("8 - com.sourceit.java.basic.lesovaya.ht8(Workers)");
		 nameOfPackage.add("9 - com.sourceit.java.basic.lesovaya.ct9(Revers)");
		 nameOfPackage.add("10 - com.sourceit.java.basic.lesovaya.ct9(Adder)");
		 nameOfPackage.add("11 - com.sourceit.java.basic.lesovaya.ht10(Bank)");
		 nameOfPackage.add("12 - com.sourceit.java.basic.lesovaya.ht11(TextStatistics)");
		 nameOfPackage.add("13 - com.sourceit.java.basic.lesovaya.ht13(WTI)");
		 nameOfPackage.add("14 - com.sourceit.java.basic.lesovaya.ht14(Exception)");
		 nameOfPackage.add("15 - com.sourceit.java.basic.lesovaya.ht15(Card)");
		 nameOfPackage.add("16 - com.sourceit.java.basic.lesovaya.ht15(IOTextStatistics)");
		 nameOfPackage.add("17 - com.sourceit.java.basic.lesovaya.ct16(IOCoutrySort)");
	}
	
	private static void runChoosenPackage(int num, String[] args) {
		
		switch(num) {
		case 1:
			com.sourceit.java.basic.lesovaya.ht2.Maze.main(args);
			break;
		case 2:
			com.sourceit.java.basic.lesovaya.ht4.TestSort.main(args);
			break;
		case 3:
			com.sourceit.java.basic.lesovaya.ct5.Foo.main(args);
			break;
		case 4:
			com.sourceit.java.basic.lesovaya.ct5.Search.main(args);
			break;
		case 5:
			com.sourceit.java.basic.lesovaya.ct6.LauncherHT6.main(args);
			break;
		case 6:
			com.sourceit.java.basic.lesovaya.ht6.classes.Launcher.main(args);
			break;
		case 7:
			com.sourceit.java.basic.lesovaya.ct7.ClassTest.main(args);
			break;
		case 8:
			com.sourceit.java.basic.lesovaya.ht8.Launcher.main(args);
			break;
		case 9:
			com.sourceit.java.basic.lesovaya.ct9.Revert.main(args);
			break;
		case 10:
			com.sourceit.java.basic.lesovaya.ct9.Adder.main(args);
			break;
		case 11:
			com.sourceit.java.basic.lesovaya.ht10.Launcher.main(args);
			break;
		case 12:
			com.sourceit.java.basic.lesovaya.ht11.Launcher.main(args);
		case 13: 
			com.sourceit.java.basic.lesovaya.ht13.Launcher.main(args);
			break;
		case 14:
			com.sourceit.java.basic.lesovaya.ht14.Launcher.main(args);
			break;
		case 15:
			com.sourceit.java.basic.lesovaya.ht15.Card.main(args);
			break;
		case 16:
			try{
				com.sourceit.java.basic.lesovaya.ht15.IOTextStatistics.main(args);
			} catch(IOException ioex) {
				ioex.printStackTrace();
			}
			break;
		case 17:
			com.sourceit.java.basic.lesovaya.ct16.CountrySort.main(args);
			break;
		}
	}
	
	private static void printList(){
		System.out.println(" Выберите проект для запуска из следующего списка и введите его номер от 0 до 17");
		for (String s: nameOfPackage) {
			System.out.println(s);
		}
	}
}
