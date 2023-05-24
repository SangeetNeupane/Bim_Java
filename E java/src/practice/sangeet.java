package practice;


import java.util.Scanner;

class add
{
	int a,b,c;
	
    void sum()
    {
    	Scanner rk=new Scanner(System.in);
        System.out.println("Enter the two number for sum:-");
        
        a=rk.nextInt();
        b=rk.nextInt();
        	c=a+b;
    System.out.println("sum: "+c);
    }
	  
}
class sub{
	int a,b,c;
	
    void difference()
    {
    	Scanner rk=new Scanner(System.in);
        System.out.println("Enter the two number for difference:-");
        
        a=rk.nextInt();
        b=rk.nextInt();
        	c=a-b;
    System.out.println("difference: "+c);
    }
	  
}
public class sangeet
{
	
	public static void main(String[]args)
	  {
	      
		
	      add rz=new add();
	      sub av=new sub();
	      
	      rz.sum();
	      av.difference();
	      	        
	}

}
