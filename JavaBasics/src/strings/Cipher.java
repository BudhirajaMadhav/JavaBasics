package strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Cipher {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();                
       
        sc.nextLine();
        int n = sc.nextInt();
        int[] cap = new int[52];
        int [] small = new int[52];
        int[] nos = new int[20];
        for(int i = 0; i < 26; i++) {
        	cap[i] = i+65;
        	cap[i+26] = i+65;
        	small[i] = i+97;
        	small[i+26] = i+97;
        }
        for(int i = 0; i <10; i++) {
        	nos[i] = i;
        	nos[i+10] = i;
        }
        char arr[] = str.toCharArray();
//        System.out.println(Arrays.toString(nos));
        for(int i = 0; i < arr.length; i++) {
        	if((int)arr[i] >= 97 && (int)arr[i] <= 122) {
        		arr[i] = (char)(small[(int)arr[i] -97 + 4]);
        	}else if((int)arr[i] >= 65 && (int)arr[i] <= 90) {
        		arr[i] = (char)(cap[(int)arr[i] -65 + 4]);
        	}else if((int)arr[i] >= 48 && (int)arr[i] <= 57) {
        		arr[i] = (char)(nos[(int)arr[i] -48 + 4] + 48);
        	}
        	System.out.print(arr[i]);
        }
        
	}
}
