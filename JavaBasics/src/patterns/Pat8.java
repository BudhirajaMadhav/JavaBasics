package patterns;

import java.util.Scanner;

public class Pat8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no:");
		float n = sc.nextInt();
		System.out.println("*");
//		for(float i = 1; i < n; i++) {
//			System.out.print("*");
//			for(float j = 1; j <= (-1/2)*n + 2*i -1  ; j++) {
//				System.out.print(" ");
//			}
//			System.out.println("*");
//		}
//		System.out.println("* ".repeat((int)( n+1)));
		
		for(int i = 2; i<= n-1; i++) {
			System.out.print("* ");
			for(int j = 1 ; j <= i-2; j++) {
				System.out.print("  ");
			}
			System.out.println("*");
			
		}
		for(int i = 1; i<=n;i++) {
			System.out.print("* ");
		}
	}

}
