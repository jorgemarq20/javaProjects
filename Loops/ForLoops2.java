
public class ForLoops2 {

	public static void main(String[] args) {
		lowerCaseLetters ();
		countBackwards ();
		tenBackSlashes ();
	}

	private static void tenBackSlashes() {
		// This outputs 10 back slashes.
		for (char i = 1; i <= 10; i++)
		System.out.print("\\");
	}

	private static void countBackwards() {
		// Count backwards from 100 to 1.
		for (byte i = 100; i >= 1; i--);
		System.out.print(i + "");
	}

	private static void lowerCaseLetters() {
		// Output the lower case letters of the alphabet.
		for (char i = 'a'; i <= 'z'; i++);
		System.out.print(i);
	}

}
