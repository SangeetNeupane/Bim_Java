package pastQuestion;
import java.util.*;
//Q13_2019
class Number
{
	Scanner rz=new Scanner(System.in);
	int x,y,z;
	Number()
	{
		System.out.println("Enter the three integer");
		x=rz.nextInt();
		y=rz.nextInt();
		z=rz.nextInt();
	}
	int getMax()
	{
		int max=0;
		if(x>y&&x>z)
		{
			max=x;
		}
		else if(y>x&&y>z)
		{
			max=y;
		}
		else
		{
			max=z;
		}
		return max;
	}
}
public class Number_demo 
{

	public static void main(String[] args) 
	{
		Number rk =new Number();
		System.out.println("The largest number is "+rk.getMax());
	}

}
