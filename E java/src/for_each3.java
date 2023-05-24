import java. util.*;
public class for_each3
{
    public static void main(String[]args)
    {
        Scanner rz=new Scanner(System.in);
        System.out.println("Enter the five numbers:-");
       int i,sum=0;
       int a[]= new int[5];
        for(i=0;i<5;i++)
        {
            a[i]=rz.nextInt();
        }
        for(int b:a)
        {
            sum=sum+b;
        }
        System.out.println("The sum of number you have entered is "+sum);
        rz.close();
    }
}