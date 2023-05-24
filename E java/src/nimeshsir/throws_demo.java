package nimeshsir;
class throws_keyword
{
	void result()throws IllegalAccessException
	{
		int a=5;
		System.out.println(a);
		throw new IllegalAccessException("Error Exception");
	}
}

public class throws_demo
{
 public static void main(String[]args)
 {
	 throws_keyword rz =new throws_keyword(); 
	 try
	 {
		 rz.result();
	 }
	 catch(Exception e)
	 {
		 System.out.println("Illegal Access Exception Caught");
		 System.out.println(e);
	 }
 }
}
