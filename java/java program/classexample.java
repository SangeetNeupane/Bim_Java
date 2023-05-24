import java.util.*;
class add{
int a,b,c , e;
String aa,bc;
Scanner s=new Scanner(System.in);

void sum(int x,int y)
{
     c=a+b;
   e=a-b; 

}
void aarati()
{
    aa=s.nextLine();
    bc=s.nextLine();
}
}
public class classexample {
    public static void main(String [] args)
    {
        add d=new add();
        Scanner s=new Scanner(System.in);
        System.out.println("enter the two number");

         d.a=s.nextInt();
        d.b=s.nextInt();
        d.sum(d.a,d.b);
        
        System.out.println("sum="+d.c);
        System.out.println("sub="+d.e); 
        d.aarati();
        System.out.println(d.aa.length());
        System.out.println(d.bc.length());

    }
}
