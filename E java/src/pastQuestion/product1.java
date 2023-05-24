package pastQuestion;
import java.util.*;
class multiply
{
	Scanner rz=new Scanner(System.in);
	void mul()
	{
		int multi=1;
		System.out.println("Enter the 10 numbers:-");
		int a[]=new int[10];
		for (int i=0;i<10;i++)
		{
			a[i]=rz.nextInt();
		}
		for (int i=0;i<10;i++)
		{
			if(a[i]<5) {
			multi=multi*a[i];
			}
		}
		System.out.println("The multiplication of less than 5 number is:- "+multi);
		
	}
}
public class product1 {

	public static void main(String[] args) {
		multiply rk=new multiply();
		rk.mul();
	}

}

