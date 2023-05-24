import java.util.*;
public class switch_case
{
   public static void main(String[] args)
   {
       System.out.print("\u000C");
       Scanner rz=new Scanner (System.in);
       System.out.println("Enter the two number:-");
        
       int a=rz.nextInt();
       int b=rz.nextInt();
       int result;
       System.out.println("Just type choice what do you want to do");
    System.out.println("\n1.Add\n2.Subtract\n3.Multiply\n4.Divide\n5.Remainder");
    System.out.println("\nEnter your choice=");
     int choice=rz.nextInt();
    switch(choice)
    {
        case 1:
            result=a+b;
        
            System.out.println("sum="+result);
        break;
        case 2:
            result=a-b;
        System.out.println("Difference="+result);
        break;
        case 3:
            result=a*b;
        System.out.println("Product="+result);
        break;
        case 4:
            result=a/b;
        System.out.println("Divide="+result);
        break;
        case 5:
            result=a%b;
        System.out.println("Remainder="+result);
        break;
        default:
            System.out.println("Invalid choice");
            break;
    }
    
}
}
