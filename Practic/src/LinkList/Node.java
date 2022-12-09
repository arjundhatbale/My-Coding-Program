package LinkList;

public class Node<T>{
	public static void main(String args[]) {
		Node<String> x = new Node("hellow",null);
		Node<String> y = new Node("world", null);
		Node<String> z = new Node( null, x);
		
		System.out.println(x.getData());
		System.out.println(y.getData());
		System.out.println(z.getData() );
	}
	private T data;
	private Node next;
	
	public Node(T d, Node nx) {
		data = d;
		next = nx;
	}
	
	public T getData() {
		return data;
	}
	public Node getNext() {
		return next;
	}
	public void setData(T d) {
		data = d;
	}
	public void setNext(Node n) {
		next = n;
	}
}
