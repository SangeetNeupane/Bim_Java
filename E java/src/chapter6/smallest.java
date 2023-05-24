package chapter6;
import java.util.*;
class Smallest
{
 public static void main(String[] args)
 {
	 int s,i;
	 Scanner av=new Scanner(System.in);
	 System.out.print("Enter the array size : ");
	 int n=av.nextInt();
	 System.out.println("Enter the numbers : ");
	 int []a=new int[n];
	 for(i=0;i<n;i++)
	 {
		 a[i]=av.nextInt();
	 }
	 s=a[0];
	 for(i=0;i<n;i++)
	 {
		 if(s>a[i])
		 {
			 s=a[i];
		 }
	 }
	 System.out.println("The smallest number is " +s);
 }
}

