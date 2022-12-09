package com.JavaString;

public class JAVAStringBuffer {

	public static void main(String[] args) {
//		// StringBuffer class append() method
//		StringBuffer sb = new StringBuffer("Hello ");
//		sb.append("Java ");  // append mean add element at last end
//		System.out.println(sb);
//		
//		// StringBuffer insert()methdo
//		sb.insert(9, "is programing language");
//		System.out.println(sb);
//		
		// StringBuffer replace()method
//		StringBuffer name = new StringBuffer(" chapaner");
//		System.out.println(name);
//		name.append(" is my village name");
//		name.replace(0, 7, "Sahangoan");
//		System.out.println(name);
//		
//		// StringBuffer Deleter() method
//		name.deleteCharAt(4);
//		System.out.println(name);
//		name.delete(8, 10);
//		System.out.println(name);
//		
//		// reverse() method
//		name.reverse();
//		System.out.println(name);
		
		// capacity (16*2)+2
		StringBuffer object = new StringBuffer();
		
		System.out.println(object.capacity());
		object.append("India");
		
		
		System.out.println(object.capacity());
		object.append(" is my country and all indians are my famili members");
		System.out.println(object.capacity());
		object.ensureCapacity(50);
		System.out.println(object.capacity());
	}
}
