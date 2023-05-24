package pastQuestion;
//2019Q11
class f_number{
	void fseries()
	{
		int a=0;
		int b=1;
		int c=0;
		for (int i=0;i<10;i++)
		{
			System.out.print(a+",");
			c=a+b;
			a=b;
			b=c;
		}
		
	}
}
public class Fibonacci_series {

	public static void main(String[] args) {
		
		f_number rz =new f_number();
		rz.fseries();
	}

}
