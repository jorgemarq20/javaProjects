
public class TigerCubMain {

	public static void main(String[] args) {
		
		TigerCub kabo = new TigerCub ();
		
		kabo.isBorn("Kabo", 2.3f, (byte) 2);
		kabo.getHealthCheck();		
		kabo.eat();
		kabo.getHealthCheck();		
		kabo.getInjured();
		kabo.getHealthCheck();		
		kabo.play();
		kabo.getHealthCheck();
		
		TigerCub Jojo = new TigerCub ();
		
		Jojo.isBorn ("Jojo", 1.9f, (byte) 1);
		
	}

}
