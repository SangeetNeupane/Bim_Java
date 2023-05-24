class A{
    int a=2;
    int p=16;
    void display1(){
        System.out.println("a="+a);
        System.out.println("class A p="+p);
    }
}
class B extends A{
    int d=3,sum=0;
    int p=20;
    void display2()
    {
        sum=a+d;
        System.out.println("sum of class B="+sum);
        System.out.println("class B p="+super.p);
    }
}
class C extends B {
    int c=2;
    int p=90;
    void display3(){
   sum=a+d+c;
   System.out.println("sum of class C="+sum);
   System.out.println("class c p="+super.p);
    }
}
class D extends C {
    int r=2;
    int p=80;
    void display4(){
   sum=a+d+c+r;
   System.out.println("sum of class D="+sum);
   System.out.println("class D p="+super.p);
    }
}
public class inheritance {
    public static void main(String[] args) {
        D e=new D();
       e.display1();
       e.display2();
       e.display3();
       e.display4();
    }
}
