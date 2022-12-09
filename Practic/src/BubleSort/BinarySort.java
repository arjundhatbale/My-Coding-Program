package BubleSort;
// Write a program to search use defined element from list by using binary search

import java.util.Scanner;

public class BinarySort {

	public static void main(String[] args) {
		
		int count, num, search, array[], first, last, middle;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the number of elements >> ");
		
		
		num = input.nextInt();
		array = new int[num];
		
		System.out.println("Enter " + num + " integers ");
		for(count  = 0; count < num ; count++) {
			array[count] = input.nextInt();
		}
		
		System.out.println("Enter the search value: ");
		search = input.nextInt();
		
		first = 0;
		last = num - 1;
		middle = (first + last)/2;
		
		while(first <= last) {
			if(array[middle] < search) {
				first = middle + 1;
			}else if(array[middle] == search) {
				System.out.println(search + " found at location " + (middle + 1) + " .");
				break;
			}else {
				last = middle - 1;
			}
			middle = (first + last)/2;
		}
		if(first > last )
			System.out.println("Not found! " + search + " is not present id list.\n");	
	}
}
