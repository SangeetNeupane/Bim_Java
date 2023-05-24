package pastQuestion;
import java.util.*;
class number1
{
	void display(int a[])
	{
		System.out.println("The number present between 16 and 47 are:-");
		for(int i=0;i<30;i++)
		{
			if(16<a[i]&&47>a[i]) 
			{
				System.out.println(a[i]);
				}
		}
		
	}
}
public class between_Qno_11_2016 {

	public static void main(String[] args) {
		Scanner rz=new Scanner(System.in);
		number1 rk=new number1();
		int arr[]=new int[30];
		System.out.println("Enter the 30 numbers:-");
		for(int i=0;i<30;i++)
		{
			arr[i]=rz.nextInt();
		}
		rk.display(arr);
	}
}
