package String_handling;

public class string_constructor {

	public static void main(String[] args) {
		char suruchi[]= {'R','e','e','z','u','r'};
		//String reeza=new String(suruchi);
		
		String reeza=new String(suruchi,2,3);
		System.out.println(reeza);
	}

}
