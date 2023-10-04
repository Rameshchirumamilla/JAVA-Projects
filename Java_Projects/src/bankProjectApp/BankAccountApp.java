package bankProjectApp;

import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

public class BankAccountApp {

	public static void main(String[] args) throws IOException {
		
		List<Account> ac = new LinkedList<Account>();
		
		String file = "C:\\Users\\rames\\Downloads\\temp.csv";
		// TODO Auto-generated method stub
		/*
		Checkings cks = new Checkings("Ramesh","123654848", 800.256);
		cks.showInfo();
		
		Savings sks = new Savings("Anil","321458956",2800);
		System.out.println("******************");
		sks.showInfo();
//		Read a .csv file then create a new account based on the data.
		
		sks.deposit(2500.23);
		sks.withDraw(1000);
		cks.transfer("Rams", 500);
		
       sks.compound();
       */
		
		
		List<String[]> newAccoHolders = utility.csv.read(file);
		for(String[] acchold: newAccoHolders) {
			System.out.println();
			System.out.println("New Account");
			System.out.println("*************************");
			String name = acchold[0];
			String sSN = acchold[1];
			String accType = acchold[2];
			double iniDeposit = Double.parseDouble(acchold[3]);
			
			System.out.print("\nName: "+name+"\nSSN: "+sSN+"\niniDeposit: $"+iniDeposit);
			
			if(accType.equals("Savings")) {
				ac.add(new Savings(name,sSN,iniDeposit));
				//System.out.print("\nOpen a SAVINGS account");
			}
			else if(accType.equals("Checkings")) {
				ac.add(new Checkings(name,sSN,iniDeposit));
				System.out.print("\nOpen a CHECKINGS account");
			}
			else
				System.out.print("\nPrint Error in reading account type");
			
		}

//	ac.get(5).showInfo();
	
	for(Account ac1:ac) {
		ac1.showInfo();
	}

}
}