package inheritance;
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


public class hierchical_inhertance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bim rz=new Bim();
		   Bba rk=new Bba();
		   rz.p();
		   rz.i();
		   rk.p();
		   rk.b();

	}

}
