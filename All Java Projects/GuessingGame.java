import java.util.Random;
import java.util.Scanner;

public class GuessingGame {
	static Scanner sc = new Scanner (System.in);
	static byte guess;
	static byte numberToGuess = (byte) (new Random ().nextInt (99) + 1);

	public static void main(String[] args) {
	
	do {
		getGuess ();
		checkGuess ();
	} while (guess != numberToGuess);

}

	private static void checkGuess() {
		// Check the user's guess
		if (guess > numberToGuess)
			System.out.print("\n\tYou guessed too high!");
		else if (guess < numberToGuess)
			System.out.print("\n\tYou guessed too low!");
		else
			System.out.println("\n\tYou guessed the number!");
		
	}

	private static void getGuess() {
		// Gets user's guess
		System.out.print("\n\tWhat is your guess? : ");
		guess = sc.nextByte ();
		
	}

}
