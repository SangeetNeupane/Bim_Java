import java.util.*;
public class check {
    public static void main(String [] args)
    {
        System.out.println("enter the element of array");
        int a[]=new int[10];
        int p=0,n=0,o=0;
        Scanner s=new Scanner(System.in);
        for(int i=0;i<10;i++)
        {
            a[i]=s.nextInt();
        }
        for(int i=0;i<10;i++)
{
    if(a[i]>0)
    {
        System.out.println("positive number="+a[i]);
             p++;
    }
    else if(a[i]<0)
    {
        System.out.println("negative number="+a[i]);
             n++;
    }
    else
    {
        System.out.println("zero"+a[i]);
              o++;
    }
}
    System.out.println(" Total positive number="+p);
    System.out.println(" Total negative number="+n);
    System.out.println(" Total zero="+o);


    }
    
}
