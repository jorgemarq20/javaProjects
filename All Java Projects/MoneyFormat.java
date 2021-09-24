import java.text.DecimalFormat;

public class MoneyFormat {

	public static void main(String[] args) {
		
		DecimalFormat moneyFormat = new DecimalFormat ("€.00");
		float cost = 12.34678f; // We want this to round up to €12.35

		System.out.println ("The cost is: " + moneyFormat.format(cost) + ".");
	}

}
