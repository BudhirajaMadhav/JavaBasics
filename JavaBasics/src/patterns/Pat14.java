package patterns;

import java.util.Scanner;

public class Pat14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no of lines:");
		int n = sc.nextInt();
		int nsp = n-1;
		int nsp2 = 0; 
		for(int i=1; i<=n-1; i++) {
			for(int j =1 ; j<= nsp; j++) {
				System.out.print("  ");
			}
			nsp--;
			if(i==1) {
				System.out.print("*");
			}else {
				System.out.print("* ");
				for(int j =1; j<= nsp2; j++) {
					System.out.print("  ");
				}
				System.out.print("*");
				nsp2++;
				
			}
			System.out.println();
			
		}
		for(int i=1; i<=n;i++) {
			System.out.print("* ");
		}
	}

}
