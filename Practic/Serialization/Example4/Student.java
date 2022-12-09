package Example4;

import java.io.Serializable;

public class Student implements Serializable {

	static int id;
	String name;
	
	public Student(int roll, String name) {
		this.id = roll;
		this.name = name;
	}
}
