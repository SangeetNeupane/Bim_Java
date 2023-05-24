package pastQuestion;
class Shape
{
	void show()
	{
		System.out.println("This is shape.");
	}
}
class Rectangle extends Shape
{
	void show()
	{
		super.show();
		System.out.println("This is rectangle.");
	}
}
class Circle extends Shape
{
	void show()
	{
		System.out.println("This is circle.");
	}
}
class Square extends Rectangle
{
	void display() 
	{
		super.show();
	}
	void show()
	{
		System.out.println("Square is a rectangle.");
	}
}
public class Q12_2021makeup 
{
	public static void main(String[] args )
	{
		Square av=new Square();
		av.display();
	
	}
}
