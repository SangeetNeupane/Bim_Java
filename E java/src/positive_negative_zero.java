import java .util.*;
public class positive_negative_zero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner rz = new Scanner(System.in);
        int i;
        int countpositive=0; 
        int countnegative=0;
        int countzero=0;
        
        System.out.println("Enter the 10 number you want to check:");
        int num[]=new int[10];
        for(i=0;i<10;i++)
        {
        	num[i]= rz.nextInt();
           
	      }
        System.out.println("The positive numbers are:-");
        for(i=0;i<10;i++)
        {
        	if(num[i]>0)
        	{
        		System.out.println( num[i] );
        		countpositive++;
        	}
        }
        System.out.println("There are  " +countpositive+ " positive  numbers");
        System.out.println("The negative numbers are:-");
        for(i=0;i<10;i++)
        {
        	if(num[i]<0)
        	{
        		System.out.println( num[i] );
        		countnegative++;
        	}
        }
        System.out.println("There are  " +countnegative+  " negative numbers");
        System.out.println("The zero are:-");
        for(i=0;i<10;i++)
        {
        	if(num[i]==0)
        	{
        		System.out.println( num[i] );
        		countzero++;
        	}
        }
        System.out.println("There are  " +countzero+ "  zero");
      
	}

}
