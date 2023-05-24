package nimeshsir;
class BimException extends Exception
{
	int percentage;
	BimException(int p )
	{
		percentage=p;
	}
}
class UserDefineException_Bim
{
	  void output(int a) throws BimException
	 {
		 System.out.println("Obtain percentage: "+a);
		 if(a<50)
		 {
			 throw new BimException(a);//this varible will not effect 
		 }
		 else {
			 System.out.println("Passed BIM");
		 }
	 }
}

public class userdefined_exception 
{
	public static void main(String[] args) 
	{
		UserDefineException_Bim rz =new UserDefineException_Bim();
		try {
		rz.output(25);
		}
		catch(BimException e)
		{
			System.out.println("Caught Exception");
			System.out.println(e);
		}

	}

}
