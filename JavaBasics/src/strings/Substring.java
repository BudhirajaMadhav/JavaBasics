package strings;

import java.util.Scanner;

public class Substring {

	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		System.out.println("Enter a string");
		String str = sc.nextLine();
		System.out.println("begin 2");
		System.out.println(str.substring(2));
		System.out.println("from begin to end - 1");
		System.out.println(str.substring(2, 4));
		
	}

}
