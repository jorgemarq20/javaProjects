import java.util.Scanner;

public class IfStatement {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner (System.in);
		System.out.print("Enter a number here: ");
		short number = keyboard.nextShort ();
		
		if (number % 2 == 0) {
			System.out.println (number + " is even.");
		}
		
		else {
			System.out.println (number + " is odd.");
		}
		
		keyboard.close ();
		
	
	}

}
