public class test {
    static int x=10;
    int y=70;
    public static void main(String[] args) {
        test t=new test();
        t.x=40;
        t.y=60;
        test t1=new test();
        System.out.println(t1.x+"    "+t1.y);
    }
    
}
