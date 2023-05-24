import java.util.*;
public class arrayprime {
    public static void main(String[] args){
        int num[]=new int[10];
        Scanner s=new Scanner(System.in);
        int n;
        System.out.println("size of array");
        n=s.nextInt();
        System.out.println("element of array");
    for(int i=0;i<n;i++)
    {
        num[i]=s.nextInt();
    }
    int temp=0;
    for(int i=0;i<n;i++)
    {
         temp=0;
        if(num[i]==1||num[i]==0)
        {
        System.out.println(+num[i]+" is not prime nor composite");
            
        }
        else
        {

        for(int j=2;j<num[i];j++)
        {
           if(num[i]%j==0)
           {
            temp=1;
               break;
           }
        }
        if(temp==1)
        {
            System.out.println(num[i]+" is not prime number");
        }
        else 
        {
            System.out.println(num[i]+" is prime number");
            
        }
    }
    
    }

    }
}
