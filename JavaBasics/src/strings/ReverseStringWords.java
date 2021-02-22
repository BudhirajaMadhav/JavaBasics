package strings;

import java.util.Scanner;

public class ReverseStringWords {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string:");
		String str = sc.nextLine();
//		char last = ' ';
		char[] arr = new char[str.length()+1];
		arr = str.toCharArray();
		char[] arr1 = new char[str.length()+1];
		int ar1idx = 0;
		char[] arr2 = new char[str.length()+1];
		int ar2idx = 0;
		for (int i = arr.length-1; i >= 0; i--) {
			if (i == arr.length - 1) {
				if (arr[i] != ' ') {
					arr1[ar1idx] = arr[i];
					ar1idx+=1;
				}
			}else if(i==0){
//				System.out.println(arr[i]);
				arr2[ar2idx] = arr[i];
			}else {
				if ((arr[i] == ' ') && (arr[i-1] == ' ') && (arr[i+1] == ' ')){
					continue;
				}else if((arr[i]==' ') && (arr[i-1] != ' ') && (arr[i+1] == ' ')){
					arr2[ar2idx] = ' ';
					ar2idx+=1;
				}else if((arr[i]!= ' ')&& (arr[i+1] == ' ')) {
					arr1[ar1idx] = arr[i];
					ar1idx+=1;
				}else if((arr[i] != ' ') && (arr[i-1] == ' ')) {
					arr1[ar1idx] = arr[i];
					for (int j = ar1idx; j >= 0; j--) {
						arr2[ar2idx] = arr1[j];
						ar2idx+=1;
					}
					ar1idx = 0;
				}else {
					arr1[ar1idx] = arr[i];
					ar1idx+=1;
				}
			}
			
//			if (arr[i] != ' ') {
//				arr1[ar1idx] = arr[i];
//				ar1idx+=1;
//			}else if(arr[i] == ' ' && arr2[ar2idx] != ' '){
//				System.out.println("space add");
//				arr2[ar2idx] = ' ';
//				ar2idx+=1;
//			}else if(arr[i] == ' '){
//				for(int p = ar1idx-1; p>=0;p-- ) {
//					System.out.println(arr1[p]);
//					arr2[ar2idx] = arr1[p];
//					ar2idx+=1;
//				}
//				ar1idx = 0;
//			}
//			
//			
		}
//		System.out.println(arr1);
		System.out.print( arr2);
//			if (arr[i] != ' ' && arr1[ar1idx-1]!= ' ') {
//				arr1[ar1idx-1] = arr[i];
//				ar1idx+=1;
//				}else if(arr[i] == ' ' && arr1[ar1idx-2]!= ' ') {
//					for (int j = ar1idx-2; j >= 0; j--) {
//						System.out.print(arr1[j]);
//					}
//					ar1idx = 1;
//					System.out.print(" ");
//				}
//			if (ar1idx != 0) {
//				if (arr[i] != ' ' && arr1[ar1idx-1]!= ' ') {
//				arr1[ar1idx] = arr[i];0
//				ar1idx+=1;
//				}else if(arr[i] == ' ' && arr1[ar1idx-1]!= ' ') {
//					for (int j = ar1idx-1; j >= 0; j--) {
//						System.out.print(arr1[j]);
//					}
//					ar1idx = 0;
//					System.out.print(" ");
//				}
//			}
//			}else {
//				if (arr[i] != ' ' && arr1[ar1idx-1]!= ' ') {
//					arr1[ar1idx] = arr[i];
//					ar1idx+=1;
//					}else if(arr[i] == ' ') {
//						for (int j = ar1idx-1; j >= 0; j--) {
//							System.out.print(arr1[j]);
//						}
//						ar1idx = 0;
//						System.out.print(" ");
//					}
//			}
//		}
		
//		for (int i = arr.length-1; i >= 0; i--) {
//			char c = arr[i];
//			
//			char[] arr1 = new char[str.length()];
//			for(char p: arr1) {
//				arr1[p] = c;
//			}
//			
//			if(c != ' ') System.out.print(c);
//			else if(c == ' ' && last != ' ' ) {
//				System.out.print(" ");
//			}
//			last = c;
//		}
//		String[] arr = str.split(" ");
//		for(int arrIdx = arr.length-1; arrIdx >= 0; arrIdx--) {
//			for(char item: arr[arrIdx].toCharArray()) {
//				if (item != ' ') {
//					System.out.print(item);
//				}
//			}
//			System.out.print(" ");
//		}
		
		
	}

}
