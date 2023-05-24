package functions;
import java.util.*;
class prime_without_return_without_argument {
	
	void prime()
	{
		Scanner rz=new Scanner(System.in); 
		System.out.println("Please Enter the positive number expect 1 because 1 is either prime nor composite.  ");
        
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
		
		prime_without_return_without_argument rk=new prime_without_return_without_argument();
		rk.prime();

	}

}
