package patterns;

import java.util.Scanner;

public class Pat12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no of lines:");
		int n = sc.nextInt();
		
		int nsp = n-1;
		int no0 = -1;
		
		
		for(int i=1; i<=n;i++) {
			for(int j=1; j<=nsp;j++) {
				System.out.print("  ");
			}
			for(int j =1; j<= 2*i-1; j++) {
				System.out.print(j+" ");
			}
			System.out.println();
			nsp--;
		}
		nsp = n-1;
		for(int i=1; i<=n;i++) {
			for(int j=1; j<= nsp; j++) {
				System.out.print("  ");
			}
			nsp--;
			System.out.print(i + " ");
			for(int j=1; j<= no0; j++) {
				System.out.print(0 + " ");
			}
			if(i!=1) {
				System.out.print(i);
			}
			
			no0+=2;
			System.out.println();
		}
	}

}
