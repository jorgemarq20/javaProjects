/*
 * Author: Jorge Marques
 * Date: 09/11/2020
 * Program to calculate is account is overdraft
 */


import java.util.Scanner;

public class Overdraft {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner (System.in);
		
		System.out.println ("Enter account number here: ");
		short accountNum = keyboard.nextShort ();
		System.out.println ("Enter account balance here: ");
		float accountBalance = keyboard.nextFloat ();
		
		if (accountBalance >= 0) {
			System.out.println ("Account" + accountBalance + "is not overdrawn.");
			
}
		else {
			System.out.println ("OH NO !?!?" + "Account" + accountBalance + "is overdrawn !");
		}
		
	}		
		keyboard.close ();
