package references_In_Java;
 

public class SwitchYear {    
	
	void selectMonth() {     
		
		System.out.println("Enter a month name : ");
			  
		switch("april") {      
	
		case "jan" : System.out.println("This is janewari month");
		break;
		
		case "feb" : System.out.println("This is feb for represent love");
		break;
		
		case "March" : System.out.println("This is my birth day month");
		break;
		
		case "april" : System.out.println("This is we are graduate at this month");
		break;
		
		default :{
			System.out.println("Your input does not match with me");
		}
		}
	}
	public static void main(String[] args) {
		SwitchYear object = new SwitchYear ();
		object.selectMonth();       
	}
}
