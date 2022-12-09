package BubleSort;

public class BubleSort {
	public static void printArr(int arr[]) {
		System.out.print("Buble sort Arry is = ");
		for(int i= 0; i<arr.length; i++) {
			
			System.out.print(arr[i] + " ");
		}
	}
	public static void main(String[] args) {
		int arr[] = {5,2,6,22,53};
		
		// bubble sort
		
		for(int i = 0; i < arr.length - 1; i++) {
			for(int j = 0; j<arr.length-i-1; j++){
				if(arr[j] > arr[j+1]) {
					// swap 
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		printArr(arr); 
	}
}
