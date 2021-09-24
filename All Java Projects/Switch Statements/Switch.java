import java.util.Scanner;
public class Switch {
	static Scanner sc = new Scanner (System.in);
	
	public static void main(String[] args) {		
		String choice;
		do {
			showMenu();
			choice = sc.next().toUpperCase();
			if (choice.equals("C"))
				circle();
			else if (choice.equals("R"))
				rectangle();
			else if (choice.equals("S"))
				sphere();
			else if (choice.equals("Q"))
				System.out.println("Thank you for using this program.");
			else
				System.out.println("Error - You have entered an invalid value");
		} while (!(choice.equals("Q")));
			sc.close ();
	}

	private static void sphere() {
		// Read in radius and output the volume and surface area.
		
		System.out.println ("Enter radius of sphere: ");
		float radius = sc.nextFloat ();
		double surfaceArea = (float)(4 * Math.PI * Math.pow(radius, 2)),
		volume = 4./3 * Math.PI * Math.pow(radius, 3);
		System.out.println ("\tThe surface area of the sphere is " + surfaceArea + " units squared");
		System.out.println ("\tThe volume of the sphere is " + volume + " units cubed");
		
	}

	private static void rectangle() {
		// Read in the length and breadth of a rectangle and output the perimeter.
		
		System.out.println("Enter length of a rectangle: ");
		float length = sc.nextFloat ();
		System.out.println("Enter breadth of a rectangle: ");
		float breadth = sc.nextFloat ();
		float area = length * breadth;
		System.out.println ("The area of the retangle is " + area + " units squared.");
		
	}

	private static void circle() {
		// Read in a radius of a circle and output the area and perimeter.
		
		System.out.print("Enter the radius of circle: ");
				float radius = sc.nextFloat ();
				double perimeter = 2 * Math.PI * radius, 
				area = Math.PI * Math.pow(radius, 2);
				System.out.println ("The perimeter of the circle is " + perimeter + " units.");
				System.out.println ("The area of the circle is " + area + " units squared.");
	}

	private static void showMenu() {
		// Show the menu to the user.
		System.out.println ("\tMenu\n");
		System.out.println ("\tC: Circle\n");
		System.out.println ("\tR: Retangle\n");
		System.out.println ("\tS: Sphere\n");
		System.out.println ("\tQ: Quit\n");
		System.out.println ("\tChoice: ");
		
	}
	
}
