package pastQuestion;

import java.util.Scanner;

interface shape1
{
	void get_data();
	void display_area();
}
class square1 implements shape1
{
	int l;
	int area;
	Scanner rz=new Scanner(System.in);
	public void get_data() 
	{
		System.out.println("Enter the length square :-");
		l=rz.nextInt();
	}
	public void display_area() {
		area=l*l;
		System.out.println("The area of square is "+area);
	}
	
}
class rectangle_interface implements shape1
{

	int l,b;
	int area;
	Scanner rk=new Scanner(System.in);
	public void get_data() {
		System.out.println("Enter the length and breadth of rectangle :-");
		l=rk.nextInt();
		b=rk.nextInt();
	}
	public void display_area() {
		area=l*b;
		System.out.println("The area of rectangle is "+area);
	}
}
public class interface_Q13_2017
{
	public static void main(String[] args) 
	{
		rectangle_interface r= new rectangle_interface();
		square1 z=new square1();
		r.get_data();
		z.get_data();
		r.display_area();
		z.display_area();
	}

}
