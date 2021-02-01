package patterns;

import java.util.Scanner;

public class Pat13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no of lines:");
		int n = sc.nextInt();
		int nsp = n-1;
		
		for(int i =1; i<=n; i++){
			for(int j=1; j<= nsp; j++) {
				System.out.print("  ");
			}
			nsp--;
			if (i != 1) {
				for(int j = n-i+1; j<= n-1; j++ ) {
				System.out.print(j + " ");
			    }
			}
			
			System.out.print(0 + " " );
			if (i!= 1) {
				for(int j = n-1; j >= n-i+1; j--) {
				System.out.print(j + " ");
			}
			}
			
			System.out.println();
		}
	}

}
