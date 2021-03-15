package oops.inheritance;

public class Person {
	protected String name = "Default";
	public Person(String name) {
		System.out.println("In parent");
	}
	public void walk() {
		System.out.println(name + " is walking");
	}
	public void eat() {
		System.out.println(name + " is eating");
	}
}
