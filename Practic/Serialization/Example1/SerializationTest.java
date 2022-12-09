package Example1;

import java.io.IOException;

public class SerializationTest {

	public static void main(String[] args) {
		
	/*
	 * program modification with original program 
	 * 
	 * Second Modification
	 */
//	String fileName = "employee.ser";
//	Employee empNew = null;
//	
//	try {
//		empNew = (Employee) SerializationUtil.deserialize(fileName);
//	}catch(ClassNotFoundException | IOException e){
//		e.printStackTrace();
//	}
//	
//	
//	System.out.println("empNew Object ::>> " + empNew);
//	

		
// ==================***=================***================***----------------
		
		
		//Original first program 
		String fileName = "Employee.ser";
		Employee emp = new Employee();
		emp.setId(100);
		emp.setName("Pankaj");
		emp.setSalary(3999);
		
		// serialize to file
		try {
			SerializationUtil.serialize(emp,fileName);
		}catch(IOException e) {
			e.printStackTrace();
			//return;
		}
		Employee empNew = null;
		try {
			empNew = (Employee) SerializationUtil.deserialize(fileName);
		}catch(ClassNotFoundException | IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("emp Object :: " + emp);
		System.out.println("empNew Object :: " + empNew);
		
	
	}
	
}
