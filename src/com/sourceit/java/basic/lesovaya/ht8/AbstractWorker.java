package com.sourceit.java.basic.lesovaya.ht8;

import java.util.Date;

public abstract class AbstractWorker implements Comparable<AbstractWorker> {

	protected int workerID;
	protected String firstName;
	protected String surName;
	protected String patronymic;
	protected Date dateOfBirth;
	protected String sex;

	public AbstractWorker(int id, String firstName, String surName, String patronymic, 
			Date dateOfBirth, String sex) {
		this.workerID = id;
		this.firstName = firstName;
		this.surName = surName;
		this.patronymic = patronymic;
		this.dateOfBirth = dateOfBirth;
		this.sex = sex;
	}
	
	public int getWorkerID() {
		return workerID;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getSurName() {
		return surName;
	}
	
	public void setSurName(String surName) {
		this.surName = surName;
	}
	
	public void setPatronymic(String patronymic) {
		this.patronymic = patronymic;
	}
	
	public String getPatronymic() {
		return patronymic;
	}
	
	public Date getDateOfBirth() {
		return dateOfBirth;
	}
	
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	
	public String getSex() {
		return sex;
	}
	
	public void setSex(String sex) {
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
