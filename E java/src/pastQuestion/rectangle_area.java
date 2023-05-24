package pastQuestion;
//2015Q14
import java.util.Scanner;
class rectangle3{
	int length;
	int breadth;
	int compute_area(int l,int b) 
	{ 
		length =l;
		breadth=b;
		int area=l*b;
		return area;
	}
	void display_area(int a1,int a2)
	{
		if(a1>a2) {
			System.out.println("The area of 1st rectangle is larger i.e  "+a1);
		}
		else {
			System.out.println("The area of 2nd rectangle is larger i.e  "+a2);
		}
	}
}


public class rectangle_area {

	public static void main(String[] args) {
		Scanner rz=new Scanner(System.in);
		rectangle3 rk[]=new rectangle3[2];
		for(int i=0;i<2;i++)
		{
			rk[i]=new rectangle3();
		}
		System.out.println("Enter the length and breadth of 1st rectangle");
		int l1=rz.nextInt();
		int b1 =rz.nextInt();
		int area1=rk[0].compute_area(l1,b1);
		System.out.println("Enter the length and breadth of 2nd rectangle");
		int l2=rz.nextInt();
		int b2 =rz.nextInt();
		int area2=rk[1].compute_area(l2,b2);
		rk[1].display_area(area1,area2);
		

	}

}
