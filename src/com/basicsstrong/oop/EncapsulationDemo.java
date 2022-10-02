package com.basicsstrong.oop;

class Account{
	private double balance;
	
	public void setBalance(double balance) {
		//validation
		this.balance = balance;
		//more implementation
	}

	public double getBalance() {
		
	
		//validation
		return this.balance;
	}
}

public class EncapsulationDemo {

	public static void main(String[] args) {
		
		
		Account acc = new Account();
		acc.setBalance(1000);
		acc.getBalance();
		System.out.println(acc.getBalance());

	}

}
