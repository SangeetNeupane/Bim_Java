import java.util.*;
class search{
    void array(){
        int n; int c=0; int k=0; int i;
        Scanner s=new Scanner(System.in);
        System.out.println("Size of an array");
        n=s.nextInt();
        int z[]=new int[n];
        System.out.println("enter the element in array");
        for( i=0;i<n;i++){
            z[i]=s.nextInt();
        }
        System.out.println("enter the element for deletion");
        int a; a=s.nextInt();
        for(i=0;i<n;i++){
        c++;
           if(a==z[i])
           {
            k=1;
            break;
           }
        }
      if(k==1){
           System.out.println(a+ "is present at position" +c);
      }
      else{
        System.out.println(a+ "is not present at position");

      }
      int d[]=new int[n-1];
      for( i=0;i<c-1;i++){
             d[i]=z[i];
    } 
    for( i=c-1;i<n-1;i++){     

         d[i]=z[i+1];
     
    }
        System.out.println("elements after deletion");
      for(i=0;i<n-1;i++){
        System.out.println(d[i]);
      
    }
    
    }
        
         
    }

public class delete {
 public static void main(String[] args)
 {
    search e=new search();
    e.array();
 }
    
}
