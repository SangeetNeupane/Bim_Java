import java.util.*;
class Array
{
    void maxmin(int x[] , int n)
    {
        int max,min;
        Scanner sa=new Scanner(System.in);
       // System.out.println("enter the element :");
        n=x.length;
       // System.out.println("enter the element :");

       /*  for(int i=0;i<n;i++)
        {
            x[i]=sa.nextInt();
        } */
        max=x[0];
        for(int i=0;i<n;i++)
        {
            if(x[i]>max)
            {
                max=x[i];
            }
        }
        System.out.println("maximum="+max);
        min=x[0];
        for(int i=0;i<n;i++)
        {
            if(x[i]<min)
            {
                min=x[i];
            }
        }
        System.out.println("minimum="+min);
        
        
    }
}
public class greater {
       public static void main(String[] args) {
        Array r=new Array();
        Scanner sa=new Scanner(System.in);
       int y[]={9,2,3,4,10};
       int l=y.length;
        r.maxmin(y,l);

       }
    
}
