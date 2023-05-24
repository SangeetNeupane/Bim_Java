package chapter6;	
  /* * Write a program to print the area and perimeter of a triangle 
	 * having sides of 3, 4 and 5 units by creating a class named 'Triangle'
	 */
	import java.util.*;
	 class Triangle
	{
	    double a;
	    double b;
	    double c;
	    double area;
	    double perimeter;
	    double s;
	    void Tarea()
	    {
	        s=(a+b+c)/2; 
	        area= Math.sqrt(s*(s-a)*(s-b)*(s-c));
	         System.out.println("The area of the given triangle is "+area);
	    }
	    void Tperimeter()
	    {
	         perimeter=a+b+c;
	         System.out.println("The perimeter of the given triangle is "+perimeter);
	    }
	    
	    public static void main(String[]args)
	    {
	         System.out.print("\u000C");
	        Triangle rz=new Triangle();
	        Scanner rk=new Scanner(System.in); 
	        System.out.println("Enter the value of side a :-");
	        rz.a=rk.nextDouble();
	        System.out.println("Enter the value of side b :-");
	        rz.b=rk.nextDouble();
	        System.out.println("Enter the value of side c :-");
	        rz.c=rk.nextDouble();
	        rz.Tarea();
	        rz.Tperimeter();
	    }
	}



