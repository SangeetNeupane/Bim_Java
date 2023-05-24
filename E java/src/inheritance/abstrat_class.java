package inheritance;

abstract class fun{
    abstract void a();
}
class R extends fun{
    void a(){
        int y=2,z=3;
        int sum;
        sum=y+z;
System.out.println("sum="+sum);
    }
}
class T extends fun{
    void a(){
        int y=9,z=2;
        int mul=y*z;
        System.out.println("multiply="+mul);
    }
}
public class abstrat_class {
    public static void main(String[] args) {
        fun rz= new R();
        fun rk= new T();
        rz.a();
        rk.a();
    }
}