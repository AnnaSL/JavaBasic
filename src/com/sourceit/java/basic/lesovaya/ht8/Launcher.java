package com.sourceit.java.basic.lesovaya.ht8;

import java.util.*;

public class Launcher {

	public static void main(String[] args) {
		System.out.println("**************Sorted collection********************************");

		List<AbstractWorker> listOfWorkers = new ArrayList<AbstractWorker>();
		Calendar c = Calendar.getInstance();
		c.set(1990, 3, 20);
		listOfWorkers.add(new FixedPayWorker(1, "Mary", "Kolins", "", c.getTime(),
				"female", 500.00));
		c.set(1989, 1, 18);
		listOfWorkers.add(new FixedPayWorker(2, "John", "Smith", "", c.getTime(),
				"male", 800.00));
		c.set(1992, 4, 22);
		listOfWorkers.add(new HourlyPayWorker(3, "Jeremy", "McConally", "", c
				.getTime(), "male", 8.50));
		c.set(1987, 4, 15);
		listOfWorkers.add(new HourlyPayWorker(4, "Emily", "Braun", "", c.getTime(),
				"female", 14.50));
		c.set(1991, 8, 24);
		listOfWorkers.add(new FixedPayWorker(5, "Denny", "Parker", "", c.getTime(),
				"male", 500.00));
		c.set(1991, 5, 16);
		listOfWorkers.add(new HourlyPayWorker(6, "Anne", "Stuart", "",  c.getTime(),
				"female", 6.60));
		c.set(1991, 12, 10);
		listOfWorkers.add(new FixedPayWorker(7, "Antony", "Parker", "",
				c.getTime(), "male", 800.00));

		Collections.sort(listOfWorkers, new Comparator<AbstractWorker>() {

			@Override
			public int compare(AbstractWorker worker1, AbstractWorker worker2) {
				int sComp = worker1.compareTo(worker2);

				if (sComp != 0) {
					return sComp;
				} else {
					String firstName1 = worker1.firstName;
					String firstName2 = worker2.firstName;
					return firstName1.compareTo(firstName2);
				}
			}

		});

		for (AbstractWorker a : listOfWorkers) {
			System.out.println(a);
		}

		System.out.println("**************First 5 workers********************************");

		for (int i = 0; i < 5; i++) {
			System.out.println(listOfWorkers.get(i));
		}

		System.out.println("**************Last 3 workers of list********************************");

		for (int i = listOfWorkers.size() - 3; i < listOfWorkers.size(); i++) {
			System.out.println(listOfWorkers.get(i));
		}
	}
}
