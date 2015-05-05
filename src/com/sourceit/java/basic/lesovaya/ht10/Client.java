package com.sourceit.java.basic.lesovaya.ht10;

import java.util.Date;
import java.util.Random;

public class Client {
	private int ID;
	private String firstName;
	private String surName;
	private String patronymic;
	private Date dateOfBirth;
	private String sex;
	private String adress;
	private int identificationCode;
	private double sumOfMoney;

	public Client(int id, String firstName, String surName, String patronymic,
			Date dateOfBirth, String sex) {
		this.ID = id;
		this.firstName = firstName;
		this.surName = surName;
		this.patronymic = patronymic;
		this.dateOfBirth = dateOfBirth;
		this.sex = sex;
	}

	public int getID() {
		return ID;
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

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public Double getSumOfMoney() {
		return sumOfMoney;
	}

	public String toString() {
		return ID + " " + firstName + " " + surName + " ";
	}

	public void getCreditFromBank() {
		// TODO
	}

	public void depositToAccount(double sum, BankAccount bankAccount) {
		bankAccount.deposit(sum);
	}

}
