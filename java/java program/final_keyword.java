 class beautiful{ 
  int a=20;  
 final void beauty(){ // we cant over ride the function
        int r=a+a;
        System.out.println("a="+r);
    }
}
class Adorable extends beautiful{
     int b=30;
     void adore(){
        b=b+b;
        System.out.println("b="+b);
     }
}

public class final_keyword {
    public static void main(String[] args) {
        Adorable call1 =new Adorable();
            call1.beauty();
            call1.adore();
    }
}
