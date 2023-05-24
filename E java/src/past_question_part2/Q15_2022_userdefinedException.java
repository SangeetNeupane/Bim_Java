package past_question_part2;
class ExamException extends Exception
{
	int age;
	ExamException(int a)
	{
		age=a;
	}
}
class Person1
{
	String name;
	int age;
	void exam(String n,int a1)throws ExamException
	{
		name=n;
		age=a1;
		if(age<1||age>100)
		{
			throw new ExamException(age);
		}
		else
		{
			System.out.println("The name is "+name);
			System.out.println("The age is "+age);
		}
	}
}

public class Q15_2022_userdefinedException 
{
	public static void main(String[] args)
	{
		Person1 av=new Person1();
		try {
		av.exam("Suruchi",191);
		}
		catch(ExamException e)
		{
			System.out.println("Caught error  . "+e);
		}
	}
}
