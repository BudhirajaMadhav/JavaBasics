package patterns;

import java.util.Scanner;

public class Pat11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no:");
		float n = sc.nextFloat();
		float rows = 2*n-1;
//		for(float i = 1; i<= rows; i++) {
//			if(i<n) {
//				for(float j = 1; j<= n-i; j++) {
//					System.out.print("* ");
//				}
//				for(float j = 1; j<= 2*i-1; j++) {
//					System.out.print("  ");
//				}
//				for(float j = 1; j<= n-i; j++) {
//					System.out.print("* ");
//				}
//			}else if (i == n) {
//				for(float j = 1; j<= 2*n-1; j++) {
//					System.out.print("  ");
//				}
//			}else {
//				for(float j = 1;j <= i-n; j++ ) {
//					System.out.print("* ");
//				}
//				for(float j = 1;j <= (2*n-1)-2*(i-n); j++) {
//					System.out.print("  ");
//				}
//				for(float j = 1;j <= i-n; j++ ) {
//					System.out.print("* ");
//				}
//				
//			}
//			System.out.println();
//		
//		
//				
//			
//		}
		
		
		int nst = (int) (n-1);
		int nsp = 1;
		
		for(int  i =1; i<=rows; i++) {
			for(int j=1; j<= nst; j++) {
				System.out.print("* ");
			}
			for(int j = 1; j<= nsp; j++) {
				System.out.print("  ");
			}
			for(int j =1; j<= nst;j++) {
				System.out.print("* ");
			}
			if(i<n) {
				
				nsp+=2;
				nst--;
				
			}else if(i==n) {
				nsp-=2;
				nst++;
				
			}else {
				
				nst++;
				nsp-=2;
			}
			System.out.println();
		}
		
		
	}

}
