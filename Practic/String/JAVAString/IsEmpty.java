package JAVAString;

public class IsEmpty {

	public static void main(String[] args) {
		String str = null;
		String s = "";
		String s1 = "india";
		System.out.println(s.isEmpty());
		System.out.println(s1.isEmpty());
		System.out.println("blanck >> " + s.isBlank());
		System.out.println("blank >> " + s1.isBlank());
		try {
			if(str.isEmpty()) {
				System.out.println("The string is null");
			}else {
				System.out.println("This tring is not null");
			}
		}catch(Exception e) {
			System.out.println(e);
		}
		
		
		
	}
}
