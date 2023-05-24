package haddi;
class ravi1{
	void play() {
		try
		{
		int a=5;
		int b=30;
		int divide=b/(a-a);
		System.out.println("Divide="+divide);
		}
		catch(ArithmeticException rk)
		{
			System.out.println("Error Caught Exception");
			System.out.println(rk);
		}
	}
}

public class p1_exception {

	public static void main(String[] args) {
		ravi1 rz =new ravi1();
		rz.play();

	}

}
