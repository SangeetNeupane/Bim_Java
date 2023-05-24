

import java.util.*;
public class fibonacci_series {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner rz=new Scanner(System.in);
		System.out.println(" Enter the number of terms of the Fibonacci Series:");
		
		 int n =rz.nextInt();
		 int a= 0, b= 1, c ;
		 System.out.println("Fibonacci Series till " + n + " terms:");

		    for (int i = 0; i < n; i++)
		    {
		      System.out.print( a + ", ");

		      
		      c = a + b;
		      a = b;
		      b = c;
		    }

	}

}
