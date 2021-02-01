package loops;

import java.util.Scanner;

public class ForLoop {

	public static void main(String[] args) {
		
//		for (int i = 100; i > 0; i--) {
//		System.out.println(i);	
//		}
//		
		Scanner sc = new Scanner(System.in);
	    System.out.println("Enter number whose factorial is to be found:");
	    int n = sc.nextInt();
	    for (int i = n; i > 1 ; i--) {
	    	n = n * (i-1);
	    }
	    System.out.println(n);
	}

}
