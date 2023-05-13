
public class Vervoermiddel {
	
	private String name;
	
	private int speed;
	
	// Constructor
	public Vervoermiddel() {
		System.out.println("In vervoermiddellen constructor");
	}
	
	
	public Vervoermiddel(String naam) {
		this.name = naam;
	}
	
	public Vervoermiddel(String naam, int snelheid) {
		this.name = naam;
		this.speed = snelheid;
	}

	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		if (speed > 0)
			this.speed = speed;
	}
	

	public void print(String naam1, int snelheid1){
		System.out.println("Jouw getypte naam is " + this.name);
		System.out.println("Jouw getypte naam is " + this.speed);
	}
	
}
