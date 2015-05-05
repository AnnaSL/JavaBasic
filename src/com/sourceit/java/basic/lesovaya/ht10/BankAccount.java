package com.sourceit.java.basic.lesovaya.ht10;

public class BankAccount {
	private int ID;
	private double balance;
	private long accountNumber;
	private int ownerID;
	
	public BankAccount(int ID, long accountNumber, int ownerID){
		this.ID = ID;
		this.accountNumber = accountNumber;
		this.ownerID = ownerID;
	}
	
	public double getBalance(){
		return balance;
	}
	
	public long getAccountNumber(){
		return accountNumber;
	}
	
	public int getOwnerID(){
		return ownerID;
	}
	
	public void deposit(double sum){
		balance += sum;
		//TODO addiding sum to totallySumOfMoney
	}
	
	public void withdraw(double sum){
		if(balance < sum){
			System.out.println("There are not enough funds available in the account");
			return;
		} 
		balance -= sum;
	}
	
	public String toString(){
		return "Number of account: " + this.accountNumber + "; balance: " + this.balance;
	}
	
	@Override
	 public int hashCode()
	 {
		 final int PRIME = 31;
		    int result = 1;
		    result = PRIME * result + this.ID;
		    return result;
	 }
	
	@Override
	 public boolean equals(Object o) {
		 if(o == null)
	        {
	            return false;
	        }
	        if (o == this)
	        {
	           return true;
	        }
	        if (getClass() != o.getClass())
	        {
	            return false;
	        }
	        BankAccount e = (BankAccount) o;
	        return (this.getAccountNumber() == e.getAccountNumber());
	}

}
