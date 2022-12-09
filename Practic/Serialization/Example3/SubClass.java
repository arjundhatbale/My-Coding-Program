package Example3;

import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectInputValidation;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public  class SubClass extends SuperClass implements Serializable,ObjectInputValidation {

	private static final long seriaversionUID = -345432343434452L;
	private String name;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String toString() {
		return "SubClass{id="+getId()+", value=" + getValue()+ ", name= " + getName() + "}";
	}
	
	// adding helper method for serialization to save / initialize suer class state
	
	private void readObject(ObjectInputStream ois)throws ClassNotFoundException , IOException{
		ois.defaultReadObject();
		
		// notice the order of read and write should be same 
		setId(ois.readInt());
		setValue((String) ois.readObject());
	}
	
	private void writeObject(ObjectOutputStream oos)throws IOException {
		oos.defaultWriteObject();
		
		oos.writeObject(getId());
		oos.writeObject(getValue());
	}
	
	public void validateObject() throws InvalidObjectException{
		// Validate the object here 
		if(name == null || "".equals(name)) throw new InvalidObjectException("name can't be null or empty");
		if(getId() <= 0) throw new InvalidObjectException ("ID can't be negative or zero");
	}
	
	
	
	
	
}
