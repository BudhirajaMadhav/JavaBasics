package whileLoop;

import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number:");
		int n  = sc.nextInt();
//		if (n<0) {
//			n /= (-1);
//			abs() can also be used
//		}
		n = Math.abs(n);
		
		
		int sum = 0 ;
		int temp = n;
		while (temp != 0) {
			sum += temp%10;
			temp /= 10;
			
		}
		System.out.println("Sum of the digits of the number is " + sum);
		
//		**CALCULATE LENGTH OF NUMBER--> 
//		(int)Math.log10(a)   --> It takes and gives double
		
		
//		FOR LOOP METHOD
//		int NoOfDigits = (int) Math.log(n);
//		for(int i = 1; i <= NoOfDigits; i++) {
//			sum += temp%10;
//			temp /= 10;
//		}
//		System.out.println(sum);
	}


}
