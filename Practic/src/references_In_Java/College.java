package references_In_Java;

public class College {

	int a = 94;
	String name = "vikrant";
	
	public static void main(String[] args) {
		College college = new College();
		
		Class NewClass = college.getClass();
		
		System.out.println("name : >> " + NewClass);
		System.out.println("Package Name >> " + NewClass.getPackageName());
		
		System.out.println("df >> " + NewClass.getModifiers());
		
		
		
	}
}
