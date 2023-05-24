import java.util.*;
class prime {
    int pri()
    {
        int w;
        System.out.println("enter the number");
        Scanner s=new Scanner(System.in);
        w=s.nextInt();
        int i , Q=0;
    if(w==1 || w==0)
    {
        return 1;
    }
    else{
    for(i=2;i<w;i++)
    {
        if(w%i==0)
        {
         Q=1;
        }
    }

    if(Q==1)
    {
      return 1; 
    }
    else
    {

    return 0;
    }
    }

}
}
public class woawor {
    public static void main(String[] args)
    {
    
        prime p=new prime();
        /* System.out.println("enter the number");
        Scanner s=new Scanner(System.in);
        n=s.nextInt(); */
        int k; 
       k= p.pri();
       if(k==1){
        System.out.println( "the number is  not prime number");
       }
        else if (k==1)
        {
        System.out.println(" the number is  not prime number");

        }
        else{
        System.out.println("the number  is  prime number");

        }
       


    }
}
