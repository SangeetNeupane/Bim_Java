package pastQuestion;
interface number_Q12_2019_makeup
{
	int square(int x);
	int cube(int x);
}
class Number_Demo1 implements number_Q12_2019_makeup{	
	public int square(int x) 
	{
		return x*x;
	}
	public int cube(int x) 
	{
		return x*x*x;
	}
}
public class Q12_2019_makeup 
{
	public static void main(String[] args)
	{
		number_Q12_2019_makeup rz=new Number_Demo1();
		System.out.println("The square of 5  is "+rz.square(5));
		System.out.println("The cube of 3 is "+rz.cube(3));
	}

}
