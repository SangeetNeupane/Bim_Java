import java.util.*;
class grea{
    
    int G()
    {
      int a, b, c, d;
        System.out.println("enter the numbers");
        Scanner s=new Scanner(System.in);
        a=s.nextInt();
        b=s.nextInt();
        c=s.nextInt();
        d=s.nextInt();
  
      if(a>b && a>c && a>d)
      {
        return a;
      }
      else if(b>a && b>c && b>d)
      {
        return b;
      }
      else if (c>b && c>a && c>d)
      {
        return c;

      }
      else{
        return d;
      }

      
    }
}
public class great {
    public static void main(String[] args){
        grea g=new grea();
        int k;
        k=g.G();
        System.out.println(k+ " is a greater number");

    }
}
