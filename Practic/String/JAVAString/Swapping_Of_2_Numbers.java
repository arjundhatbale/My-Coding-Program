package JAVAString;

public class Swapping_Of_2_Numbers {

	static void Logic_1() {
		System.out.println("Logic 1 :-\n");
		int number1 = 32;
		int number2 = 53;
		
		int temp ;
		
		System.out.println("Before Swapping >> \nNumber 1 = " + number1 +"\n"
						+ "Number 2 = " + number2);
		System.out.println("After Swapping >> ");
		
		temp = number1;
		number1 = number2;
		number2 = temp;
		
		System.out.println("Number 1 = " + number1 + "\nNumber 2 = " + number2);
		
	}
	
	static void Logic_2() {    
		
		System.out.println("\nLogic 2 :\n");
		// Swapping of two number without creating third variable
		
		int n1 =83, n2 = 73;
		System.out.println("Before Swapping >> \nn1 = " + n1 + "\nn2 = " + n2);
		
		// swapping 
		
		n1 = n1 + n2;  // n1 = 83 + 73 = 156 :
		n2 = n1 - n2;  // 83 = 156 - 73
		n1 = n1 - n2;  // 73 = 156 - 83
		
		System.out.println("After Swapping >> \nn1 = " + n1 + "\nn2 = " + n2);
		
		
	}
	static void Logic_3() {
		int n1 =34 , n2 = 99;
		
		System.out.println("\nLogic 3 :-\nBefore Swapping \nn1 = " + n1);
		System.out.println("n2 = " + n2);
		System.out.println("\nAfter Swapping :-");
		
		n1 = n1 + n2 -(n2 = n1); // n1 = 34 + 99 -(34)   & n2 = 34
		 						 // 99 = 133 - 34
								 // n1 99 = 99
		                    
		System.out.println("n1 = " + n1 + "\nn2 = " + n2);
		
	}
	public static void main(String[] args) {
		Logic_1();
		Logic_2();
		Logic_3();
	}
}
 