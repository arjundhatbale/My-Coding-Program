package BubleSort;

public class InsersionSort {
	public static void InsSort(int arr[]) {
		System.out.print("Insertion sort Array  = ");
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+ " ");
		}
	}
	public static void main(String[] args) {
		int arr[] = {23,52,5,41,6,74,85,94,990};
		
		for(int i=1; i<arr.length; i++) {
			int current = arr[i];
			int j = i-1;
			 
			while(j>=0 && current <arr[j]) {
				arr[j+1] = arr[j];
				j--;
			}
			// placemetn 
			arr[j+1] = current;
		}
		InsSort(arr);
	}
}
