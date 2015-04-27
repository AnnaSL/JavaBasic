package com.sourceit.java.basic.lesovaya.ht8;

import java.util.Date;

public class HourlyPayWorker extends AbstractWorker {

	private static final double WORKING_DAY = 20.8;
	private static final int WORKING_HOUR = 8;

	private double hourlySalary;

	public HourlyPayWorker(int id, String firstName, String surName,
			Date dateOfBirth, String sex, double hourlySalary) {
		super(id, firstName, surName, dateOfBirth, sex);
		this.hourlySalary = hourlySalary;
	}

	@Override
	public Double averageMonthSalary() {
		return WORKING_DAY * WORKING_HOUR * hourlySalary;
	}

}
