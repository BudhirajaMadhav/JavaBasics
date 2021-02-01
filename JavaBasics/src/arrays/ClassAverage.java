package arrays;

import java.util.Scanner;

public class ClassAverage {

	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		System.out.print("Enter no of students in class: ");
		int NoOfStu = sc.nextInt();
		int[] marks = new int[NoOfStu];
		int sum = 0;
		for(int i = 0; i< marks.length;i++) {
			System.out.print("Enter marks of student no. "+ (i+1) + " :");
			marks[i] = sc.nextInt();
			sum += marks[i];
		}
		System.out.println("Average marks of class is " + (float)sum/(float)NoOfStu);
	}

}
