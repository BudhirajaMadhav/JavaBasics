package loops;

import java.util.Scanner;

public class PrimeOrNot {
	
	public static void main(String[] srgs) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number:");
		int num = sc.nextInt();
		boolean isPrime = true;
		if (num <= 1) {
			isPrime = false;
			
		}else if (num == 2 || num%2 != 0 ) {
			
			for (int i = 2; i*i <= num; i ++) {
				if (num%i == 0) {
					isPrime = false;
					break;
				}
			}
			
		} else {
			isPrime = false;
		}
		
		if (isPrime == true) {
			System.out.println(num + " is prime");
		} else {
			System.out.println(num + " is not prime");
		}
		
	}

}
