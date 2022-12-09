package references_In_Java.Cloning;

// copy Object

public class Shalloq_Copy {

	public static void main(String[] args) {
		
		// shallow copy
		Abc obj = new Abc();
		obj.i = 5; 
		obj.j = 6; 
		
		//Abc obj1 = new Abc();
		System.out.println(obj);
		
	}
}
class Abc {
	int i; 
	int j; 
	
	public String toString (){
		return "Abc{" + "i=" + i + ", j=" + j + "}";
	}
}	


 
