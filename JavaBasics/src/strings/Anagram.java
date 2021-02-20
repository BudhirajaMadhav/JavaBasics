package strings;

import java.util.Scanner;

public class Anagram {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st string");
		String str1 = sc.nextLine();
		System.out.println("Enter 2nd string");
		String str2 = sc.nextLine();
//		
//		
//		
//		if (str1.length() == str2.length()) {
//			char counted[] = new char[str1.length()];
//			for(int i = 0; i < str1.length();i++) {
//				char letter = str1.charAt(i);
//				
//				counted[i] = letter;
//				for(char item: counted ) {
//					if(item == letter) {
//						int count1 = 0, count2 = 0;
//						for(int j = 0; j < str1.length(); j++) {
//							if (str1.charAt(j) == letter) {
//								count1++;
//							}
//							if (str2.charAt(j) == letter) {
//								count2++;
//							}
//						}
//						if (count1 != count2) { 
//							System.out.println("not anagram!");
//							break;
//						}
//						if (i == str1.length() - 1) {
//							System.out.println("strings are anagram!");
//						}
//							break;
//					}
//				}
//				
//			}
//		}else {
//			System.out.println("not anagram!");
//		}
		int[] rep = new int[256];
		for(char i: str1.toCharArray()) {
			int ascVal = (int)i;
			rep[ascVal]++;
		}
		for(char i: str2.toCharArray()) {
			int ascVal = (int)i;
			rep[ascVal]--;
		}
		boolean anagram = true;
		for(int O: rep) {
			if (O!=0) {anagram = false; break;}
		}
		if(anagram == false) {
			System.out.println("Not anagram!");
		}else {
			System.out.println("Anagram!");
		}
		
		
		
	}

}
