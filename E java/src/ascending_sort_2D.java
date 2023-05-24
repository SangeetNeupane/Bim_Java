/**
 *Write a program to sort the element of an array (2D)
 */
import java.util.*;
public class ascending_sort_2D
{
    public static void main(String[] args)
    {
        int i;
        int j;
        System.out.print("\u000C");
       Scanner av =new Scanner(System.in);
       System.out.println("Enter the array size in row : ");
       int a=av.nextInt();
       System.out.println("Enter the array size in column :");
       int b=av.nextInt();
       System.out.println("Enter the elements of "+a+ " X " +b+ " array :");
       int n[][]=new int[a][b];
       for(i=0;i < a;i++)
       {
           for(j=0;j < b;j++)
           {
             n [i][j]=av.nextInt();
           }
       }
      int temp;
     
      int k;
      int l;
       for( i=0;i < a;i++)
       {
           for( j=0;j < b;j++)
           {
               temp=n[i][j];
               
               for (k = i; k < a; k++) 
               {
                   for (l = j+1; l < b; l++)
                   {
                       if (temp> n[k][l])
                       {
                           temp = n[k][l];
                           n[k][l] = n[i][j];
                           n[i][j] = temp;
                       }
                       l++;
                   }
                   l=0;
                }
           }
         }
       
       System.out.println("Ascending order : ");
       for(i=0;i<a;i++)
       {
           for(j=0;j<b;j++)
           {
           System.out.print(n[i][j]+" ");
       }
           System.out.println(); 
       }
       av.close();
    }
}