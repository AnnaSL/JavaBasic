package com.sourceit.java.basic.lesovaya.ht11;

import java.util.Map.Entry;

public class Launcher {

	public static void main(String[] args) {

		char targetChar = 'm';
		int targetCount = 18;
		TextStatisticsImpl text = new TextStatisticsImpl("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.");
		//TextStatisticsImpl text = new TextStatisticsImpl("Loroem iposouom dolor sit amet, coonsecootetooour adipisc");
		System.out.println("How often the character occurs in a text: " +  text.getCharFrequency(targetChar));
		System.out.println("The number of characters c: " + text.getCharCount(targetChar));
		System.out.println("Collection of unique characters and it's counts: "+ text.getChars());
		System.out.println("List of words in a text: " + text.words());
		System.out.println("The most popular char count: " + text.getMostPopularCharCount());
		System.out.println("The least popular char count: " + text.getLeastPopularCharCount());
		System.out.println("Char by count: " + Character.toString(text.getCharByCount(targetCount)));
		
		
	}

}
