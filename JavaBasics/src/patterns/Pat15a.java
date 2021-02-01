package patterns;

import java.util.Scanner;

class Pat15a {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter no:");
		int n  = sc.nextInt();
		for(int i = 1; i<=n ; i++) {
			int var =1 ;
			for(int j =1; j<= n-i; j++) {
				System.out.print("  ");
				
			}
			for(int j = 1; j<= i; j++) {
				System.out.print(var+ "   ");
				var=var*(i-j)/j;
				
			}
			System.out.println();
		}
	}

}
