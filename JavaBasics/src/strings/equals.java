package strings;

import java.util.Scanner;

public class equals {

	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		System.out.println("Enter a string");
		String str = sc.nextLine();
		System.out.println("Enter 2nd string");
		String str1 = new String(sc.nextLine());
		System.out.println(str.equals(str1));
	}

}
