
class V{
    int c;
    void E(){
        int a=2, b=3;
        c=a+b;
System.out.println(c);
    }
    void E(int a,int b)
    {
         c=a+b;
        System.out.println(c);

    }
    void E(int e,int d, int c)
{
       c=e+d+c;
       System.out.println(c);

}
}
public class method {
    public static void main(String[] args) 
    {
    V e=new V();
     e.E();
     e.E(4,5);
    e.E(4,2,6);
    }
}
