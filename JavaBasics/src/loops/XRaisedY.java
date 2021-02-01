package loops;

import java.util.Scanner;

public class XRaisedY {

	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		System.out.println("Enter the number");
		int x = sc.nextInt();
		System.out.println("Enter exponent");
		int y = sc.nextInt();
		int result = 1;
		for (int i = y ; i > 0 ; i--) {
			result = result * x;
		}
		System.out.println(x + " raised to power " + y + " is " + result );
	}

}
