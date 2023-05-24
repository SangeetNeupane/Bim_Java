import java.util.*;

public class primeno {
    public static void main(String[] args)
    {
    System.out.println("enter the number");
    Scanner s=new Scanner(System.in);
    int num =s.nextInt();
    int i , k=0;
    if(num==1 || num==0)
    {
        System.out.println(+num+" is not prime nor composite");
    }
    else{
    for(i=2;i<num/2;i++)
    {
        if(num%i==0)
        {
         k=1;
        }
    }

    if(k==1)
    {
    System.out.println(+num+" is composite number");
        
    }
    else
    {
    System.out.println(+num+"is prime number");

    }
    }
} 
}

    

