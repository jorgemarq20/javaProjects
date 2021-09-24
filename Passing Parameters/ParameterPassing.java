
public class ParameterPassing {

	public static void main(String[] args) {
		
		drawALine (80, '~', true);
		drawALine (40, '=', true);
		drawALine (20, '\u2500', true);
		
		drawALine (80, '\u250C', '\u2510'); // Top.
		drawALine (50, '\u2514', '\u251A'); // Bottom.
		
		setW (15, "Hello"); // Right align Hello in a zone width of 20.
		setW (15 , "World"); // Right align Hello in a zone width of 15.
		setW (30 , "Hello World"); // Space between "Hello" and "World" is considered a space.
		
		timeTables (4);
		timeTables (9);
		timeTables (12);
	}
	
	

	private static void timeTables(int numMultiples) {
		for (byte i = 1; i <= 12; i++);
		 	System.out.println(i + "\t*\t");
		
	}



	private static void setW(int zoneWidth, String theString) {
		drawALine (zoneWidth - theString.length(), ' ', false);
		System.out.println (theString);
	}


	private static void drawALine(int numChars, char cornorOne, char cornorTwo) {
		System.out.print(cornorOne);
		drawALine (numChars, '\u2500', false);
		System.out.print(cornorTwo);
		System.out.println ();
		
	}



	private static void drawALine(int numChars, char charToDraw, boolean printSpace) {
		for (int i = 1; i <= numChars; i++)
			System.out.print(charToDraw);
		if (printSpace) // Default to "True".
			System.out.println ();
		
	}

}
