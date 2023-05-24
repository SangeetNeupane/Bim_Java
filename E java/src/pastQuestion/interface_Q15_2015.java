package pastQuestion;
import java.util.*;

interface num
{
	int add(int x,int y);
	int diff(int x,int y);
}
class interface_num implements num
{
	public int add(int x,int y)
	{
		int sum=x+y;
		return sum;
	}
	public int diff(int x,int y)
	{
		int sub=x-y;
		return sub;
	}
	
}

public class interface_Q15_2015 {
	//2016Q13

	public static void main(String[] args)
	{
		Scanner rz=new Scanner(System.in);
		interface_num rk =new interface_num();
		System.out.println("Enter the number:-");
		int a=rz.nextInt();
		int b=rz.nextInt();
		
		System.out.println("The sum of number"+rk.add(a,b));
		System.out.println("The difference of number"+rk.diff(a,b));
	}

}
