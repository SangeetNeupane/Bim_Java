package Push_pop;
import java.util.*;

public class push_pop {
	
	public static void main(String[]args)
	{
		Scanner rz =new Scanner (System.in);
		Stack<Integer>rk=new Stack<>();
		System.out.println("How many number you want to push?");
		int n=rz.nextInt();
		System.out.println("Enter the "+n+" Numbers");
		for(int i=0;i<n;i++)
		{
			int k=rz.nextInt();
			rk.push(k);
		}
		System.out.println(" The  Numbers are :- ");
		
		for(int i=0;i<n;i++)
		{
			System.out.println(rk.pop());
		}
		
		
	}

}
