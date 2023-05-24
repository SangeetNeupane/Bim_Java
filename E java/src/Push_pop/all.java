package Push_pop;
import java.util.*;

public class all 
	{
	  public static void main(String[]args)
		{
			Scanner rz =new Scanner (System.in);
			Stack<Integer>rk=new Stack<>();
			Stack<Integer>av=new Stack<>();
			Stack<Integer>ar=new Stack<>();
			System.out.println("How many number you want to push?");
			int n=rz.nextInt();
			System.out.println("Enter the "+n+" Numbers");
			for(int i=0;i<n;i++)
			{
				int k=rz.nextInt();
				rk.push(k);
			}
			System.out.println(" The  Numbers are :- ");
			
			
		System.out.println(rk);
			
	System.out.println(" Copied Stack The  Numbers are :- ");
	for(int i=0;i<n;i++)
	{
		int k=rk.pop();
		av.push(k);
	}
	System.out.println(av);
	
	System.out.println("Again Copied to next Stack The  Numbers are :- ");
	
	for(int i=0;i<n;i++)
	{
		int k=av.pop();
		ar.push(k);
	}
	System.out.println(ar);
	for(int i=0;i<n;i++)
	{
		System.out.println(ar.pop());
	}
		
		}

	}



