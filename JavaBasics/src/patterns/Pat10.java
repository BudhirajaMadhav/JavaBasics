package patterns;

import java.util.Scanner;

public class Pat10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no:");
		int n = sc.nextInt();
//		int rows = 2*n -1;
//		for(int i =1; i<=rows;i++) {
//			if(i <= n) {
//				for(int j = 1; j <= n-i; j++) {
//					System.out.print("  ");
//				}
//				for(int j = 1 ; j<= i; j++) {
//					System.out.print("* ");
//				}
//			}else {
//				for(int j = 1; j <= i - n; j++) {
//					System.out.print("  ");
//				}
//				for(int j = 1; j <= 2*n - i;j++ ) {
//					System.out.print("* ");
//				}
//
//							
//			}
//			System.out.println();
//		}
		
		
		int nst = 1;
		int nsp = 2*(n-1);
		for(int i =1; i<=n;i++) {
			for(int j=1; j<=nsp;j++) {
				System.out.print("  ");
			}
			for(int j=1; j<= nst;j++) {
				System.out.print("* ");
			}
			if(i<=(n-1)/2) {
				nsp--;
				nst++;
			}else {
				nst--;
				nsp++;
			}
			System.out.println();
		}
	}

}
