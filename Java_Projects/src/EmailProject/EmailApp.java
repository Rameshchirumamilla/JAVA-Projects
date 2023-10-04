package EmailProject;

import java.util.Scanner;

public class EmailApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your First Name: ");
		String fn = sc.next();
        System.out.println("Enter Your Last Name: ");
		String ln = sc.next();
		Mail m = new Mail(fn, ln);
		
		System.out.println(m.display());
		
	}

}
