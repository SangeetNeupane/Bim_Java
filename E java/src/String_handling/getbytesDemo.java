package String_handling;

public class getbytesDemo {

	public static void main(String[] args) {
		String sanu="Reezu Khadgi";
		System.out.println(sanu);
			byte kanxu[]=sanu.getBytes();
			System.out.println("After Byte  Encoding");
			for(byte a:kanxu)
			{
				System.out.println(a);	
			}	
		
		

	}

}
