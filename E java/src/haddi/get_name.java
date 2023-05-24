package haddi;

public class get_name {
	public  static void main(String[] args)
	
	
	{
		Thread bv=Thread.currentThread();
		
			System.out.println(bv);
			bv.setName("sangeet");
			System.out.println("changes after changing thread name"+bv);
		
	}

}
