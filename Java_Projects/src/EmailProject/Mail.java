package EmailProject;

import java.util.Scanner;

public class Mail {
	private String firstName;
	private String lastName;
	private String password;
	private String department;
	private int mailBoxCapacity = 700;
	private String finalmail;
	private String alternativeEmailAddress;
	private String companyName = "Company.com";
	
//	create a constructor to recive first name and last name
	public Mail(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
//		System.out.println(this.firstName+" "+this.lastName);
		
		this.department = setDepartment();
//		System.out.println("Deaprtment code: "+this.department);
		
//		Calling a random password generate method
		this.password = randomPassword(8);
//		System.out.println("RandomPassword: "+ this.password);
		
//		For Creting entire mail id with details
		finalmail = firstName.toLowerCase()+ "." +lastName.toLowerCase()+"@" +department +"."+ companyName;
		System.out.println(finalmail);
		
//		printing the random password
		
		System.out.println("RandomPassword: "+ this.password);
	}
//	Ask them their department
	private String setDepartment() {
		System.out.println("Department codes\n1 Sales\n2 Development\n3 Accounting \n0 None \nSelect a department code: ");
		Scanner sc = new Scanner(System.in);
		int deptchoice = sc.nextInt();
		if(deptchoice==1) {return "sales";}
		else if (deptchoice==2) {return "Dev";}
		else if (deptchoice==3) {return "Accounting";}
		else if (deptchoice==0) {return "--";}
		else {return "Please Choose from the department codes";}
		
	}
//	Generate a random password
	
	private String randomPassword(int length) {
		String str = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%";
		char[] password = new char[length];
		for(int i=0;i<length;i++) {
			int rand = (int)(Math.random()*str.length());
			password[i] = str.charAt(rand);
		}
		return new String(password);
		
	}
//	set a mailbox capacity
	public void setmailBoxCapacity(int capacity) {
		this.mailBoxCapacity = capacity;
	}
//	set an alternate email
	
	public void setalternateEmail(String alteremail ) {
	  this.alternativeEmailAddress = alteremail;	
	}
//	change the password.
	public void setchangePwd(String password) {
		this.password = password;
	}
	public int getmailBoxCapacity() {
		return mailBoxCapacity;
	}
	public String getalternateEmail() {
		return alternativeEmailAddress;
	}
	public String getpassword() {
		return password;
	}
	
	public String display() {
		return "Display Name: " + firstName + " "+ lastName + "\nEmail: "+ finalmail +"\nMailBoxcapacity: "+ mailBoxCapacity+" mb";
		
	}
	

}
