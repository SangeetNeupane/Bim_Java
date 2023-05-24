/**
 * Write a program to find all the prime numbers of array
 */
import java.util.*;
public class prime_number_1D
{
    public static void main(String[] args)
    {
        
        Scanner av=new Scanner(System.in);
        System.out.println("Please enter the size of array : ");
        int n=av.nextInt();
        System.out.println("Please Enter the positive number expect 1 because 1 is either prime nor composite.  ");
        
        System.out.println("Enter the numbers : ");
        int num[]=new int[n];
        int rem=0;
        for(int i=0;i<n;i++)
        {
           num[i]=av.nextInt(); 
        }
        System.out.println("The prime numbers are :");
        
        for(int i=0;i<n;i++)
        {
            for(int j=2;j<num[i];j++)
            {
                rem=0;
                if(num[i]%j==0)
                {
                    rem=1;
                    break;
                }
            }
        
            if(rem == 0)
            {
              System.out.println(num[i]);  
            }
        }
    }
}