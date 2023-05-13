// Blauwdruk
public class Person {
	// Name
	public String name;
	// Gender
	public String gender;
	// Age																																														
	public int age;
	// Loves Programming
	public boolean lovesProgramming;
	
	public void lopen() {
		System.out.println("Persoon " + name + " gaat lopen");
	}
	
	public void getName() {
		System.out.println("Naam van persoon is " + name);
	}
	
	public void getGender() {
		System.out.println("Gender van persoon is " + gender);
	}
	
	public void getAge() {
		System.out.println("Leeftijd van persoon is " + age);
	}
	
	
	public int whatIsYourAge() {
		// Hier mag van alles nog wat aan code
		
		
		return age;
		// int b = 7; Na return niks meer mogelijk
	}
	
	public String whatIsyourName() {
		return name;
	}
	
	public String whatIsYourGender() {
		return gender;
	}
	
	public boolean doYouLovesProgramming() {
		return lovesProgramming;
	}
	
	public void zwaaien(int amount) {
		System.out.println("Wij gaan zoveel keer " + amount + " zwaaien.");
	}
	
	public int getAge2(int leeftijd) {
		System.out.println("Leeftijd is " + leeftijd);
		return leeftijd;
	}
	
	public String getGender2(String geslacht) {
		System.out.println("Geslacht is " + geslacht);
		return geslacht;
	}
	
	public String getName2(String naam) {
		System.out.println("Naam is " + naam);
		return naam;
	}
}