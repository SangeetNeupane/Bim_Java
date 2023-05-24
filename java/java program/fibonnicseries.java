import java.util.*;
public class fibonnicseries {
public static void main(String[] args)
{
    int n,a=0,b=1,c;
    Scanner s=new Scanner(System.in);
    n=s.nextInt();
    System.out.println(+a+ "\n" +b);
    for(int i=2;i<=n;i++)
    {
        c=a+b;
        System.out.println(c);
        a=b;
        b=c;

    }

}
    
}
