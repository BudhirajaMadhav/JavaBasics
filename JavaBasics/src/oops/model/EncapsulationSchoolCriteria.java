package oops.model;

public class EncapsulationSchoolCriteria {
	private int age;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if(age<3) {
			this.age = age;
			System.out.println("You are not eligible to apply. Go and play BAT-BALL!");
		}
		else {
			this.age = age;
		}
	}
	

}
