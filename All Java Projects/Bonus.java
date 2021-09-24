/*
 * Author: Jorge Marques
 * Date: 09/11/2020
 * Program to calculate bonus to employees
 */

import java.util.Scanner;

public class Bonus {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner (System.in);
		
		System.out.println ("Enter the years worked: ");
		byte yearsworked = keyboard.nextByte ();
		short bonus;
		
		if (yearsworked <= 9) {
			bonus = 2000;
		}
		
		else { 
			byte yearsover9 = (byte) (yearsworked - 9);
			bonus =(short) (2000 + yearsover9 * 300);
		}
		
		System.out.println ("The bonus due is €" + bonus);
		keyboard.close ();
	}

}
