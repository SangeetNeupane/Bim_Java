package pastQuestion;
//interface runnable 2020Q12
class animals_name implements Runnable
{
	public void run()
	{
		String animal[]= {"Cow","Dog","Deer"};
		try
		{
			for(int i =0;i<3;i++)
		{
			System.out.println(animal[i]);
			Thread.sleep(2500);
		}
		}
		catch(InterruptedException e)
		{
			System.out.println("InterruptedException");
		}
	}
}
class birds_name implements Runnable
{
	public void run()
	{
		try {
		String birds[]= {"Parrot","Peacock","Sparrow","Crow","Eagle"};
		for(int i =0;i<5;i++)
		{
			System.out.println(birds[i]);
			Thread.sleep(1000);
			
		}
	}
	catch(InterruptedException e)
	{
		System.out.println("InterruptedException");
	}
	}
}
public class string_array {

	public static void main(String[] args) {
		animals_name rz=new animals_name();
		birds_name  rk=new birds_name();
		Thread t1=new Thread(rz);
		t1.start();
		Thread t2=new Thread(rk);
		t2.start();
		
	}

}
