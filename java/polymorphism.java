import java.util.*;
class university{
	int a=1,b=2;
	void sum(){
	   int 	c=a+b;
		System.out.println("sum="+c);
	}
}
class college extends university{
	void sum(){
	 int d=a+a+b;
	 System.out.println("sum1="+d);
	}
}
class program extends university{
	void sum(){
		int e=a+b+b;
		System.out.println("sum2="+e);
	}
}
class polymorphism{
	public static void main(String ... args)
	{
		university obj=new university();
		/*System.out.println("enter number for university");
		Scanner s=new Scanner(System.in);
		obj.a=s.nextInt();
		obj.b=s.nextInt();*/
		college obj1=new college();
		/*System.out.println("enter number for college");
		obj1.a=s.nextInt();
		obj1.b=s.nextInt();*/
		program obj2=new program();
		/*System.out.println("enter number for program");
		obj2.a=s.nextInt();
		obj2.b=s.nextInt();*/
		university u;
		u=obj;
		u.sum();
	    u=obj1;
		u.sum();
		u=obj2;
		u.sum();
	}
}