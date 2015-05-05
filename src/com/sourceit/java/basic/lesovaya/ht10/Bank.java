package com.sourceit.java.basic.lesovaya.ht10;

import java.util.*;

public class Bank {
	
	private int ID;
	private String bankName;
	private String adress;
	private double totalSumOfMoney;
	
	private Set<BankAccount> setOfAccounts;
	
	
	public Bank(int id, String bankName, String adress, double totalSumOfMoney) {
		
		setOfAccounts = new HashSet<BankAccount>();		
		this.ID = id;
		this.bankName = bankName;
		this.adress = adress;
		this.totalSumOfMoney = totalSumOfMoney;
		
	}
	
	public void addAccout(BankAccount bankAccount) {
		setOfAccounts.add(bankAccount);
	}
	
	public BankAccount getAccountByOwnerID(int ownerID) {
		
		BankAccount bankAccount = null;
		
		for(BankAccount ba: setOfAccounts) {
			if(ba.getOwnerID() == ownerID) {
				bankAccount = ba;
				break;
			}
		}
		return bankAccount;
	}
	
	public double getTotalSumOfMoney() {
		return totalSumOfMoney;
	}
	
	public String getBankName() {
		return bankName;
	}
	
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	
	public BankAccount openBankAccount(Client newClient){
		BankAccount ba = new BankAccount(5, 123456, newClient.getID());
		setOfAccounts.add(ba);
		return ba;
	}
	
	public String toString(){
		return "Bank: " + bankName + ", " + adress + ", total sum: " + totalSumOfMoney + " usd";
	}
	
	

}
