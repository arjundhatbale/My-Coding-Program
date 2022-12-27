package com.Object_and_Classes;

// java program call constructor in another with the help of super keyword

public class Constructor1 {
	Constructor1(int no1, int no2){
		if(no1 < no2) {
			System.out.println(no1 + " is less than " + no2);
		}else {
			System.out.println(no2 + " is less than " + no1);
		}
	}
}
