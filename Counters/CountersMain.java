
public class CountersMain {

	public static void main(String[] args) {
		Counters counter1 = new Counters ("White", (byte)1), 
				 counter2 = new Counters ("Black", (byte)10);
		boolean clash = false;
		
		while (!clash) {
			counter1.getMovement();
			counter1.print();
			if (counter1.checkForClash (counter2))
				System.out.println ("White Wins!");
				clash = true;
			counter2.getMovement();
			counter2.print();
			if (counter2.checkForClash (counter1))
				System.out.println ("Black Wins!");
				clash = true;
		}
	}

}
