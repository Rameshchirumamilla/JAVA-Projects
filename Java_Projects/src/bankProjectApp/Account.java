package bankProjectApp;

public abstract class Account implements IrtBaseRate {
	
//	list common properties of ckng and svngs
	
	private String name;
	private String sSN;
	private double iniBal;
	
	protected String accountNum;
	protected double rate;
	
	private static int ind = 10000;
	
//	Constructor to set the base properties and initialize that account
	
	public Account(String name, String sSN, double iniBal) {
		
		this.name = name;
		this.sSN = sSN;
		this.iniBal = iniBal;
				
		ind++;
//		Set account number
		this.accountNum = setAccountNum();
	}
	
	public abstract void setBaseRate();
	
	private String setAccountNum() {
		String l2ssn = sSN.substring(sSN.length()-2,sSN.length());
		int ranNum = (int)(Math.random()*Math.pow(10, 3));
		return l2ssn+ind + ranNum;
	}
	
	public void compound() {
		double interest = iniBal * (rate/100);
		System.out.println("Interest Rate: $"+interest);
		printBalance();
		
	}
	
//	List of common methods
	public void deposit(double amount) {
		
		iniBal = iniBal + amount;
		System.out.print("\nDepositing Amount"+amount);
		printBalance();
	}
	
	public void withDraw(double amount) {
		
		iniBal = iniBal - amount;
		
		System.out.println("With drawal Amount"+amount);
		printBalance();
		
	}
	
	public void transfer(String toWhere, double amount) {
		
		iniBal = iniBal - amount;
		
		System.out.println("Transfering $"+amount+" to Where "+toWhere);
		printBalance();
	}
	public void printBalance() {
		System.out.println("Your Balance is: "+iniBal);
	}
	
	public void showInfo() {
		System.out.println("\nName:" + name + "\nAccount Number:"
	        + accountNum + "\nBalance:" + iniBal + "\nRate:" + rate+"%");
	}

}
