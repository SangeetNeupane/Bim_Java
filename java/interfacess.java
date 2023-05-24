import java.util.*;
interface  bicycle{
	void speed(int increment);
	void breaks(int decrement);
}
class avon implements bicycle{
	int speeds;
	public void speed(int increment){
	speeds=speeds+increment;
	System.out.println("speed of bicycle="+speeds);
	}
   public void breaks(int decrement){
		speeds=speeds-decrement;
	System.out.println("break of bicycle="+speeds);
	}
}
class interfacess{
	public static void main(String[] args){
		avon a=new avon();
		Scanner s=new Scanner(System.in);
		System.out.println("enter the speed");
		a.speeds=s.nextInt();
		int inc,dec;
		System.out.println("enter the increment value");
	    inc=s.nextInt();
		System.out.println("enter the decrement value");
	    dec=s.nextInt();
		a.speed(inc);
		a.breaks(dec);
	}
}
