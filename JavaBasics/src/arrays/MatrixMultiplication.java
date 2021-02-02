package arrays;

import java.util.Scanner;

public class MatrixMultiplication {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter no of rows of 1st matrix");
		int rows1 = sc.nextInt();
		System.out.print("Enter no of columns of 1st matrix");
		int cols1 = sc.nextInt();
		System.out.print("Enter no of rows of 2nd matrix");
		int rows2 = sc.nextInt();
		System.out.print("Enter no of columns of 2nd matrix");
		int cols2 = sc.nextInt();
		int[][] a = new int[rows1][cols1];
		int[][] b = new int[rows2][cols2];
		int[][] c = new int[rows1][cols2];
		
		
		
		if(cols1 == rows2) {
			System.out.println("Enter 1st array:");
			for (int i = 0; i < rows1 ; i++) {
				for(int j = 0 ; j<cols1; j++) {
					a[i][j] = sc.nextInt();			
				}
			}
			System.out.println("Enter 2nd array:");
			for (int i = 0; i < rows2 ; i++) {
				for(int j = 0 ; j<cols2; j++) {
					b[i][j] = sc.nextInt();			
				}
			}
		
//			for (int i = 0; i < rows1 ; i++) {
//				for(int j = 0 ; j<cols2; j++) {
//					for(int l = i; l<rows1; l++) {
//						for(int k = 0; k< cols1; k++) {
//							int q = a[l][k];
//							int p = b[k][j];
//							c[i][j] = q*p;
//						}
//						for(int m = 0; m<j; m++ ) {
//							for(int s = 0 ; s<= j;s++ ) {
//								int p = b[m][s];
//							}
//						}
//					}			
//				}
//			}
//			
//			for (int i = 0; i < rows1 ; i++) {
//				for(int j = 0 ; j<cols2; j++) {
//					int sum = 0; 
//					int m = 0;
//					int l = 0;
//					for(int i1= 0; i1< rows1; i1++) {
//						while(l<=i1) {
//							while(m<rows2) {
//								System.out.println(l + "l");
//								System.out.println(a[i][l]);
//								System.out.println( b[m][j]);
//								sum += a[i][l] * b[m][j];
//								m++;
//								System.out.println(sum);
//								System.out.println();
//								break;
//							}
//							l++;
//						}
//					}
//					
//					c[i][j] = sum;
//				}
//				
//			}
			for(int m = 0; m < rows1; m++) {
				for(int p = 0; p < cols2 ; p++) {
					int sum = 0;
					for(int n = 0; n < cols1; n++) {
						sum += a[m][n] * b[n][p];
					}
					c[m][p] = sum;
				}
			}
			for(int i = 0; i< rows1; i++) {
				for(int j = 0; j< cols2; j++) {
					System.out.print(c[i][j] + " ");
				}
				System.out.println();
			}
			
				
			
		}else {
			System.out.println("Errorr!!! Multiplication not possible!!!");
		}
	}

}
