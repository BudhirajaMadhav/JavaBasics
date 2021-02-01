package loops;

import java.util.Scanner;

public class SeriesSum {
	
	public static void main(String[] args) {
		
		System.out.println("Series is 1 + 1/2 + 1/3 + 1/4 + 1/5 . . . . 1/n");
		System.out.print("Enter n: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		float result = 0;
		for (float i = 1; i <= n ; i++) {
			result += 1/i;
		}
		System.out.println("The result is: " + result); 
		System.out.println();
	}

}
