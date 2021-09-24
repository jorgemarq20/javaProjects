/*
 * Author: Jorge Marques
 * Date: 09/11/2020
 * Program to calculate bonus to employees
 */


import java.util.Scanner;

public class AlternateBonus {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner (System.in);
		
		System.out.println ("Enter the years worked: ");
		byte yearsworked = keyboard.nextByte ();
		short bonus= 2000;
		
		if (yearsworked > 9) {
			byte yearsover9 = (byte)(yearsworked - 9);
			bonus = (short)(bonus + yearsover9 * 300);
		}
		
		System.out.println ("The bonus due is €" + bonus);
		keyboard.close ();
	}

}
