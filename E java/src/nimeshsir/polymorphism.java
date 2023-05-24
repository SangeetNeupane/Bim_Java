package nimeshsir;
import java.util.Scanner;
class university
{
	String ans;
	Scanner rz=new Scanner(System.in);
	void question()
	{
		System.out.println("Enter the name of University");
		ans=rz.nextLine();
		System.out.println("The name of University is "+ans);
		
	}
	
}
class college extends university
{
	void question()
	{
		System.out.println("Enter the name of College");
		ans=rz.nextLine();
		System.out.println("The name of College is "+ans);
		
	}
}
class program extends university
{
	void question()
	{
		System.out.println("Enter the name of Program");
		ans=rz.nextLine();
		System.out.println("The name of program is "+ans);
		
	}

}

public class polymorphism {

	public static void main(String[] args) {
		university rk=new university();
		college k=new college();
		program s=new program();
		university re;
		re=rk;
		re.question();
		re=k;
		re.question();
		re=s;
		re.question();
		

	}

}
