package String_handling;
class Box
{
	int width,height,depth;
	Box(int w,int h,int d)
	{
		width=w;
		height=h;
		depth=d;
	}
	public String toString()
	{
		return "Dimensions are : "+width+" , "+height+ " , "+depth;
	}
}
public class StringtoStringDemo
{
	public static void main(String[] args)
	{
		Box b=new Box(2,5,7);
		//String s="Box b : "+b;
		System.out.println(b);
		//System.out.println(s);
	}
}
