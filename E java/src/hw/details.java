package hw;
import java.util.*;
public class details {
		String name;
		String address;
		int num;
		
		  details()
		  {
		  Scanner rk=new Scanner(System.in);
		  Scanner rz=new Scanner(System.in);
		  System.out.println("Enter the name:-");
		    
		     name=rz.nextLine();
		    System.out.println("Enter the address:-");
		    
		     address=rz.nextLine();
		      
		      System.out.println("Enter the obtained number:-");
		      
		        num=rk.nextInt();
		        
		          System.out.println(" Details :-");
		          System.out.println("Name "+" Address "+" Number" );
		          System.out.println(name+"   " + address+"    " +num);
		          }
		          public static void main(String [] args)
		          {
		          details av=new details ();
		         
		    }

}
