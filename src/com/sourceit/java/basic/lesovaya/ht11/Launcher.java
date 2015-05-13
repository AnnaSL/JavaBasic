package com.sourceit.java.basic.lesovaya.ht11;

public class Launcher {

	public static void main(String[] args) {

		//TextStatisticsImpl text = new TextStatisticsImpl("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.");
		TextStatisticsImpl text = new TextStatisticsImpl("Loroem iposouom dolor sit amet, coonsecootetooour adipisc");
		text.getChars();
		text.words();
		System.out.println("Char frequency: " + text.getCharFrequency('o'));
		
		
	}

}
