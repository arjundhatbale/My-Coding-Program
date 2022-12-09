package Example4;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class DeserializationDemoStudent {
public static void main(String[] args) {
	
	try {
		FileInputStream fis = new FileInputStream("f.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Student student  = (Student) ois.readObject();
		
		System.out.println(student.id +", " +  student.name);
		ois.close();
		fis.close();
		System.out.println("Test Deserialization");
	}catch(Exception e) {
		System.out.println(e);
	}
	
}
}
