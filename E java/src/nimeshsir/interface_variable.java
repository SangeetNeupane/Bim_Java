package nimeshsir;
interface variables{
	String name="Reezu Khadgi";
	int roll=05;
	String phone="9825244893";
	String	College="Birgunj Public College";
	String program="BIM";
	int Web_Programming=98;
	int Java_Programming=96;
	void display();
}
class variable implements variables{
	public void display()
	{
		System.out.println("Name: "+name);
		System.out.println("Roll no: "+roll);
		System.out.println("Phone no: "+phone);
		System.out.println("College: "+College);
		System.out.println("Program: "+program);
		System.out.println("Web_Programming Marks: "+Web_Programming);
		System.out.println("Java_Programming Marks: "+Java_Programming);
		System.out.println("Total Marks: "+(Web_Programming+Java_Programming));
		
		
	}
}
public class interface_variable {

	public static void main(String[] args) {
		variables rz=new variable();
		rz.display();

	}

}
