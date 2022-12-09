package com.Array;
import java.util.Arrays;
// Check if Int Array contains a given value

public class CheckArrayElement {
public static void main(String[] args) {
	int arr[] = {1,3,4,5,6,7,8,9,0};
	int tocheck = 5;
	boolean result = false;
	int index = 0;
	for(int element : arr) {
		while(element == arr[index]) {
			index++;
		}
		if(tocheck == element) {
			result = true;
			break;
		}
	}
	if(result == true) {
		System.out.println(tocheck + " is contains in the arr [] >> " + Arrays.toString(arr) + "\nAt index of = " +  index);
	}else {
		System.out.println(tocheck + " is contains in the arr [] >> " + Arrays.toString(arr));
	}
}
}
	

