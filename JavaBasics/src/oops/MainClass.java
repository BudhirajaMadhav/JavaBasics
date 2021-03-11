package oops;

import oops.model.*;


public class MainClass {
	public static void main(String[] args) {
		Student stu = new Student(15);
		Teacher mam = new Teacher(7);
		EncapsulationSchoolCriteria baccha = new EncapsulationSchoolCriteria();
		baccha.setAge(2);
		System.out.println(baccha.getAge());
	}
}
