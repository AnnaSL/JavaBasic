package com.sourceit.java.basic.lesovaya.ht8;

import java.util.Date;

public abstract class AbstractWorker implements Comparable<AbstractWorker> {

	protected int workerID;
	protected String firstName;
	protected String surName;
	protected String patronymic;
	protected Date dateOfBirth;
	protected String sex;

	public AbstractWorker(int id, String firstName, String surName,
			Date dateOfBirth, String sex) {
		this.workerID = id;
		this.firstName = firstName;
		this.surName = surName;
		this.dateOfBirth = dateOfBirth;
		this.sex = sex;
	}

	public abstract Double averageMonthSalary();

	public String toString() {
		return workerID + " " + firstName + " " + surName + " "
				+ averageMonthSalary() + " usd";
	}

	@Override
	public int compareTo(AbstractWorker aWorker) {

		if (aWorker.averageMonthSalary() > this.averageMonthSalary()) {
			return -1;
		} else if (aWorker.averageMonthSalary() < this.averageMonthSalary()) {
			return 1;
		}
		return 0;
	}

}
