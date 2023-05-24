//string for name 1d

import  java.util.*;
public class string_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner rz  = new Scanner(System.in);
		Scanner av  = new Scanner(System.in);
		System.out.println("How many names you waana enter in the array:");
		int n=av.nextInt();
		String a[]= new String[n];
		System.out.println("Enter the names:");
		for(int i=0;i<n;i++)
		{
		 a[i]  =rz.nextLine();
		}
		System.out.println("The names you have entered are:-");
		for(int i=0;i<n;i++)
		{
			System.out.println(a[i]);
		}
	}

}
