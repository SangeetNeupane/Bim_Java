package lab1;
import java.util.*;
public class while_loop_example {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub

		
		System.out.println("Enter the number to factorial:-");
		Scanner rz=new Scanner(System.in);
		int num=rz.nextInt();
		int fact=1;
		while(num>0)
		{
			fact=fact*num;
			num--;
		}
		System.out.println("Factorial= "+fact);
	}

}
