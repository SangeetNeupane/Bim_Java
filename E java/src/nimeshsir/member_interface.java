package nimeshsir;
class memberinterface
{
	interface A
	{
		void display();
	}
}
class memberinterface1 implements memberinterface.A
{
	public void display() 
	{
		System.out.println("Member Interface");
	}
}
public class member_interface {

	public static void main(String[] args) {
	
		memberinterface.A rs=new memberinterface1();
		rs.display();
	}

}
