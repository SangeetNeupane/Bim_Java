package haddi;
class voteException extends Exception
{
	 voteException(int a)
	 {
	int age=a;
	 }
}
class practice 
{
	void sangeet(int a)throws voteException
	{
		System.out.println("the age is"+a);
		if(a<18) {
			throw new voteException(3);
		}
		else
		{
			System.out.println("eligible to vote");
		}
	}
	}

public class voting_age {
	public static void main(String[] args)
	{
		practice rz=new practice();
	
	try
	{
		rz.sangeet(13);
	}
catch(Exception e)
	{
	System.out.println("caught error");
	System.out.println(e);
}
}
}
	
