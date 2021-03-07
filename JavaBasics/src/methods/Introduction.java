package methods;

import java.util.Scanner;

public class Introduction {
	static int maxOf(int a , int b) {
		return (a>b)? a:b;
		
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(" enter first number:");
		int firstNum = sc.nextInt();
		System.out.println("enter second number:");
		int  secNum = sc.nextInt();
		System.out.println(maxOf(firstNum, secNum));
	}

}
