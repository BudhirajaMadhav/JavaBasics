package oops.model;

public class Student {
	public Student(int age){
		if(age<18) {
			System.out.println("You can't go to college.");
		}else {
			System.out.println("Be in school!");
		}
		return;
	}
}
