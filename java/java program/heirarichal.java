class Bpc{
     void p(){
        System.out.println("Birgunj public college");
    }
}
class Bim extends Bpc{
     void i(){
        System.out.println("BIm course is available in Bpc");
    }
}
class Bba extends Bpc{
    void b(){
        System.out.println("BBA course is available in Bpc");
    }
}
public class heirarichal {
   public static void main(String[] args) {
    Bim call=new Bim();
    Bba call1=new Bba();
call.p();
call.i();
call1.p();
call1.b();
   }
}
