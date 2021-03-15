package oops.inheritance;

public class MainClass {
	public static void main(String[] args) {
		Teacher T = new Teacher(null);
		T.name = "Doraemon";
			
		T.eat();
		T.teach();
		Footballer F = new Footballer("XYZ");
		F.eat();
		F.playFootball();
		
		Person P = T;
		System.out.println(P.name);
		P.eat();
			
		Teacher Q = (Teacher)P;
		Q.teach();
		Q.eat();
		Q.walk();
		System.out.println(T instanceof Person);
		
		
		F.name = "Sushma";
		F.walk();
		
	}
}
