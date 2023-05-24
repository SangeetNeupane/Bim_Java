class aarati{
    int a=2;
    void aara(){
        int b=a+a;
        System.out.println("sum="+b);
    }
}
    class prerna extends aarati{
        int a=5;
        void aara(){ super.aara();
      int r=a+super.a;
      System.out.println("sum="+r);
        }
    }

public class super_key {
    public static void main(String[] args) {
       prerna p=new prerna();
       p.aara();
    }
}
