package references_In_Java;

public class Varargs {
	public void sumno (boolean b , String ... args) {
		System.out.println("Argument length is : " + args.length); 
		boolean status = !b;
		System.out.println(status);
		for(String num : args) {
			System.out.println(num);
		}
	}
	public static void main(String[] args) {
		Varargs obj = new Varargs();
		obj.sumno(true,"arjun","subhash");
		obj.equals(obj);
	}
}
