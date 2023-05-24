/**
 * Write a program to find all even elements of an array.
 */
import java.util.*;
public class find_even_2D
{
   public static void main(String[] args)
   {
       System.out.print("\u000C");
       Scanner av=new Scanner(System.in);
       System.out.println("Enter the size of row : ");
        int r=av.nextInt();
       System.out.println("Enter the size of column : ");
       int c=av.nextInt();
       int num[][]=new int[r][c];
       System.out.println("Enter the elements of "+r+"X"+c+ "array");
       for(int i=0;i<r;i++)
       {
         for(int j=0;j<c;j++)  
         {
             num[i][j]=av.nextInt();
         }
       }
       System.out.println("The array is :");
       for(int i=0;i<r;i++)
       {
         for(int j=0;j<c;j++)  
         {
                 System.out.print(num[i][j]+ "\t");
         }
         System.out.println();
       }
       System.out.println("Even numbers are : ");
       for(int i=0;i<r;i++)
       {
         for(int j=0;j<c;j++)  
         {
             if(num[i][j]%2==0)
             {
                 System.out.println(num[i][j]);
             }
         }
       }
   }
}