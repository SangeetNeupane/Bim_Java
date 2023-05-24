package past_question_part2;
class English_month1 extends Thread 
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

class week_name1 extends Thread 
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

public class multithreading_extended {

	public static void main(String[] args) {
		English_month1 rz=new English_month1();
		week_name1 rk=new week_name1();
		rz.start();
		rk.start();

	}

}
