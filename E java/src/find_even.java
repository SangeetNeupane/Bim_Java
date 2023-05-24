/**
 * Write a program to find all even elements
 */
import java.util.*;
public class find_even
{
    public static void main(String[] args)
    {
        System.out.print("\u000C");
        int i;
        Scanner av=new Scanner(System.in);
        System.out.println("Enter the size of array :");
        int n=av.nextInt();
        System.out.println("Enter the elements of array : ");
        int num[]=new int[n];
        for(i=0;i<n;i++)
        {
            num[i]=av.nextInt();
        }
        av.close();
        System.out.println("Even numbers are : ");
        for(i=0;i<n;i++)
        {
            if(num[i]%2==0)
            {
                System.out.println(num[i]);
            }
        }
        
    }
}