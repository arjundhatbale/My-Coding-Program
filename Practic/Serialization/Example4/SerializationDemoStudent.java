package Example4;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SerializationDemoStudent {

	public static void main(String[] args) {
		
		try {
			Student student = new Student(1, "Kirshna");
			
			FileOutputStream fis = new FileOutputStream("f.txt");
			
			ObjectOutputStream oos = new ObjectOutputStream(fis);
			
			oos.writeObject(student);
			
			oos.flush();
			oos.close();
			fis.close();
			
			System.out.println("Student Test Serialization");
			
		}catch(Exception e) {
			System.out.println(e);
		}
		
		
		
		
		
		
		
		
		
		
		
	}
}
