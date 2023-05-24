package pastQuestion;

import java.util.Scanner;

class countries{
	void end_with() {
		Scanner rz=new Scanner(System.in);
		String a[]= new String[10];
		System.out.println("Enter the names of Countries:");
		for(int i=0;i<10;i++)
		{
		 a[i]  =rz.nextLine();
		}
		System.out.println("The Countries names ends with a are: ");
		for(int i=0;i<10;i++)
		{
		 if(a[i].endsWith("a")) 
		 {
			 System.out.println(a[i]);
		 }
		}
	}
}

public class Q14_2017 {

	public static void main(String[] args) {
		countries rk =new countries();
		rk.end_with();

	}

}
