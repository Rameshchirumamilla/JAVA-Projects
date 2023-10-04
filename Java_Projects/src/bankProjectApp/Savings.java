package bankProjectApp;

public class Savings extends Account {
	
//	List the properties specific to savings account
	
	
	private int safetydepositBoxId;
	
	private int safetyDepositBoxKey;
	
//	To constructor initialize the account specific to savings
	
	public Savings(String name,String sSN, double iniBal) {
		
		super(name,sSN,iniBal);
		
		accountNum = "2"+accountNum;
//		
//		System.out.print("\nAccount Number: "+accountNum);
//		
//		System.out.print("\nNew Savings Account");
		
//		System.out.println("New Savings Accountant Name is "+name);
		
		
		setSafetyDepositBox();
		setSafetyDepositAccess();
		
	}
	@Override
	public void setBaseRate() {
		rate = getbaseRate() -.25;
	}
	
	public void showInfo() {
		super.showInfo();
		
		System.out.println("Your Savings Features are ");
		
		System.out.print("The Safety Box Id is: "+safetydepositBoxId);
		
		System.out.print("\nThe Access Code is "+safetyDepositBoxKey);
         
//	    System.out.print("\nRate for Savings account is: "+rate);	
	}
//	List any methods that are specific to savings
	
	public void setSafetyDepositBox() {
		safetydepositBoxId = (int)(Math.random()*Math.pow(10, 3));
		
		
	}
	private void setSafetyDepositAccess() {
		safetyDepositBoxKey = (int)(Math.random()*Math.pow(10, 4));
		
		
		
	}

}
