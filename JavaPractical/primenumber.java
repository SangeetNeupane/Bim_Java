package JavaPractical;
import java.util.*;
class primeDemo
{
	void prime() 
	{
		Scanner rz=new Scanner(System.in);
		System.out.println("Enter The Number To Check Prime Number:-");
		int num=rz.nextInt();
		int n=num;
		int rem=1;
		if(num==1)
		{
			System.out.println("The Number You have entered is neither prime nor composite.(ie. "+n+")");
		}
		else
		{
		for(int i=2;i<num;i++)
		{
			if(num%2==0)
			{
				rem=0;
				break;
			}
		}
		if(rem==1)
		{
			System.out.println("The Number You have entered is prime.(ie. "+n+")");
		}
		else
		{
			System.out.println("The Number You have entered is not prime(Composite).(ie. "+n+")");
		}
		}
		
	}
}
public class primenumber {
	public static void main(String[]args)
	{
		primeDemo rk =new primeDemo();
		rk.prime();
	}

}
