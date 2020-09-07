package com.inher2;

public class SavingAcc extends Account {
	protected double minBalance;

	public SavingAcc(String accNo, double balance, String accHolderName, double minBalance) {
		super(accNo, balance, accHolderName);
		this.minBalance = minBalance;
	}

	public double getMinBalance() {
		return minBalance;
	}

	public void setMinBalance(double minBalance) {
		this.minBalance = minBalance;
	}
	
	

}
