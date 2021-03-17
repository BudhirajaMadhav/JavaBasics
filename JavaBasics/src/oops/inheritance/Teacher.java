package oops.inheritance;

public class Teacher extends Person{
	public Teacher(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
	public void teach() {
		System.out.println(name + " is teaching");
	}
	public void eat() {
		System.out.println("Teacher " + name + " does not eat");
	}
}
