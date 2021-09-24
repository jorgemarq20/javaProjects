/*
 * Author: Jorge Marques
 * Date: 09/11/2020
 * Program to calculate pension
 */

import java.io.PrintStream;
import java.util.Scanner;

public class Pension {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner (System.in);
		
		System.out.println ("Enter name here: ");
		String name = keyboard.nextLine ();
		System.out.println ("Enter age here: ");
		byte age = keyboard.nextByte ();
		System.out.println ("Enter salary here: ");
		
		if (age >= 65) {
			float salary = keyboard.nextFloat ();
		    System.out.println ("\n\t" + name + ", you are entitled to a pension of " + salary * .75);
		}
		
		else {
			System.out.println ("\n\t" + name + ", you are not entitled to a pension because you are not above 65 years old.");
		}
		
		keyboard.close ();
	}

}
