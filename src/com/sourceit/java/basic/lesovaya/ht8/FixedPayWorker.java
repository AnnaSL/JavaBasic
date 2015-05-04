package com.sourceit.java.basic.lesovaya.ht8;

import java.util.Date;

public class FixedPayWorker extends AbstractWorker {

	private double salary;

	public FixedPayWorker(int id, String firstName, String surName, String patronymic, 
			Date dateOfBirth, String sex, double salary) {

		super(id, firstName, surName, patronymic, dateOfBirth, sex);
		this.salary = salary;
	}

	@Override
	public Double averageMonthSalary() {
		return salary;
	}

}
