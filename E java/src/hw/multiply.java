package hw;
import java.util.*;
class multiply {
	    int z;
	    void input_number()
	    {   
	    	Scanner rz=new Scanner(System.in);
	      System.out.println("Enter the Number:-");
	      int a=rz.nextInt();
	      int b=rz.nextInt();
	      z=a*b;
	    }
	    void output_number()
	    {
	      System.out.println(z);
	      }
	      public static void main(String[] args)
	      {
	        multiply rk=new multiply ();
	        rk.input_number();
	        rk.output_number();
	   }
	        

}
