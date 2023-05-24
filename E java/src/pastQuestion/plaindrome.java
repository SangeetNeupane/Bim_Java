package pastQuestion;
import java.util.*;
//2020makeup Q11
class plaindrome_demo
{
	Scanner rz=new Scanner(System.in);
	void number() {
		System.out.println("Enter the number:-");
		int n=rz.nextInt();
		int temp=n;
		int rev=0;
		int rem=0;
		while(n!=0) 
		{
			rem=n%10;
			rev=rev*10+rem;
			n=n/10;
		}
		if(rev==temp)
		{
			System.out.println("The number is Plaindrome.");
		}
		else
		{
			System.out.println("The number isn't Plaindrome.");
		}
	}
	
}


public class plaindrome {

	public static void main(String[] args) {
		plaindrome_demo rk=new plaindrome_demo();
		rk.number();
	}

}
