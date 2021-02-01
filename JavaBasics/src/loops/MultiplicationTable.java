package loops;

import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int   num = sc.nextInt();
		int max = String.valueOf(num*num).length() + 1;
		
		for (int j = 1; j <= num; j++) {
			int tableOf = j;
			
			for(int i = 1; i <= num; i++) {
				int a = tableOf * i;
				System.out.print(a);
				int length = String.valueOf(a).length();
				int space = max - length;
				System.out.print(" ".repeat(space));
				
				
			}
			System.out.println();
			
		}
		
	}

}
