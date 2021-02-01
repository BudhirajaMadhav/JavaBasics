package whileLoop;

import java.util.Scanner;

public class PalindromeNo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number:");
		int n  = sc.nextInt();
		int newn = 0;
		int temp = n;
		while (temp > 0) {
			newn = newn*10 + temp%10;
			temp /= 10;
			
		}
		if(newn == n) {
			System.out.println("Yes, "+ n + " is a palindrome");
		}else {
			System.out.println(n + " is not a palindrome");
		}
	}

}
