import java.util.*;
class M{
    void rg(int e[],int d[],int w1,int w2){

    int n=w1+w2;
    int c[]=new int[n];
    for(int i=0;i<w1;i++)
    {
        c[i]=e[i];
    }
    for(int i=0;i<w2;i++)
    {
        c[w1+i]=d[i];
    }
    System.out.println("merged array");
    
    for(int i=0;i<n;i++)
    {
    System.out.println(c[i]);
    }
    int min;
    min=c[0];
    for(int i=0;i<n;i++)
{
    if(min>c[i])
    min=c[i];
}
System.out.println("minimum="+min);

}
}
public class merge {
public static void main(String[] args) {
    M m=new M();
    int n1; int n2;
    int a[]=new int[10];
    int b[]=new int[10];
    System.out.println("sizes of an array");
    Scanner s=new Scanner(System.in);
    n1=s.nextInt();
    n2=s.nextInt();
    System.out.println("element of array a");

    for(int i=0;i<n1;i++)
    {
        a[i]=s.nextInt();
    }
    System.out.println("element of array b");

    for(int i=0;i<n2;i++)
    {
        b[i]=s.nextInt();
    }
    m.rg(a,b,n1,n2);
}    
}
