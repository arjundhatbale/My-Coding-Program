package com.Indtroduction;
import java.text.DecimalFormat;
public class Formating {
	public static void main(String[] args) {
		DecimalFormat obj = new DecimalFormat("0.00");
		String name = "Arjun"; 
		int age = 20;
		double weight = 232.42;
		char intiall = 'B';
		int examScore = 200;
		
	    System.out.println(name + " is " + age + " years old and his weight is " +  weight   );
	    System.out.format("%s is %d years old and his weight is %.2f%n",name,age, weight);
	    
	    System.out.printf("%s's initial is %c and he got %d on his exam",name ,intiall, examScore);     
	    
	    
	}
}
