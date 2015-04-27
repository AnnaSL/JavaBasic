package com.sourceit.java.basic.lesovaya.ht8;

import java.util.Date;

public class FixedPayWorker extends AbstractWorker {

	private double salary;

	public FixedPayWorker(int id, String firstName, String surName,
			Date dateOfBirth, String sex, double salary) {

		super(id, firstName, surName, dateOfBirth, sex);
		this.salary = salary;
	}

	@Override
	public Double averageMonthSalary() {
		return salary;
	}

}
