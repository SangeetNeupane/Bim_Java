import java.util.*;
class O{
    void R(int a[],int n){
  int temp;
   for(int i=0;i<n;i++){
   for(int j=i+1;j<n;j++){
    if(a[i]>a[j])
    {
        temp=a[i];
        a[i]=a[j];
        a[j]=temp;
    }
   }
   }
System.out.println("sorted");
   for(int i=0;i<n;i++){
System.out.println(a[i]);
    }
    System.out.println("third largest element is "+a[n-3]);
    int p; int k=0; int y;
    p=a[n-3];
    if(p==1||p==0)
    {
        System.out.println(p+"is not prime");
    }
    else{
        for(int i=2;i<p;i++)
        {
            if(p%i==0)
            {
                k=1;
            }
        }
        if(k==0){
            System.out.println(p+ " is prime");
            y=p*p;
            System.out.println("square of "+p+" is " +y);

        }
        else{
            System.out.println(p+"is not prime");

        }
    }
}
}
public class sort {
    public static void main(String[] args) {
        O o=new O();
        int b[]=new int[10];
        int c; int temp;
        Scanner s=new Scanner(System.in);
        System.out.println("enter the size of array");
        c=s.nextInt();
     System.out.println("enter the element");
     
        for(int i=0;i<c;i++)
        {
         b[i]=s.nextInt();
        }
        o.R(b,c);
    }
}
