package com.aashish.atm_operation;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Account 
{
	private int customerNumber;
	private int pinNumber;
	private double currentBalance = 0;
	private double savingBalance = 0;
	
	DecimalFormat moneyFormat = new DecimalFormat("'$'###,##0.00");
	Scanner sc = new Scanner(System.in);

	public int getCustomerNumber() {
		return customerNumber;
	}

	public void setCustomerNumber(int customerNumber) {
		this.customerNumber = customerNumber;
	}

	public int getPinNumber() {
		return pinNumber;
	}

	public void setPinNumber(int pinNumber) {
		this.pinNumber = pinNumber;
	}

	public double getCurrentBalance() {
		return currentBalance;
	}

	public void setCurrentBalance(double checkingBalance) {
		this.currentBalance = checkingBalance;
	}

	public double getSavingBalance() {
		return savingBalance;
	}

	public void setSavingBalance(double savingBalance) {
		this.savingBalance = savingBalance;
	}

	public DecimalFormat getMoneyFormat() {
		return moneyFormat;
	}

	public void setMoneyFormat(DecimalFormat moneyFormat) {
		this.moneyFormat = moneyFormat;
	}
	
	public void currentWithdraw(double amount)
	{
		currentBalance = currentBalance-amount;
		//return currentBalance;
	}
		
	public void savingWithdraw(double amount)
	{
		savingBalance = savingBalance-amount;
		//return savingBalance;
	}
	
	public void currentDeposit(double amount)
	{
		currentBalance = currentBalance+amount;
		//return currentBalance;
		                        
	}
	
	public void savingDeposit(double amount)
	{
		savingBalance = savingBalance + amount;
		//return savingBalance;
	}
	
	public void getCurrentWithdrawInput()
	{
		System.out.println("Current Account Balance: "+moneyFormat.format(currentBalance));
		System.out.println("Amount you want to withdraw form Current Account: ");
		
		double amount = Double.parseDouble(sc.nextLine());
		
		if(amount < 0)
		{
			System.err.println("amount should not be negative");
		}
		else if(currentBalance - amount >= 0 )
		{
			currentWithdraw(amount);
			System.out.println("New Current Account balance: "+moneyFormat.format(currentBalance));
		}
		else {
			System.err.println("Insufficient balance");
		}
	}
	
	public void getCurrentDeposit()
	{
		System.out.println("Checking Account Balance: "+moneyFormat.format(currentBalance));
		System.out.println("Amount you want to deposit form Current Account: ");
		
		double amount = Double.parseDouble(sc.nextLine());
		
	   if(amount > 0 )
		{
			currentDeposit(amount);
			System.out.println("New Current Account balance: "+moneyFormat.format(currentBalance));
		}
		else {
			System.err.println("amount should not be negative");
		}
	}
	
	
	
	public void getSavingWithdrawInput()
	{
		System.out.println("Saving Account Balance: "+moneyFormat.format(savingBalance));
		System.out.println("Amount you want to withdraw form Saving Account: ");
		
		double amount = Double.parseDouble(sc.nextLine());
		
		if(amount < 0)
		{
			System.err.println("amount should not be negative");
		}
		else if(savingBalance - amount >= 0 )
		{
			savingWithdraw(amount);
			System.out.println("New Saving Account balance: "+moneyFormat.format(savingBalance));
		}
		else {
			System.err.println("Insufficient balance");
		}
	}
	
	public void getSavingDeposit()
	{
		System.out.println("Checking Account Balance: "+moneyFormat.format(currentBalance));
		System.out.println("Amount you want to deposit form Saving Account: ");
		
	    double amount = Double.parseDouble(sc.nextLine());
		
	   if(amount >0 )
		{
			savingDeposit(amount);
			System.out.println("New Saving Account balance: "+moneyFormat.format(savingBalance));
		}
		else {
			System.err.println("amount should not be negative");
		}
	   
	}
	
}
