
public class Introduction {

	public static void main(String[] args) {
		drawALine ();
		helloWorld ();
		questionOne ();
		questionTwo ();
		questionThree ();
		questionFour ();
		questionFive ();
		questionSix ();
		questionSeven ();
		questionEight ();
		questionNine ();
		questionTen ();

	}

	private static void drawALine() {
		for (byte i = 1; i <= 80; i++)
		System.out.print ('\u2500');
		System.out.println ();
	}

	private static void helloWorld() {
		for (byte i = 1; i <= 3; i++)
		System.out.print ("Hello World!");
		System.out.print ("\n");
		
	}

	private static void questionOne() {
		for (byte i = 1; i<=5; i++) 
			System.out.print (i);
		System.out.print ("\n");
		
	}

	private static void questionTwo() {
		for (byte i = 1; i<=10; i+=2) 
			System.out.println (i);
		System.out.print ("\n");
		
	}

	private static void questionThree() {
		for (byte i = 1; i<=8; i++) 
			System.out.print ('*');
		System.out.print ("\n");
		
	}

	private static void questionFour() {
		for (byte i = 1; i<=0; i++) 
			System.out.print (i);
		System.out.print ("\n");
		
	}

	private static void questionFive() {
		byte sum = 0; 
				for (byte i = 1; i <=5 ;i++) 
					sum += i; 
		System.out.print (sum);	
		System.out.print ("\n");
	}

	private static void questionSix() {
		for (byte i = 5; i >= 1; i--) 
			System.out.print (i);
		System.out.print ("\n");
		
	}

	private static void questionSeven() {
		for (byte i = 5; i <= 1; i--)
			System.out.print (i);
		System.out.print ("\n");
	}

	private static void questionEight() {
		for (byte i = 1; i <= 10; i++) 
			if (i % 3 == 0) 
				System.out.print (i);
		System.out.print ("\n");
		
	}

	private static void questionNine() {
		for (char i = 'A'; i <= 'Z'; i++)
			System.out.print (i);
		System.out.print ("\n");
		
	}

	private static void questionTen() {
		for (float i = 1; i <= 5; i += 0.5)
			System.out.print (i);
		System.out.print ("\n");
		
	}

}
