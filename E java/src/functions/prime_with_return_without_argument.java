package functions;

import java.util.Scanner;

public class prime_with_return_without_argument {
	int prime()
	{
		Scanner rz=new Scanner(System.in); 
		System.out.println("Please Enter the positive number except 1 because 1 is either prime nor composite.  ");
        
        System.out.println("Enter the number : ");
        int num=rz.nextInt();
        int rem=0;
        for(int i=2;i<num;i++)
            {
             if(num%i==0)
                {
                    rem=1;
                    break;
                }
            }
        return rem;
            
        }
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int remainder;
		prime_with_return_without_argument rk=new prime_with_return_without_argument();
		remainder=rk.prime();
		if(remainder == 0)
        {
          System.out.println("The given number is prime number  ");  
        }
        else
       {
    	System.out.println("The given number isn't prime number  "); 
       }

	}


}
