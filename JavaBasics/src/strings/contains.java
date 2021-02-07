package strings;

import java.util.Scanner;

public class contains {
	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		System.out.println("Enter a string");
		String str = sc.nextLine();
		System.out.println("Enter string to find in above entered string");
		String find = sc.nextLine();
		System.out.println(str.contains(find));
	}
}
