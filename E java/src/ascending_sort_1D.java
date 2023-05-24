/**
 * Write a program to sort the element of an array
 */
import java.util.*;
public class ascending_sort_1D
{
    public static void main(String[] args)
    {
       System.out.print("\u000C");
       Scanner av=new Scanner(System.in);
       System.out.println("Enter the array size : ");
       int n=av.nextInt();
       System.out.println("Enter the elements of array :");
       int num[]=new int[n];
       int temp;
       for(int i=0;i<n;i++)
       {
           num[i]=av.nextInt();
       }
       for(int i=0;i<n;i++)
       {
           for(int j=i+1;j<n;j++)
           {
               if(num[i]>num[j])
               {
                   temp=num[i];
                   num[i]=num[j];
                   num[j]=temp;
               }
           }
           
       }
       System.out.println("Ascending order : ");
       for(int i=0;i<n;i++)
       {
           System.out.println(num[i]);
       }
    }
}