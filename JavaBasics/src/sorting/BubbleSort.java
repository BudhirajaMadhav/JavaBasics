package sorting;

public class BubbleSort {

	public static void main(String[] args) {
		int[] a = {7, 5 , 4 ,1 , 0 , -33};
		int n = a.length;
		for(int i = 0; i<n-1; i++) {
			boolean isSorted = true;
			for(int j = 0; j<n-1; j++) {
				if(a[j] > a[j+1]) {
					a[j] = a[j] + a[j+1];
					a[j+1] = a[j] - a[j+1];
					a[j] = a[j] - a[j+1];
					isSorted = false;
				}
			}
			if(isSorted) break;
		}
		for(int item: a) {
			System.out.print(item + ",");
		}
		
	}

}
