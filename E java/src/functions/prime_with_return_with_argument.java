package functions;

import java.util.Scanner;

 class prime_with_return_with_argument {
	int prime(int y)
	{
		int num= y;
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
		
		Scanner rz=new Scanner(System.in); 
		System.out.println("Please Enter the positive number expect 1 because 1 is either prime nor composite.  ");
        
        System.out.println("Enter the number : ");
        int a=rz.nextInt();
		prime_with_return_with_argument rk=new prime_with_return_with_argument();
		int remainder;
		remainder=rk.prime(a);
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
