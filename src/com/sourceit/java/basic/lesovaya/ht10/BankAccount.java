package com.sourceit.java.basic.lesovaya.ht10;

public class BankAccount {
	private int ID;
	private double balance;
	private int accountNumber;
	private int ownerID;
	
	public BankAccount(int ID, int accountNumber, int ownerID){
		this.ID = ID;
		this.accountNumber = accountNumber;
		this.ownerID = ownerID;
	}
	
	public double getBalance(){
		return balance;
	}
	
	public int getAccountNumber(){
		return accountNumber;
	}
	
	public int getOwnerID(){
		return ownerID;
	}
	
	public void deposit(double sum){
		balance += sum;
	}
	
	public void withdraw(double sum){
		if(balance < sum){
			System.out.println("There are not enough funds available in the account");
			return;
		} 
		balance -= sum;
	}
	
	public String toString(){
		return "Number of account: " + accountNumber;
	}

}
