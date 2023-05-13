import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Person();
		new Person();
		
		// var 		a = 6;
		//Person 	p = Person();
		
		// omzetten van een object
		
		Person p1 = new Person();
		Person p2 = new Person();
		
		p1.name = "Rhea";
		p1.age = 33;
		p1.gender = "F";
		p1.lovesProgramming = true;
		
		p2.name = "Chilay";
		p2.age = 23;
		p2.gender = "F";
		p2.lovesProgramming = false;
		
		System.out.println("Naam van persoon 1 is " + p1.name);
		System.out.println("Naam van persoon 2 is " + p2.name);
		
		// Aanroepen
		p2.lopen();
		p2.getName();
		p2.getAge();
		p2.getGender();
		
		int age = p1.whatIsYourAge();
		System.out.println("Age = " + age);
		
		String gender = p1.whatIsYourGender();
		System.out.println("Gender = " + gender);
		
		String name = p1.whatIsyourName();
		System.out.println("Name: " + name);
		
		boolean lovesProgramming = p1.doYouLovesProgramming();
		System.out.println(name + " does love programming is " + lovesProgramming);
		
		p2.getAge2(40);
		p2.getGender2("Man");
		p2.getName2("Jantje");
		p2.zwaaien(5);
		
		Vervoermiddel v = new Vervoermiddel();
		Vervoermiddel auto = new Vervoermiddel("auto");
		
		//---------------------- Application
		
		Scanner s = new Scanner(System.in);
		String typedInName = s.nextLine();
		int typedInSpeed = s.nextInt(); s.nextLine();
		System.out.println("Naam: " + typedInName);
		System.out.println("Naam: " + typedInSpeed);
	}

}
