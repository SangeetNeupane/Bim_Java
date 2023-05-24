package past_question_part2;
import java.util.*;
class person{
	String name;
	int age;
	String gender;
	Scanner rz=new Scanner (System.in);
	Scanner rk=new Scanner (System.in);
	void input()
	{
		System.out.println("Enter the  Name, age and gender of a person :-");
		name=rk.nextLine();	
		age=rz.nextInt();
		gender=rk.nextLine();
	}
	void output()
	{
		System.out.println("The  Names, age and gender of this person:-");
		System.out.println("Name: "+name);
		System.out.println("Age: "+age);
		System.out.println("Gender"+gender);
	}
}
public class Q15_2020 {

	public static void main(String[] args) {
	person rk[]=new person[10];
	for(int i=0;i<10;i++)
	{
		rk[i]=new person();
	}
	
	for(int i=0;i<10;i++)
	{
		rk[i].input();
	}
	
	for(int i=0;i<10;i++)
	{
		rk[i].output();
	}
	
	}

}
