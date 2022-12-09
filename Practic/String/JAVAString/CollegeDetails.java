package JAVAString;
import java.util.Scanner;

public class CollegeDetails {
	
	public void getInput() {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the User Inputs >> ");
		System.out.print("Enterh Studetn name >> ");
	    String name = input.next();
	    System.out.print("Enter student ID >>  ");
	    int ID  = input.nextInt();
	    System.out.print("Enter Teacher Name >> ");
	    String TeacherName = input.next();
		
	    
	    College college = new College();
	    college.setStudentName(name);
	    college.setStudentId(ID);
	    college.setTeacherName(TeacherName);
	    
	    System.out.println("Studnt name >> " + college.getStudentName());
	    System.out.println("Studetn Id >> " + college.getStudentId());
	    System.out.println("Teacher name >>> " + college.getTeacherName());
	}
	
	public static void main(String[] args) {
		
		CollegeDetails obj  = new CollegeDetails();
		obj.getInput();
	
		
	}
	
}
