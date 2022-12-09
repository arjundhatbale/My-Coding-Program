package Quick_Sort;

public class m {
	public static void divide(int arr[], int start, int end) {
		int temp [] = new int [end - start + 1];
		int mid = start +(end - start)/2;
		int indx1 = start; 
		int indx2 = mid +1;
		int x = 0; 
		
	}
	public static void main(String[] args) {
		int arr[] = {23,432,453,123,545,23,2};
		int len = arr.length;
		
		divide(arr, 0, len);
	}
}
