/* 
 * Author: Jorge Marques
 * Date: 30/11/2001
 * 
 * This program reads three numbers and outputs their sum
 */
import java.util.Scanner;

public class AddThreeNumbers {
	static Scanner sc = new Scanner (System.in); // Global Variable
	
	static byte num1, num2, num3; // Global - they can be seen by all methods

	public static void main(String[] args) {
		welcome ();
		get3Numbers ();
		outputTheSum ();
		goodBye ();		
		sc.close ();
		
	}	
	private static void drawAline() {
		System.out.println ("____________________________");
		
	}
	private static void goodBye() {
		drawAline ();
		System.out.println ("\nThank you !!");
		drawAline ();
	}
	private static void outputTheSum() {
		int sum = num1 + num2 + num3;
		
		System.out.println (num1 + " + " + num2 + " + " + num3 + " = " + sum);
		
	}
	private static void welcome () {
	 // Welcoming user to the program
	
		System.out.println ("Welcome to the program.\n");
		drawAline ();
		System.out.println ("\nThis program adds three numbers and outputs their sum.");
	}	
	private static void get3Numbers () {
	 // Reads three numbers
		
		System.out.print ("\nEnter first number here: ");
		num1 = sc.nextByte ();
		System.out.print ("Enter second number here: ");
		num2 = sc.nextByte ();
		System.out.print ("Enter third number here: ");
		num3 = sc.nextByte ();
		
	}
	
}
