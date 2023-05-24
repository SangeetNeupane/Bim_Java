package pastQuestion;

import java.util.Scanner;

class sum{
	Scanner rz=new Scanner(System.in);
	void sum_display()
	{
		int sum=0;
		System.out.println("Enter the 10 numbers:-");
		int a[]=new int[10];
		for (int i=0;i<10;i++)
		{
			a[i]=rz.nextInt();
		}
		for (int i=0;i<10;i++)
		{
			sum=sum+a[i];
		}
		System.out.println("The sum of 10 numbers is:- "+sum);
		
	}
}
public class sum_Q11_2019 {

	public static void main(String[] args) {
		sum rk=new sum();
		rk.sum_display();
	}

}
