package pastQuestion;
//2015 Q11
class number_even
{
	void even()
	{
		System.out.println("Even Numbers:-");
		for(int i=1;i<=500;i++) 
		{
			if(i%2==0) {
			System.out.println(i);
			}
		}
	}
}
public class even_number {

	public static void main(String[] args)
	{
		number_even rz=new number_even();
		rz.even();

	}

}
