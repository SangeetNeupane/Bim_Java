import java.util.*;
public class search {
    public static void main(String[] args)
    {
    
        String q="prerna";
        int p=0 ,t=0;
        Scanner s=new Scanner(System.in);
       String f []=new String[10];
       System.out.println("enter the string");
       for(int i=0;i<5;i++)
       {
        f[i]=s.nextLine();
       }
       for(int i=0;i<5;i++)
        {
            p++;
            if (q.equals(f[i]))
            {
              t=1;
              break;
            }
        }
        if(t==1)
        System.out.println(q+"is found at position"+p);
        else
        System.out.println("not found");
    }
    
}
