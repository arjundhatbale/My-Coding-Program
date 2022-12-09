package references_In_Java;

public class Replace_Method {
	static void ReplaceAl() {
		
		String name = "arjun subhash dhatbale";
		String str = "vishal bhadhaid";
		System.out.println("Replace of 'name' in place of str = " + name.replaceAll(name, str));
		
	 
	}
    public static void main(String[] args) {
    	
    	ReplaceAl();
    	
    	// replace 'i' by 'I'

    	String name = "India is my country";
    	System.out.println(name.replace('i', 'I'));
    	
    	// replace 'j' by 'o'
    	System.out.println("arjun".replace('j', 'o'));
    	
    	String program = "C++ Programing";
    	
    	// C++ replace by Java
    	System.out.println(program.replace("C++", "Java"));
    	
    	// String zzz in than zz replace by z
    	System.out.println("aa bb cc zz".replace("aa", "zz"));
    	System.out.println("zzz".replace("zz","z"));
    	
    	// replace all integer no by " " (space)
    	String mix = "Koltin123is456Programing43language";
    	System.out.println(mix.replaceAll("\\d+", " "));
}
}
