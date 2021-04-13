package BankAccount;

import java.util.Scanner;

public class Customer {

	// Properties
	public int ID;
	public String name;
	public String surname;
	public int birthYear;
	public String TCKN;
	public int balance;
	public int debt;
	public static Scanner scanStr = new Scanner(System.in);
	public static Scanner scanInt = new Scanner(System.in);
    
	// Constructor
	public Customer(int ID, String name, String surname, int birthYear, String TCKN, int balance, int debt) {
		this.ID = ID;
		this.name = name;
		this.surname = surname;
		this.birthYear = birthYear;
		this.TCKN = TCKN;
		this.balance = balance;
		this.debt = debt;

	}
	

	public int getID() {
		return ID;
	}


	public void setID(int iD) {
		ID = iD;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getSurname() {
		return surname;
	}


	public void setSurname(String surname) {
		this.surname = surname;
	}


	public int getBirthYear() {
		return birthYear;
	}


	public void setBirthYear(int birthYear) {
		this.birthYear = birthYear;
	}


	public String getTCKN() {
		return TCKN;
	}


	public void setTCKN(String tCKN) {
		TCKN = tCKN;
	}


	public int getBalance() {
		return balance;
	}


	public void setBalance(int balance) {
		this.balance = balance;
	}


	public int getDebt() {
		return debt;
	}


	public void setDebt(int debt) {
		this.debt = debt;
	}


	public static Scanner getScanStr() {
		return scanStr;
	}


	public static void setScanStr(Scanner scanStr) {
		Customer.scanStr = scanStr;
	}


	public static Scanner getScanInt() {
		return scanInt;
	}


	public static void setScanInt(Scanner scanInt) {
		Customer.scanInt = scanInt;
	}


	// Behaviours
	public void upload_money() {
		System.out.println("Enter how much money you want to upload:");
		int scanupload = scanInt.nextInt();
		System.out.println("Your updated balance is:" + "" + (this.balance + scanupload));
		this.balance += scanupload;
	}

	public void withdraw_money() {
		System.out.println("Enter how much money you want to withdraw: ");
		int scanwithdraw = scanInt.nextInt();
		
		if(scanwithdraw > this.balance) {
	
			System.out.println("You don't have enough money.");
		}	
	    else {

			System.out.println("Your updated balance is:" + "" + (this.balance - scanwithdraw));
			this.balance -= scanwithdraw;
		}
	}

	public void take_credit() {
		System.out.println("Enter how much credit you want to take:");
		int scancredit = scanInt.nextInt();
		System.out.println("Your updated balance is:" + "" + (this.balance + scancredit));
		System.out.println("Your updated debt is:" + "" + (this.debt + scancredit));
		this.balance += scancredit;
		this.debt += scancredit;
	}
    //Shows customer information
	public void show_customer() {
		System.out.println("Customer information with this ID:");
		System.out.println("----------" + this.ID + "----------");
		System.out.println("--"+"Name:"+this.name);
		System.out.println("--"+"Surname:"+this.surname);
		System.out.println("--"+"Birth Year:"+this.birthYear);
		System.out.println("--"+"TCKN"+this.TCKN);
		System.out.println("--"+"Balance:"+this.balance);
		System.out.println("--"+"Debt:"+this.debt);
	}
	// save customer?
}
