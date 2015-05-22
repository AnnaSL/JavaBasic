package com.sourceit.java.basic.lesovaya.ht13;

import java.util.*;

public class Corporation {

	private String name;
	private List<Employee> employeesList;
	private Set<String> employeesNameSet;
	private Map<String, Integer> employeesPopularNameMap;
	private Queue<Employee> employeesQueue;

	public Corporation(String name) {
		this.name = name;
		this.employeesList = new ArrayList<Employee>();
		this.employeesNameSet = new HashSet<>();
		this.employeesPopularNameMap = new TreeMap<>();
		this.employeesQueue = new ArrayDeque<Employee>();
	}

	public String getName() {
		return name;
	}

	public void addEmploee(Employee empl) {
		employeesList.add(empl);
		employeesNameSet.add(empl.getFirstName());
	}

	@Override
	public String toString() {
		return this.name;
	}

	public Employee getEployeeForGiveoutFreeToy() {
		Employee emp = null;
		int indexRandom = (int) (Math.random() * employeesList.size());
		if (!employeesList.isEmpty()) {
			emp = employeesList.get(indexRandom);
		}
		return emp;
	}

	public String givingNameForToy() {
		int indexRandom = (int) (Math.random() * employeesNameSet.size());
		String name = employeesList.get(indexRandom).getFirstName();
		if (employeesNameSet.contains(name)) {
			employeesNameSet.remove(name);
		}
		return name;
	}

	private int getCountOfName(String name) {
		int count = 0;
		if(!employeesList.isEmpty()) {
			for(Employee e: employeesList) {
				if(e.getFirstName().equals(name)) {
					count++;
				}
			}
		}

		return count;
	}
	
	public Map<String, Integer> getMostPopularNameMap(){		
		if(!employeesList.isEmpty()) {
			for(Employee e: employeesList) {
				employeesPopularNameMap.put(e.getFirstName(), getCountOfName(e.getFirstName()));
			}
		}
		System.out.println(employeesPopularNameMap);
		return employeesPopularNameMap;
	}

	public void createWaitingList() {
		if(!employeesList.isEmpty()) {
			for(Employee e: employeesList) {
				employeesQueue.offer(e);
			}
		}
		System.out.println(employeesQueue);
	}

}
