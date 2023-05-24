package JavaPractical;
import java.util.*;
public class GCD {

	public static void main(String[] args) {
		int x,y,i,k,gcd=1;
		Scanner rz=new Scanner(System.in);
		System.out.println("Enter the two numbers:-");
		x=rz.nextInt();
		y=rz.nextInt();
		for(i=1;i<=x && i<=y;i++)
		{
			if(x%i==0&&y%i==0)
			{
				gcd=i;
			}
		}
		System.out.printf("GCD of "+x+" and "+y+" is: "+gcd);  
	}

}
