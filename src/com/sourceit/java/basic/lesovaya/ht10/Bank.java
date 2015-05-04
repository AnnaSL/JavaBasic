package com.sourceit.java.basic.lesovaya.ht10;

import java.util.*;

public class Bank {
	
	private int ID;
	private String name;
	private String adress;
	private double totallySumOfMoney;
	
	private Set<BankAccount> setOfAccounts;
	
	public Bank(){
		setOfAccounts = new HashSet<BankAccount>();
	}
	
	public void addAccout(BankAccount bankAccount) {
		setOfAccounts.add(bankAccount);
	}
	
	public BankAccount getAccountByOwnerID(int ownerID) {
		
		BankAccount bankAccount = null;
		
		for(BankAccount ba: setOfAccounts){
			if(ba.getOwnerID() == ownerID){
				bankAccount = ba;
				break;
			}
		}
		return bankAccount;
	}
	
	

}
