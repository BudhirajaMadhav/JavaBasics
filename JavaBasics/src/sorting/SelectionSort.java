package sorting;

public class SelectionSort {

	public static void main(String[] args) {
		int[] a = {7,5,2,0,-10};
		int n = a.length;
		for(int i = 0; i<n-1; i++) {
			int minInd = i;
			for(int j = i; j<n; j++) {
				if(a[j] < a[minInd]) {
					int temp = a[j];
					a[j] = a[minInd];
					a[minInd] = temp;
				}
			}
		}
		for(int e: a) {
			System.out.print(e + " ");
		}
	}

}
