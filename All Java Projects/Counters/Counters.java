import java.util.Scanner;

public class Counters {
	
	private String colour;
	private byte rowNumber, columnNumber, numHops;
	
	public Counters (String col, byte location) {
		// Better to use a constructor to initialize member values.
		
		colour = col;
		rowNumber = columnNumber = location;
		}
	
	public void print () {
		System.out.println ("The " + colour + " counter is at location (" + rowNumber + ", " + columnNumber + ")");
	}
	
	public void getMovement () {
		Scanner sc = new Scanner (System.in);
		String direction;
		boolean directionOK;
		
		do {
			System.out.println("\nEnter the direction for " + colour + ": ");
			direction = sc.nextLine().toUpperCase();
			directionOK = direction.equals("L") || direction.equals("R") || direction.equals("U") || direction.equals("D");
			if (!directionOK)		
				System.out.println ("\n\tError - Direction must be an l, r, u or d.\n");
		} while (!directionOK);
			
		do {
			System.out.println("\tHow many hops:\t ");
			numHops = sc.nextByte();
			if (numHops < 0)
				System.out.println ("\n\tThe number hops can't be negative.\n");
		} while (numHops < 0);
		
		switch (direction) {
		case "L": moveLeft (); break;
		case "R": moveRight (); break;
		case "U": moveUp (); break;
		case "D": moveDown (); 
		}
	}

	private void OutputError (String dir) {
		System.out.println ("Error - The counter can't move "+ dir + numHops + " positions.");
	}
	
	private void moveUp () {
		if (rowNumber - numHops >= 1)
   			rowNumber -= numHops;
		else
			OutputError ("up ");
	}

   	private void moveDown () {
   		if (rowNumber + numHops <= 10)
   			rowNumber += numHops;
   		else
			OutputError ("down ");
   	}
   	
		
	private void moveLeft () {
		if (columnNumber - numHops >= 1)
			columnNumber -= numHops;
		else
			OutputError ("left ");
	}
	
	private void moveRight () {
		if (columnNumber + numHops <= 10)
			columnNumber += numHops;
		else
			OutputError ("right ");
	}
	
	public boolean checkForClash (Counters otherCounter) {
		if (rowNumber == otherCounter.rowNumber && columnNumber == otherCounter.columnNumber)
			return true;
		else
			return false;
	}
}