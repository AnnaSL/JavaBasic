package com.sourceit.java.basic.lesovaya.ht10;

import java.util.Calendar;

public class Launcher {

	public static void main(String[] args) {

		Bank bank = new Bank(1, "Aval", "Novgorodskaya street, 15", 150000.00);
		Calendar c = Calendar.getInstance();
		c.set(1990, 3, 20);
		Client client1 = new Client(0, "Mary", "Smith", "", c.getTime(),
				"female");
		c.set(1992, 3, 20);
		Client client2 = new Client(1, "John", "Smith", "", c.getTime(), "male");
		bank.openBankAccount(client1);
		bank.openBankAccount(client2);
		System.out.println(bank.toString());
		bank.printSetOFAccount();
		System.out.println("***************New balance*****************");
		client1.depositToAccount(500, bank.getAccountByOwnerID(client1.getID()));
		client2.depositToAccount(1000, bank.getAccountByOwnerID(client2.getID()));
		bank.printSetOFAccount();

	}

}
