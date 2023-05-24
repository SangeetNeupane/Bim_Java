import java.util.*;
public class if_else_if
{
   public static void main(String[] args)
   {
       System.out.print("\u000C");
       Scanner rz=new Scanner (System.in);
       System.out.println("Enter the three number:-");
        
       int a=rz.nextInt();
       int b=rz.nextInt();
       int c=rz.nextInt();
       
       if(a>b&&a>c)
    {
    System.out.println(+a+" is greater");
    }
    else if(b>a&&b>c)
    {
        System.out.println(+b+" is greater");
 }
 else
 {
     System.out.println(+c+" is greater");
}
}
}