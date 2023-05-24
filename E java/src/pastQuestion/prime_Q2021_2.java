package pastQuestion;
import java.util.*;
class prime_num
{
	Scanner rz=new Scanner(System.in);
	void prime() 
	{
		int a[]=new int[2];
		System.out.println("Enter the two numbers:-");
		for(int i=0;i<2;i++) 
		{
			a[i]=rz.nextInt();
		}
		int temp=0;
		System.out.println("The Prime Number:-");
		for(int i=0;i<2;i++) 
		{
			
			for(int j=2;j<a[i];j++)
			{	
				 if(a[i]>1)
				 {
					 temp=0;
				 if(a[i]%j==0)
				{
					temp=1;
					break;
				}
				 }
			}
			if(temp==0) {
			System.out.println(a[i]);}
		}
		
	}
}
public class prime_Q2021_2 {

	public static void main(String[] args) {
		prime_num rk=new prime_num();
		rk.prime();

	}

}
