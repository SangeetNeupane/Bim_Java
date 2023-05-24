package nimeshsir;

public class threads_sleep {

	public static void main(String[] args) {
		try
		{
			for(int i=5;i<15;i++)
		{
			System.out.println(i);
			Thread.sleep(3000);
		}
		}
		catch(InterruptedException rz)
		{
			System.out.println("Exception Caught but 99.9% exception will not occur");
		}

	}

}
