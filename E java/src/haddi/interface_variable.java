package haddi;

interface variable {
String name="suruchi";
String address="kolhavi"; 
String phone="917231982";
int marks1=34;
int marks2=54;
void data();
}
class result implements variable
{
	public void data()
	{
	System.out.println("name:"+" "+name)	;
	System.out.println("address:"+" "+address)	;
	System.out.println("phone:"+" "+phone)	;
	System.out.println("marks1:"+" "+marks1)	;
	System.out.println("marks2:"+" "+marks2);
	System.out.println("sum of mark1 and mark2:"+(marks1+marks2));	
	}
}
public class interface_variable
{
	public static void main(String[] args)
	{
		result bv=new result();
		bv.data();
	}
	}


	


