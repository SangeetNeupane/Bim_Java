package practice;

import java.util.Scanner;

public class math {
	int a,b,c;
    void sum()
    {Scanner rk=new Scanner(System.in);
    System.out.println("Enter the two number:-");
    
    a=rk.nextInt();
    b=rk.nextInt();
    
    c=a+b;
    System.out.println("Total: "+c);}
	  
	  public static void main(String[]args)
	  {
	      
	      math rz=new math();
	      rz.sum();
	      
	  
	}

}
