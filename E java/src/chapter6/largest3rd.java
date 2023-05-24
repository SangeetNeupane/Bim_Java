package chapter6;


import java.util.*;
class largest3rd 
{
	void sort(int a[],int n)
	  {
		  int temp;
		  for(int i=0;i<n;i++)
		  {
			  for(int j=i+1;j<n;j++)
			  {
				  if(a[i]<a[j])

{
					  temp=a[i];
					  a[i]=a[j];
					  a[j]=temp;		  
				  }
			  }
		  }
		  System.out.println("The 3rd largest number is : " +a[2]);
		 int num=a[2];
		 int rem=1;
		 for(int i=2;i<num;i++)
		 {
			 if(num%i==0)
			 {
				 rem=0;
				 break;
			 }
		 }
		 if(rem==1)
		 {
			 System.out.println("The 3rd largest number "+num+ " is prime." );
			 System.out.println("The square of the number is "+num*num);
		 }
		 else
		 {
			 System.out.println("The 3rd largest number "+num+ " is not prime.");
		 }
	  }
	  public static void main(String[] args)
	  {
		  Scanner av=new Scanner(System.in);
		  System.out.println("Enter the size of array : ");
		  int k=av.nextInt();
		  System.out.println("Enter the numbers : ");
		  int x[]=new int[k];
		  for(int i=0;i<k;i++)
		  {
			 x[i]=av.nextInt();
		  }
		  largest3rd ar=new largest3rd();
		  ar.sort(x,k);
	  }
}

