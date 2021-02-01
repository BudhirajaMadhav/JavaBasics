package loops;

import java.util.Scanner;

public class FactorialOfNo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number whose factorial is to be found");
		int n = sc.nextInt();
		int temp = n;
		for (int i = temp; i > 1; i--) {
			temp = temp * (i - 1);
		}
		System.out.println("Factorial of " + n + " is " + temp);
;	}

}
