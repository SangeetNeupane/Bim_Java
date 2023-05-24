package methodoverloading;
import java.util.*;
public class demo {
	
	void sum(int a,int b)          
	{
		int c=a+b;
		System.out.println("Sum (void sum(int 1,int 2 )) = "+c);
	}
	int sum(int a,int b,int d)
	{
		int c=a+b+d;
		return c;
	}
    float sum(int a,float b)
    {
    	float c=a+b;
    	return c;
    }
    float sum(float a,float b)
    {
    	float c=a+b;
    	return c;
    }
    float sum(float a,int b)
    {
    	float c=a+b;
    	return c;
    }
    
    public static void main(String[] args)
    {
    	Scanner av=new Scanner(System.in);
    	System.out.println("Enter the number : ");
    	int e=av.nextInt();
    	int f=av.nextInt();
    	int g=av.nextInt();
    	float h=av.nextFloat();
    	float i=av.nextFloat();
    	demo ar=new demo();
    	ar.sum(e,f);
    	System.out.println("Sum (int sum(int 1,int 2,int 3)) = " +ar.sum(e,f,g));
    	System.out.println("Sum ( float sum(int 1,float 4)) = " +ar.sum(e,h));
    	System.out.println("Sum (float sum(float 4,float 5)) = " +ar.sum(h,i));
    	System.out.println("Sum ( float sum(float 4,int 3))= " +ar.sum(h,g));
    }
}  