//without return without argument
package chapter6;
import java.util.*;
class Sum
{
    int a,b,c;
    void add()
    {
         Scanner rk=new Scanner(System.in);
        System.out.println("Enter the two number:-");
        a=rk.nextInt();
        b=rk.nextInt();
        c=a+b;
        
        System.out.println("Total: "+c);
    }
    
    public static void main(String[]args)
    {
        
        Sum rz=new Sum();
        rz.add();
}}
