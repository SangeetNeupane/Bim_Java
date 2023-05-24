package JavaPractical;
import java.util.*;
class sumDemo{
	void Sum()
	{
		Scanner rk= new Scanner(System.in);
		System.out.println("Enter The last Natural Number upto you want to Sum:-");
		int n=rk.nextInt();
		int sum=0;
		for(int i=1;i<=n;i++)
		{
			sum=sum+i;
			
		}
		System.out.println("The Sum of natural number upto "+n+" is "+sum);
	}
}
public class sum_of_natural_number {

	public static void main(String[] args) {
		sumDemo rz= new sumDemo();
		rz.Sum();

	}

}
