package StudentDatabase;

import java.util.Scanner;

class StudentDatabaseApp {

	public static void main(String[] args) {
		
//How many new students do we need to add in database.
		
//		Create n number of new students. 
		StudentDatabase sdp = new StudentDatabase(); 
		
		
//		sdp.StudentDatabase();
//		sdp.viewBalance();
		
		
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number of Students you want to enroll: ");
		
		int num_of_students = sc.nextInt();
		StudentDatabase[] students = new StudentDatabase[num_of_students];
		int a = 1;
		
		for(int i=0;i<num_of_students;i++) {
			
			System.out.print("  *****Enter "+(a++)+" Student Details*****  \n" );
			students[i] = new StudentDatabase();
			students[i].StudentDatabase1();
			students[i].enrollCourse();
			students[i].payTuition();
			System.out.println(students[i].showInfo());
			
			
		}
		
		
		
		
	}

}
