package StudentDatabase;

import java.util.Scanner;

public class StudentDatabase {
	
	private String firstName;
	private String lastName;
	private int gradYear;
	private String studentId;
	private String courses;
	private int tuitionBalance = 0;
	private static int costOfCourse = 600;
	private static int id = 1000;
	
	
//	constructor : prompt the user to enter name and year of the student
	
	public void StudentDatabase1() {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Your first Name:");
		this.firstName = sc.nextLine();
		
		System.out.print("Enter your last Name:");
		this.lastName = sc.nextLine();
		
		System.out.print("1- Freshman\n2- Junior\n3-senior\nEnter Student class level:");
		this.gradYear = sc.nextInt();
		Generateid();
		
		//System.out.println(firstName+" "+lastName+" "+gradYear+" "+studentId);
		
		
	}
//	Generate an ID.
	
	private void Generateid() {
		this.studentId = gradYear+""+id;
	}
//	Enroll in courses
	
	
	public void enrollCourse() {
		do {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the courses you enrolled (Q for quit): ");
		String course = sc.nextLine();
		
		if(!course.equals("Q")) {
			courses = courses +"\n "+ course;
			tuitionBalance = tuitionBalance + costOfCourse; 
		}
		else {
			break;
		}
		
	
	}while(1!=0);
//	View balance
//	Pay tuition fee.
//	show status
//		System.out.println("Enrolled courses are: "+courses);
//		System.out.println("TuitionBalance Fee: "+ tuitionBalance);
	
	
	}
	
//	View Balance
	
	public void viewBalance() {
		System.out.println("The remaining Balance is : $"+tuitionBalance);
	}
	
	public void payTuition() {
		viewBalance();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter amount you want to pay right now: $");
		int payment = sc.nextInt();
		tuitionBalance = tuitionBalance-payment;
		System.out.println("Thanks for your payment: $"+payment);
		viewBalance();
		
	}
	public String showInfo() {
		
		return "First Name: " + firstName +" "+lastName+"\nGradeYear: "+gradYear+"\nStudentId: "+studentId+"\nCourses: "+courses+"\nThe remaining Balance is: $"+tuitionBalance;
		
	}
}
