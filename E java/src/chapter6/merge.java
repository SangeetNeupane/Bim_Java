package chapter6;

import java.util.*;
public class merge 
{
  void array(int e[],int f[])
  {
	 int x=e.length;
	 int y=f.length;
	 int z=x+y;
	  int p[]=new int[z];
	  for(int i=0;i<x;i++)
	  {
		  p[i]=e[i];
	  }
	  for(int i=0;i<y;i++)
	  {
		  p[x+i]=f[i];
	  }
	  System.out.println("The merged array is ; ");
	  for(int i=0;i<z;i++)
	  {
		  System.out.println(p[i]);
	  }
	  int s=p[0];
	  for(int i=0;i<z;i++)
	  {
		  if(s>p[i])
		  {
			  s=p[i];
		  }
	  }
	  System.out.println("The smallest number is "+s);
  }
  public static void main(String[] args)
  {
	  Scanner av=new Scanner(System.in);
	  System.out.println("Enter the size of array1 : ");
	  int n=av.nextInt();
	  System.out.println("Enter the size of array2 : ");
	  int m=av.nextInt();
	  System.out.println("Enter the elements of array1 : ");
	  int a[]=new int[n];
	  for(int i=0;i<n;i++)
	  {
		  a[i]=av.nextInt();
	  }
	  System.out.println("Enter the elements of array2 : ");
	  int b[]=new int[m];
	  for(int i=0;i<m;i++)
	  {
		  b[i]=av.nextInt();
	  }
	  merge ar=new merge();
	  ar.array(a,b);
  }
}
