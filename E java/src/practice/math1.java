package practice;
import java.util.Scanner;
public class math1
{
	int a,b,c;
	
	void add(int  i,int j)
	    {
	    
	    c=i+j;
	    System.out.println("Total: "+c);
	    }
	
	public static void main(String[]args)
	{
		      
		    math1 rz=new math1();
		    Scanner rk=new Scanner(System.in);
			  System.out.println("Enter the two number:-");
			    rz.a=rk.nextInt();
			    rz.b=rk.nextInt();
			    rz.add(rz.a,rz.b);	  
	}

	}


