package past_question_part2;
interface reezu
{
	interface sangeet
	{
		void fun();
	}
	interface chimpu
	{
		void enjoy();
	}
}
class sanu implements reezu.chimpu
{
	public void enjoy()
	{
		System.out.println("Chimpu loves Sanu.");
	}
}
public class Nested_interface 
{
    public static void main(String[] args)
    {
    	reezu.chimpu av=new sanu();
    	av.enjoy();
    	
    }
}
