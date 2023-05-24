package pastQuestion;
import java .util.*;
class number2{

	void display(int a[])
	{
		System.out.println("The number divisible by 2 and 3 are:-");
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0 || a[i]%3==0) 
			{
				System.out.println(a[i]);}
			
				
		}
		
	}
	
}

public class divisible_2016_Q11 {

	public static void main(String[] args) {
		Scanner rz=new Scanner(System.in);
		number2 rk=new number2();
		System.out.println("Enter the size of array:-");
		int n=rz.nextInt();
		System.out.println("Enter the "+n+" numbers in array:-");
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=rz.nextInt();
		}
		rk.display(arr);

	}

}
