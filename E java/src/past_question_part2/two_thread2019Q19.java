package past_question_part2;
class English_month implements Runnable
{
	public void run()
	{
		String month[]={"January","February","March","April","May","June","July","August", "September","October","November","December"};
		try
		{
			for(int i =0;i<12;i++)
		{
			System.out.println(month[i]);
			Thread.sleep(1000);
		}
		}
		catch(InterruptedException e)
		{
			System.out.println("InterruptedException");
		}
	}
}

class week_name implements Runnable
{
	public void run()
	{
		String week[]= {"sunday","monday","tuesday","wednesday","thursday","friday","saturday"};
		try
		{
			for(int i =0;i<7;i++)
		{
			System.out.println(week[i]);
			Thread.sleep(1500);
		}
		}
		catch(InterruptedException e)
		{
			System.out.println("InterruptedException");
		}
	}
}

public class two_thread2019Q19 {

	public static void main(String[] args) {
		English_month rz=new English_month();
		week_name rk=new week_name();
		Thread t1=new Thread(rz);
		t1.start();
		Thread t2=new Thread(rk);
		t2.start();

	}

}
