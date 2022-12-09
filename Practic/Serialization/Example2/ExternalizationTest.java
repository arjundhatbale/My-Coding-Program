package Example2;

import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;

public class ExternalizationTest {

	public static void main(String[] args) {
		
		String fileName = "person.ser";
		Person person = new Person();
		person.setId(23);
		person.setName("vishal");
		person.setGender("Male");
		
		try {
			FileOutputStream fos = new FileOutputStream(fileName);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			
			oos.writeObject(person);
			oos.close();
		}catch(IOException e) {
			
			// TODO Autp-generated catch block 
			e.printStackTrace();
		}
		
		FileInputStream fis; 
		try {
			fis = new FileInputStream(fileName);
			ObjectInputStream ois = new ObjectInputStream(fis);
			
			Person p = (Person)ois.readObject();
			ois.close();
			System.out.println("Person Object Read = " + p);
		}catch(IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
