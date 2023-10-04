package bankProjectApp;

public class Checkings extends Account {
	
//	list properties of checking account
	
	
	private int debitNum;
	
  private int debitPin;
	
//	Constructor to initilize the account properties
	
	public Checkings(String name, String sSN, double iniBal) {
		
		super(name,sSN,iniBal);
		accountNum = "1"+accountNum;
//		
//		System.out.print("\nAccount Number: "+accountNum);
//		
//		System.out.print("\nThis is the new Checking account");
//		System.out.println("Name: "+name);
		
		
		setDebitCard();
	}
   @Override
	public void setBaseRate() {
		rate = getbaseRate() * .15;
	}
	public void showInfo() {
		super.showInfo();
		System.out.println("CHECKINGS Account Features are: "+""
				+ "\nDebit Card Number:"+debitNum+"\nDebit Card PIN: "+debitPin);
//		System.out.print("\n Rate for checkings account is: "+rate);
	}
//	List any methods that are specific to accounts
	
	private void setDebitCard() {
		debitNum = (int)(Math.random()*Math.pow(10, 12));
		debitPin = (int)(Math.random()*Math.pow(10, 4));
	}

}
