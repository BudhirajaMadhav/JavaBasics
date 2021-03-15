package oops.inheritance;

public class Footballer extends Person{
	
	public Footballer(String name) {
		super(null);
	}
	public void playFootball() {
		System.out.println(name + " is playing football");
	}
	public void walk() {
		super.walk();    // F.walk() krne pe F ka name lega
		System.out.println("Footballer runs, not walks");
	}
}
