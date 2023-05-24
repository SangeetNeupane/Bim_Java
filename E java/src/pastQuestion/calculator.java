package pastQuestion;
interface Calculate
{
	int add(int a,int b);
	int sub(int a,int b);
	int mul(int a,int b);
	int div(int a,int b);
	
}
class BasicCalculator implements Calculate
{
	public int add(int a,int b) {
		return a+b;
	}
	public int sub(int a,int b) 
	{return a-b;}
	public int mul(int a,int b) 
	{return a*b;}
	public int div(int a,int b) 
	{return a/b;}
}

public class calculator {
	//2020Q14

	public static void main(String[] args) {
		Calculate rz=new BasicCalculator();
		System.out.println("Sum of 5+6 is "+rz.add(5,6));
		System.out.println("Subtract of 7-2 is "+rz.sub(7,2));
		System.out.println("Multiplication of 8*4 is "+rz.mul(8,4));
		System.out.println("Division of 30/6 is "+rz.div(30,6));
	}

}
