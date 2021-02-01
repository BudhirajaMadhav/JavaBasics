package loops;

import java.util.Scanner;

public class Break {

	public static void main(String[] args) {
//		for (int i = 0; i <= 100; i++) {
//			System.out.println(i);
//			if (i == 40) {
//				break;
//				
//			}
//		}
		
//		 Infinite loop until user inputs a negative no
		Scanner sc = new Scanner(System.in);
		for(;;) {
			int n = sc .nextInt();
			
			if (n<0)
				break;
		}
	}

}
