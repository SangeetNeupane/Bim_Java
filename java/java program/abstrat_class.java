abstract class f{
    abstract void a();
}
class R extends f{
    void a(){
        int y=2,z=3;
        int sum;
        sum=y+z;
System.out.println("sum="+sum);
    }
}
class T extends f{
    void a(){
        int y=9,z=2;
        int mul=y*z;
        System.out.println("multiply="+mul);
    }
}
public class abstrat_class {
    public static void main(String[] args) {
        f call= new R();
        f call1= new T();
        call.a();
        call1.a();
    }
}
