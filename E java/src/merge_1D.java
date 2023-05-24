//merge 1D array
import java.util.*;
public class merge_1D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner rz = new Scanner(System.in);
	System.out.println("Enter the size of array 1:-");
	int n = rz.nextInt();
	System.out.println("Enter the size of array 2:-");
	int m = rz.nextInt();
	int a[]=new int[n];
	int b[]=new int[m];
	System.out.println("Enter the elements of array 1:-");
	for(int i=0;i<n;i++)
	{
		a[i]=rz.nextInt();
	}
	System.out.println("Enter the elements of array 2:-");
	for(int i=0;i<m;i++)
	{
		b[i]=rz.nextInt();
	}
	int k= a.length;
	//System.out.println(k);
	int l= b.length;
	int d=k+l;
	int e[]=new int [d];
	for(int i=0;i<k;i++)
	{
		e[i]=a[i];
	}
	for(int i=0;i<l;i++)
	{
		e[k+i]=b[i];
	}
	System.out.println("The array after merged is:-");
	for(int i=0;i<d;i++)
	{
		System.out.println(e[i]);
	}
	}

}
