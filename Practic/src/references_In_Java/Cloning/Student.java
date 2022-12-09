package references_In_Java.Cloning;
import java.lang.Cloneable;

public class Student implements Cloneable {
	int id ; 
	String name;
	
	Student (String name , int id){
		this.id = id;
		this.name  = name;
		
	}
	public static void main(String[] args) throws CloneNotSupportedException {
		
		Student ob = new Student("ashish", 32);
		
		Student ob1 = (Student)ob.clone();
		
		System.out.println(ob1.id);
		System.out.println(ob1.name);
		System.out.println(ob.id);
		System.out.println(ob.name);
		
	    ob = new Student("vishal", 43);
	    ob1 = (Student)ob.clone();
	    System.out.println(ob1.id + " , " + ob1.name);
	}
}
