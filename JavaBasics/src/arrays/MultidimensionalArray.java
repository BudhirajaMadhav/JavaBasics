package arrays;

public class MultidimensionalArray {

	public static void main(String[] args) {
		int a[][][][] = new int[3][3][3][3];
//		System.out.println(a[1][1][1][1]);
		
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				for(int k=0; k<3; k++) {
					for(int w=0; w<3; w++) {
						System.out.print(a[i][j][k][w]);
					}
					System.out.println();
				}
				System.out.println();
			}
			System.out.println();
		}
	}
	

}
