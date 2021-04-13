package BankAccount;

public class BankAccountMain {

	public static void main(String[] args) { 

	  
		
		Customer uzaktankumanda = new Customer(0, null, null, 0, null, 0, 0);
		
		System.out.print("Enter your ID:");
		int iD = Customer.scanInt.nextInt();
		uzaktankumanda.setID(iD);
		
		System.out.print("Enter your name:");
		String namee = Customer.scanStr.nextLine();
		uzaktankumanda.setName(namee);
		
		
		System.out.print("Enter your surname:");
		String surnamee = Customer.scanStr.nextLine();
		uzaktankumanda.setSurname(surnamee);
		
		
		System.out.print("Enter your birth year:");
		int birthYearr = Customer.scanInt.nextInt();
		uzaktankumanda.setBirthYear(birthYearr);
	
		
		System.out.print("Enter your TCKN:");
		String tckn = Customer.scanStr.nextLine();
		uzaktankumanda.setTCKN(tckn);
		
	
		System.out.print("Enter your balance:");
		int balancee = Customer.scanInt.nextInt();
		uzaktankumanda.setBalance(balancee);
	
		
		System.out.print("Enter your debt:");
		int debtt = Customer.scanInt.nextInt();
		uzaktankumanda.setDebt(debtt);
	
		
		uzaktankumanda.upload_money();
		uzaktankumanda.withdraw_money();
		uzaktankumanda.take_credit();
		uzaktankumanda.show_customer();
		
		//Customer save = new Customer();
		//save.save_customer();
		
	}

}
