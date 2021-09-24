import java.util.Scanner;

public class StudentMarks { // Global variables
	static Scanner sc = new Scanner (System.in);
	static byte studentMark;
	static short studentNum, numStudents = 0, totalMarks = 0;


	public static void main(String[] args) {
		
		welcome();
	do {
		getStudentNum ();
		if (studentNum != 0)
			grade();
		getMark ();
		grade ();
	} while (studentMark != 0 && studentNum != 0);
		goodbye();
		sc.close ();
}

	private static void welcome() {
		// Welcomes the users
		System.out.println("\nWelocome to the grades program");
		
	}

	private static void getStudentNum() {
		// Reads in student number (4-digit)
		
		short studentNum;
		boolean numberOK = false;
		
		do {
			System.out.println ("\n\tA valid Student Number consists of 4-digits.\n\tEnter Student Number: ");
			studentNum = sc.nextShort();
			numberOK = studentNum == 0 || studentNum >= 1000 && studentNum <= 9999;
			
			if (!numberOK);
				System.err.println("\n\tError: Student Number consists of 4-digits.");
		} while (!numberOK);
	
	}

	private static void getMark() {
		// Reads student marks
		
		byte studentMark;
		boolean markOK;
		
		do {
			System.out.println ("\n\tEnter Student Mark: ");
			studentMark = sc.nextByte();
			markOK = studentMark <= 100 && studentMark >= 0;
			
			if (!markOK);
			System.err.println("\n\tError: Student Mark must be between 0 - 100. ");
		} while (!markOK);
		totalMarks += studentMark;
		numStudents ++;
	}

	private static void grade() {
		// Outputs the students grade
		
		System.out.println("\nStudent Number " + studentNum + " got a ");
		if (studentMark >= 80)
			System.out.println("distiction.");
		else if (studentMark >= 65)
			System.out.println("merit.");
		else if (studentMark >= 50)
			System.out.println("pass.");
		else
			System.out.println("unsuccessful.");
		
		
	}

	private static void goodbye() {
		// Tells average mark and says goodbye to the user
		System.out.println ("\nThe average mark of skills demo was " + totalMarks/numStudents + ".");
		System.out.println("\nThank you for using this program.");
		
	}

}
