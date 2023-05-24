import java.util.*;
public class power {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner rz=new Scanner(System.in);
		System.out.println("Enter the number:-");
		int n =rz.nextInt();
		System.out.println("Enter the power:-");
		int p =rz.nextInt();
		int a=1;
		while(p>0)
		{
			a=a*n;
			p--;
		}
		System.out.println(a);
					
			
		}
		

	}


