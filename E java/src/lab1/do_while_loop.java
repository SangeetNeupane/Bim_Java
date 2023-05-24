package lab1;


import java.util.*;
public class do_while_loop {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub

		
		System.out.println("Enter the number to factorial:-");
		Scanner rz=new Scanner(System.in);
		int num=rz.nextInt();
		int fact=1;
		do
		{
			fact=fact*num;
			num--;
		}while(num>0);
		System.out.println("Factorial= "+fact);
	}

}
