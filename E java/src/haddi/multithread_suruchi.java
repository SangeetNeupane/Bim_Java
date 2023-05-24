package haddi;

public class multithread_suruchi {

	public static void main(String[] args) {
		
		try
		{
			String A[]= {"sunday","monday","tuesday","wednesday","thursday","friday","saturday"};
			for(int i=0;i<A.length;i++)
			{
				System.out.println(A[i]);
				Thread.sleep(1500);
			}
		}
		catch(InterruptedException e)
		{
			System.out.println(e);
		}
	}

}
