import java.util.*;
public class reverse {
    public static void main(String[] args)
    {
        int num;
        System.out.println("enter the number");
        Scanner s=new Scanner(System.in);
        num=s.nextInt();
        int rem=0;
        int reverse=0;
    for( int i=0;i<num;i++)
    {
        rem=num%10;
       reverse=reverse*10+rem;
       num=num/10;
       
    }
System.out.println("reverse number="+reverse);
    }

    
}
