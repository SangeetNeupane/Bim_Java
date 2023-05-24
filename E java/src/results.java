import java.util.*;
public class results
{
   public static void main(String[] args)
   {
       System.out.print("\u000C");
       Scanner rz=new Scanner (System.in);
       System.out.println("Enter the Marks you have Scored :-");
       int score=rz.nextInt();
       if(score<=100)
       {
           switch( score / 10 )
           {
    case 10:
         System.out.println("Grade: A+");
         break;
   case 9:
     System.out.println("Grade: A+");
     break;

   case 8:
     System.out.println("Grade: A");
     break;

   case 7:
     System.out.println("Grade: B+");
     break;

   case 6:
     System.out.println("Grade: B");
     break;

   case 5:
     System.out.println("Grade: C+");
     break;

   case 4:
     System.out.println("Grade: C"); 
     break;
     
   default:
        System.out.println("Grade: D+ (Fail)"); 
     break;
   }
}
else
{
    System.out.println("Enter the number between 0-100");
}
}
}
