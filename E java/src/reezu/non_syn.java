package reezu;
class Bim
{
	void Bim_3rd(String C_name)
	{
		System.out.print("["+C_name);
		try {
			Thread.sleep(2000);
		}
		catch(InterruptedException rz)
		{
			System.out.println("InterruptedException"+rz);
		}
		System.out.println("]");
	}
}
class college implements Runnable
{
	String college_name;
	Bim rk;
	
	college(Bim rs,String s)
	{
		rk=rs;
		college_name=s;
		Thread t=new Thread(this);
		t.start();
	}
	public void run()
	{
		rk.Bim_3rd(college_name);
	}
}
public class non_syn {

	public static void main(String[] args) {
		Bim rk=new Bim();
		college sr1=new college(rk,"BPC");
		college sr2=new college(rk,"SDC");
		college sr3=new college(rk,"NCC");
	}

}
