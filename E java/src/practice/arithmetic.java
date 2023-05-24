package practice;

import java.util.Scanner;

public class arithmetic {
	int a,b,c;
    
	  
	  public static void main(String[]args)
	  {
	      
	      arithmetic rz=new arithmetic();
	      Scanner rk=new Scanner(System.in);
	      System.out.println("Enter the two number:-");
	      
	      rz.a=rk.nextInt();
	      rz.b=rk.nextInt();
	      
	      rz.c=rz.a+rz.b;
	      System.out.println("Total: "+rz.c);
	  
	}
}
