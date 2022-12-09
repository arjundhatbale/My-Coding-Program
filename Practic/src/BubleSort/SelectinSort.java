package BubleSort;

public class SelectinSort {
	public static void sort(int arr[]) {System.out.print("Selection sort = ");
		for(int i=0; i<arr.length; i++) {
			
			System.out.print(arr[i]+ " ");
		}
	}
	public static void main(String[] args) {
		int arr[] = {3,32,5,57,58,963,53,23};
		
		for(int i=0; i<arr.length; i++) {
			int smallest = i; 
			for(int j= i+1; j<arr.length; j++) {
				if(arr[smallest] > arr[j]) {
					smallest = j;
				}
			}
			int temp = arr[smallest];
			arr[smallest] = arr[i];
			arr[i] = temp; 
		}
		sort(arr);
}
}
