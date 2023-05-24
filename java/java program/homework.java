import java.util.*;
class reve{
    int n;
    int rev=0, rem=0;
    void r(int t){
        n=t;
        System.out.println(n);
    }
}
class pass extends reve{
    int w(){
      while(n!=0){
        rem=n%10;
        rev=rev*10+rem;
        n=n/10;

      }
      return rev;
    }
}
public class homework {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter the number");
        int p=s.nextInt();
        int k;
        pass a=new pass();
        a.r(p);
        k=a.w();
        System.out.println("revesre number="+k);
    }
}
