import java.util.*;
public class parmstrong {
    public static void main(String [] args)
    {
    int n,result=0,i,rem=0;
    for(i=1;i<=500;i++)
    {
        n=i;
        while(n!=0)
        {
            rem=n%10;
            result+=rem*rem*rem;
            n=n/10;

        }
        if(result==i)
        {
            System.out.println(i);
        }
        result=0;
    }
    }
    
}
