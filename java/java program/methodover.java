class ab{
    int sum=0;
    void display(int a , int b){
    sum=a+b;
    System.out.println("sum in class ab="+sum);
    }
}
class abc extends ab{
    void display(int a , int b, int c){
    sum=a+b+c;
    System.out.println("sum in class abc="+sum);
    }
}
class abcd extends abc{
    void display(int a , int b, int c,int d, int e){
    sum=a+b+c+d+e;
    System.out.println("sum in class abcd="+sum);
    }
}

public class methodover {
    public static void main(String[] args) {
        abcd r=new abcd();
        r.display(2,3);
        r.display(4,5,6);
        r.display(2,2,2,2,2);
    }
}
