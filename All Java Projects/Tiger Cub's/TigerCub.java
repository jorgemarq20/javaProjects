
public class TigerCub {
	// Private members - "has-a"
	private String name;
	private float weight;
	private byte energy, smartness;
	
	// Public methods - "can"
	void isBorn (String theName, float theWeight, int theEnergy) {
		name = theName;
		weight = theWeight;
		energy = (byte) theEnergy;
		smartness = 0;
	}
	
	void eat () {
		weight += 1.2;
		smartness ++;
		energy += 2;
	}
	
	void play () {
		weight -= 0.6f;
		energy -= 4;
	}
	
	void getInjured () {
		weight -= 0.4f;
		energy -= 3;
	}
	
	void getHealthCheck () {
		System.out.print("\n\tName: " + name + "\n\tWeight: " + weight + "kg" + "\n\tEnergy: " + energy + "\n\tSmartness: " + smartness);
	}
	
}
