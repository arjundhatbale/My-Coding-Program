package LinkList;
import java.util.*;
class LL {Node head;
	class Node{
		
		String data; 
		Node next; 
		Node(String data){
			this.data = data; 
			this.next = null; 
		}	
	}
		// add - first, last 
		// add first
		public void addFisrt(String data) {
			Node newNode = new Node(data);
			
			if(head == null) {
				return;
			}
			newNode.next = head; 
			head = newNode;
		}
		// add last
		public void addLast(String data) {
			Node newNode = new Node(data);
			if(head == null) {
				head = newNode;
				return;
			}
			
			Node currNode = head; 
			while(currNode!= null) {
				currNode = currNode.next;
			}
			currNode = newNode;
		}
		
		// print 
		public void printList() {
			if(head == null) {
				System.out.println("list is empty");
			}
			Node currNode = head;
			while(currNode != null){
				System.out.print(currNode.next +" -> ");
				currNode = currNode.next;
			}
			System.out.println("NULL");
		}
		
		// delete first
		public void deleteFirst() {
			if(head == null) {
				System.out.println("the list is empty");
				return;
			}
			head = head.next;
		}
		// delete Last
		public void deleteLast() {
			if(head == null) {
				System.out.println("this list is empty");
				return;
			}
			if(head.next == null) {
				head = null;
				return;
			}
			Node secondLast = head;
			Node lastNOde = head.next;
			while(lastNOde.next != null) {
				lastNOde = lastNOde.next;
				secondLast = secondLast.next;
			}
			secondLast.next = null; 
		}
		public static void main(String args[]) {
			LL list = new LL();
			list.addFisrt("a");
			list.addFisrt("is ");
			list.printList();
			
			list.addLast("list");
			list.printList();
			
			list.addFisrt("this");
			list.printList();
			
			list.deleteFirst();
			list.printList();	
		}	 
}
