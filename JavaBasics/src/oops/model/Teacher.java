package oops.model;

public class Teacher {
	public Teacher(int exp){
		if(exp > 5) {
			System.out.println("You can be a permanent teacher.");
		}else {
			System.out.println("You can continue as a guest teacher.");
		}
	}
}
