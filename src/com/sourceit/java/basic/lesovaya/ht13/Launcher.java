package com.sourceit.java.basic.lesovaya.ht13;

public class Launcher {

	public static void main(String[] args) {
		
		Corporation WhimsicalToys = new Corporation("WhimsicalToysInc");
		
		WhimsicalToys.addEmploee(new Employee("Mary", "Kolins"));
		WhimsicalToys.addEmploee(new Employee("John","Smith"));
		WhimsicalToys.addEmploee(new Employee("John","Kolins"));
		WhimsicalToys.addEmploee(new Employee("Jeremy","McConally"));
		WhimsicalToys.addEmploee(new Employee("Emily","Braun"));
		WhimsicalToys.addEmploee(new Employee("Denny","Parker"));
		WhimsicalToys.addEmploee(new Employee("Anne", "Stuart"));
		WhimsicalToys.addEmploee(new Employee("Emily","McConally"));
		WhimsicalToys.addEmploee(new Employee("Antony", "Parker"));
		
		System.out.println("******** Next employee receive a free toy:  ********");
		System.out.println(WhimsicalToys.getEployeeForGiveoutFreeToy());
		System.out.println("******** Next name will be named new toy: ********");
		System.out.println(WhimsicalToys.givingNameForToy());
		System.out.println("******** Map of the most popular names in company: ********");
		WhimsicalToys.getMostPopularNameMap();
		System.out.println("******** WaitingListForLacrosse: ******** ");
		WhimsicalToys.createWaitingList();
		
		
	}

}
