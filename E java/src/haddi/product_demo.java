package haddi;

import java. util.*;
class product1
{
	int multiple=1;
  void make(int X[])
  {
    for(int i=0;i<10;i++)
    {
    if(X[i]<5)
    {
    	multiple=X[i]*multiple;
    }
  }
    System.out.println("The product of array less than 5 is"+multiple);
  }
}
public class product_demo
{

  public static void main(String[] args)
  {
    int arr[]=new int[10];
    Scanner bv=new Scanner(System.in);
    System.out.println("Enter the 10 num:-") ;
    for(int i=0;i<10;i++)
    {
      arr[i]=bv.nextInt();
    }
    product1 bd=new product1();
    bd.make(arr);
      }
      }
