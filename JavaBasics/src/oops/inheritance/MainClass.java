package oops.inheritance;

public class MainClass {
	public static void main(String[] args) {
		Teacher T = new Teacher();
		T.name = "Doraemon";
			
		T.walk();
		T.teach();
		Footballer F = new Footballer();
		F.eat();
		F.playFootball();
	}
}
