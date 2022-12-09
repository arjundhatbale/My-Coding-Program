package Quick_Sort;

public class Mege {
	public static void conquer(int arr[], int start,int mid, int end) {
		int merg [] = new int [end - start + 1];
		int idx1 = start; 
		int idx2 = mid+1;
		int x = 0; 
		while(idx1<= mid && idx2 <= end) {
			if(arr[idx1] <= arr[idx2]) {
				merg[x++] = arr[idx1++];
				System.out.println("x = "+x + "   idx1 = "+ idx1);
				System.out.println("merg   1");
				for(int i=0; i<6; i++) {
					System.out.println(arr[i] + " ");
				}
			}else {
				merg[x++] = arr[idx2++];
				System.out.println("x = "+x + "   idx2 = "+ idx2);
				System.out.println("merg   2");
				for(int i=0; i<6; i++) {
					System.out.println(arr[i] + " ");
				}
			}
		}
		while(idx1<= mid) {
			merg[x++]= arr[idx1++];
		}
		while(idx2 <= end){
			merg[x++] = arr[idx2++];
		}
		for(int i=0, j= start; i<merg.length; i++, j++) {
			arr[j] = merg[i];
		}
	}
	public static void divide(int arr[],int  start, int end) {
		if(start>=end) {
			return;
		}
		int mid = start +(end -start)/2;
		divide(arr, start, mid);
		divide(arr, mid+1, end);
		conquer(arr, start, mid , end);
	}
    public static void main(String[] args) {
		int arr []  = {23,4,232,53,13,45};
		int n = arr.length;
		 
		divide(arr, 0, n-1);
		for(int i=0; i<n; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
    }
 
}
