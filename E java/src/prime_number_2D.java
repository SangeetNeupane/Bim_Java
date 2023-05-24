/**
 * Write a program to find all the prime numbers of array
 */
import java.util.*;
public class prime_number_2D
{
    public static void main(String[] args)
    {
        System.out.print("\u000C");
        Scanner av=new Scanner(System.in);
        System.out.println("Please enter the size of row of array : ");
        int n=av.nextInt();
        System.out.println("Please enter the size of column of array : ");
        int b=av.nextInt();
        System.out.println("Please Enter the positive number expect 1 because 1 is either prime nor composite.  ");
        
        System.out.println("Enter the numbers : ");
        int num[][]=new int[n][b];
        int rem=0;
        for(int i=0;i<n;i++)
        {
        	for(int j=0;j<b;j++)
        	{
           num[i][j]=av.nextInt();
        	}
        }
        System.out.println("The prime numbers are :");
        
        for(int i=0;i<n;i++)
        {
        	for(int j=0;j<b;j++)
        	{
            for(int k=2;k <num[i][j];k++)
            {
                rem=0;
                if(num[i][j]%k==0)
                {
                    rem=1;
                    break;
                }
            }
        
            if(rem == 0)
            {
              System.out.println(num[i][j]);  
            }
        	}
        }
    }
}
