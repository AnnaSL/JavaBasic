package com.sourceit.java.basic.lesovaya.ht10;

import java.util.Calendar;

public class Launcher {

	public static void main(String[] args) {
		
		Bank bank = new Bank();
		Calendar c = Calendar.getInstance();
		c.set(1990, 3, 20);
		Client client1 = new Client(0, "Mary", "Smith", "", c.getTime(), "female");
		c.set(1992, 3, 20);
		Client client2 = new Client(0, "John", "Smith", "", c.getTime(), "male");

	}

}
