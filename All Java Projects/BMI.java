import java.util.Scanner;
public class BMI {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner (System.in);
		
		// Details of patient
		
		// Name
		System.out.print("Enter name of the patient: ");
	    String patientName = keyboard.nextLine ();
		
		// Read in the weight of the person.
	    System.out.print("Enter the number of stones that " + patientName + " weighs: ");
		byte weightStones = keyboard.nextByte ();
		
		System.out.print("Enter the number of pounds that " + patientName + " weighs: ");
		byte weightPounds = keyboard.nextByte ();
		
		// Read in height of patient
		System.out.print("Enter the height of " + patientName + " in feet: ");
		byte heightFeet = keyboard.nextByte ();
		
		System.out.print("Enter the height of " + patientName + " in inches: ");
		byte heightInches = keyboard.nextByte ();
		
		byte totalInches = (byte)(heightFeet * 12 + heightInches);
		
		// Calculate BMI.
		short totalPounds = (short)(weightStones * 14 + weightPounds);
		
		float BMI = ((float)(totalInches * totalInches) / totalPounds) * 703;
		
		// Output BMI status.
		
		System.out.println ("\n" + patientName + " has a BMI of " + BMI);
		
		if (BMI > 18.5)
			System.out.println (" and weight is underweight");
		
		else if (BMI <= 25)
			System.out.println (" and weight is at recommended weight");
		
		else if (BMI <= 30)
			System.out.println (" and weight is overweight");
		
		else if (BMI <= 35)
			System.out.println (" and weight is obese");
		
		else 
			System.out.println (" and weight is morbidly obese");
		
		
		keyboard.close ();
	}

}
