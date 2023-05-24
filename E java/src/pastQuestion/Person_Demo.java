package pastQuestion;
import java.util.*;
class person
{
	String name;
	int age;
	String gender;
	void display(String N,int A,String G)
	{
		System.out.println("Name: "+N+"\nAge :"+A+"\nGender :"+G);
	}
}
public class Person_Demo {

	public static void main(String[] args) {
		Scanner rk=new Scanner(System.in);
		Scanner rs=new Scanner(System.in);
		person rz[]=new person[10];
		for(int i=0;i<10;i++) 
		{
			rz[i]=new person();
		}
		int j=1;
		for(int i=0;i<10;i++) 
		{
			System.out.println("Enter the name of serial of "+j+" person");
			rz[i].name=rk.nextLine();
			System.out.println("Enter the age of serial of "+j+" person");
			rz[i].age=rs.nextInt();
			System.out.println("Enter the gender of serial of "+j+" person");
			rz[i].gender=rk.nextLine();
			j++;
		}
		for(int i=0;i<10;i++) 
		{
			rz[i].display(rz[i].name,rz[i].age,rz[i].gender);
		}

	}

}
