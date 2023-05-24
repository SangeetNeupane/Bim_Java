package pastQuestion;
import java.util.*;
abstract class fmachine
{
	abstract void getdata();
	abstract void putdata();
	
}
class Airplane extends fmachine
{
	String code,name;
	int capacity;
	Scanner rz=new Scanner(System.in);
	Scanner rk=new Scanner(System.in);
	
	void getdata() 
	{
		System.out.println("Enter the code of Airplane");
		code=rz.nextLine();
		System.out.println("Enter the name of Airplane");
		name=rz.nextLine();
		System.out.println("Enter the Capacity of people in Airplane");
		capacity=rk.nextInt();
		
	}
	void putdata() 
	{
		System.out.println("Code: "+code);
		System.out.println("Name: "+name);
		System.out.println("Capacity: "+capacity);
		
	}
}
public class Q13_2018 
{
	public static void main(String[] args) 
	{
		Airplane rs=new Airplane();
		rs.getdata();
		rs.putdata();
	}

}
