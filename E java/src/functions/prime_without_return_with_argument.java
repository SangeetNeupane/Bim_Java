package functions;

import java.util.Scanner;

 class prime_without_return_with_argument {

	void prime(int y)
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
            
        if(rem == 0)
            {
              System.out.println("The given number is prime number i.e "+num);  
            }
        else
        {
        	System.out.println("The given number isn't prime number i.e "+num); 
        }
        }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner rz=new Scanner(System.in); 
		System.out.println("Please Enter the positive number expect 1 because 1 is either prime nor composite.  ");
        
        System.out.println("Enter the number : ");
        int a=rz.nextInt();
		prime_without_return_with_argument rk=new prime_without_return_with_argument();
		rk.prime(a);

	}
	
	
}
