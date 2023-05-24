package pastQuestion;
import java.util.*;
class Box
{
	int length,breadth,height;
	Box()
	{
		Scanner av=new Scanner(System.in);
		System.out.println("Enter the length : ");
		length=av.nextInt();
		System.out.println("Enter the breadth : ");
		breadth=av.nextInt();
		System.out.println("Enter the height : ");
		height=av.nextInt();
	}
	void getvolume()
	{
		int volume=length*breadth*height;
		System.out.println("Volume = "+volume);
	}
}
class BoxWeight extends Box
{
	BoxWeight(){
		super();
		}
	int weight;
	void setWeight()
	
	{
		Scanner ar=new Scanner(System.in);
		System.out.println("Enter the weight of box : ");
	    weight=ar.nextInt();
	}
	void getWeight()
	{
		System.out.println("The weight of box is : "+weight);
	}
}
 
public class BoxDemo//2019_Q14
{
	public static void main(String[] args)
	{
		BoxWeight rz[]=new BoxWeight[2];
		for(int i=0;i<2;i++)
		{
			rz[i]=new BoxWeight();
		}
		for(int i=0;i<2;i++)
		{
		
		rz[i].setWeight();
		rz[i].getWeight();
		rz[i].getvolume();
		
		}
}}
