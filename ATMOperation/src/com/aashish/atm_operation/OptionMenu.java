package com.aashish.atm_operation;

import java.util.HashMap;
import java.util.Scanner;

public class OptionMenu extends Account
{
	Scanner sc = new Scanner(System.in);
	
	HashMap<Integer, Integer> data = new HashMap<>();
	int choice ;
			
	
	public void getLogin()
	{
		boolean loggedIn = false;
		do {
		    try {
		    	data.put(9203768, 6971);
		    	data.put(8120507,9041);
				
				System.out.println("Welcome to the ATM Machine");
				System.out.print("Enter Your Customer Number: ");
				int custNum = Integer.parseInt(sc.nextLine());
				setCustomerNumber(custNum);
				
				System.out.print("Enter Your Pin Number: ");
				setPinNumber(Integer.parseInt(sc.nextLine()));
		       
		        if (data.containsKey(getCustomerNumber()) && data.get(getCustomerNumber()) == getPinNumber()) {
		            loggedIn = true;
		            getAccountType();
		        }
		        else 
		        {
		            System.err.println("Wrong Customer Number or PIN.\n");
		        }
		    } 
		    catch (NumberFormatException e) 
		    {
		        System.err.println("Invalid input. Please enter numbers only.\n");
		    }
		} while (!loggedIn);

		
	}
	
	public void getAccountType()
	{
		System.out.println("Select the Account you want to access: ");
		System.out.println("Type 1 - Current Account");
		System.out.println("Type 2 - Saving Account");
		System.out.println("Type 3 - Exit");
		System.out.print("Choice: ");
		
		 choice = Integer.parseInt(sc.nextLine());
		
		switch(choice)
		{
		 case 1:
			 getCurrentAccount();
			 break;
			 
		 case 2:
			 getSavingAccount();
			 break;
			 
		 case 3:
			 System.out.println("Thank You for using this ATM, bye.");
				break;
				
		default:
			getAccountType();
				 
		}	
	}
	
	public void getCurrentAccount()
	{
		System.out.println("Checking Account: ");
		System.out.println("Type 1 - View Balance");
		System.out.println("Type 2 - Withdraw Money");
		System.out.println("Type 3 - Deposit Funds");
		System.out.println("Type 4 - Exit");
		
		
		System.out.println("Choice: ");
		 choice = Integer.parseInt(sc.nextLine());
		
		switch(choice)
		{
		case 1:
			System.out.println("Your Account Balance: "+moneyFormat.format(getCurrentBalance()));
			getAccountType();
			break;
			
		case 2:
			getCurrentWithdrawInput();
			getAccountType();
			break;
			
		case 3:
			getCurrentDeposit();
			getAccountType();
			break;
			
		case 4:
			System.out.println("Thank You for using this ATM, bye.");
			break;
			
			default:
				System.out.println("\n"+"Invalid Choice"+"\n");
				getCurrentAccount();
		}
		
	}
	public void getSavingAccount()
	{
		System.out.println("Saving Account: ");
		System.out.println("Type 1 - View Balance");
		System.out.println("Type 2 - Withdraw Money");
		System.out.println("Type 3 - Deposit Funds");
		System.out.println("Type 4 - Exit");
		
		
		System.out.println("Choice: ");
		 choice = Integer.parseInt(sc.nextLine());
		switch(choice)
		{
		case 1:
			System.out.println("Your Account Balance: "+moneyFormat.format(getSavingBalance()));
			getAccountType();
			break;
			
		case 2:
			getSavingWithdrawInput();
			getAccountType();
			break;
			
		case 3:
			getSavingDeposit();
			getAccountType();
			break;
			
		case 4:
			System.out.println("Thank You for using this ATM, bye.");
			break;
			
			default:
				System.out.println("\n"+"Invalid Choice"+"\n");
				getSavingAccount();
		}
		
	}
}


