package loops;

import java.util.Scanner;

public class FibonacciNumbers {

	public static void main(String[] args) {
		int firstNo = 0;
		int secNo = 1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of terms of fibonacci required:");
		int n = sc.nextInt();
		System.out.print(firstNo + ",");
		System.out.print(secNo);
		for (int i = n - 2; i > 0 ; i--) {
			int thirdNo = firstNo + secNo;
			System.out.print("," + thirdNo);
			firstNo = secNo;
			secNo = thirdNo;
			 
		}
	}

}
