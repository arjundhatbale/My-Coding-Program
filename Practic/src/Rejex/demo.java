package src;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class demo {

	public static void main(String[] args) {
		System.out.println("Linked List");
		
		LinkedList<String > list = new LinkedList<>();
		
		list.add("Arjun");
		list.add("Navanath");
		list.add("Komal");
		list.add("vishal");
		
		System.out.println(list);
		
		Iterator<String> itr = list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		for(String o : list) {
			System.out.println(o);
		}
		
		
	}
}
