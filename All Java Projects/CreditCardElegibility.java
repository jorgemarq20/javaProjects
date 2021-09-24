import java.util.Scanner;

public class CreditCardElegibility {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner (System.in);
		
		System.out.print("Enter the salary: ");
		float salary = keyboard.nextFloat ();
		
		if (salary > 30000) {
			System.out.println("You are entitled to a credit card!");
		}
		else {
			System.out.print("Enter the years service: ");
		}
		
		System.out.print("Enter the years service: ");
		byte yearsService = keyboard.nextByte ();
		
		// Determines if you are eligible for a credit card
		if (salary > 20000 && yearsService > 3)
			System.out.print("You are eligible for a credit card!");
		else
			System.out.print("You are not eligible for a credit card");
		
		keyboard.close();

	}

}
