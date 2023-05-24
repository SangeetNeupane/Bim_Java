package haddi;
import java.util.*;
class second_largest_demo
{
  void largest(int arr[])
  	{	 
	  int temp,i,j;
      for(i=0;i<5;i++)
      {
        for(j=i+1;j<5;j++)
        {
          if(arr[i]<arr[j]) 
          {
             temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            }
             }
              }       
      System.out.println("The second largest num is:"+arr[1]);
  	}
}
public class second_largest {
   public static void main(String[] args)
    {
      Scanner BD=new Scanner (System.in);
      int X[]=new int[5];
      System.out.println("enter the five number");
      for(int i=0;i<5;i++)
      {
        X[i]=BD.nextInt();
        }
      second_largest_demo BV=new second_largest_demo();
      BV.largest(X);
  }




}
