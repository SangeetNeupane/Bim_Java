import java.util.*;

public class display {
  display(String n, String a, int r,int m){
    System.out.println("Name:-"+n);
    System.out.println("Address:-"+a);
    System.out.println("Roll_no:-"+r);
    System.out.println("Total mark:-"+m);
  }
  public static void main(String [] args){
    String w,x;
    int y,z;
    Scanner s=new Scanner(System.in);
    System.out.println("enter the name");
     w=s.nextLine();
     System.out.println("enter the address");
     x=s.nextLine();
     System.out.println("enter the roll_no");
     y=s.nextInt();
     System.out.println("enter the Total mark");
     z=s.nextInt();
     display d=new display(w,x,y,z);
  }
}
