import java.util.Scanner;
class merge{
    void merging(int p[],int l)
    {
        int i;
        int small;
        small=p[0];
        for(i=0;i<l;i++)
        {
            if(p[0]>p[i])
            {
                small=p[i];

            }
            
        }
        System.out.println("This is smallest element:"+small);
    }

}


public class mergeandsmall {
    public static void main(String args[])
    {
        merge m=new merge();
        int i=0;
        int a[]={1,2,3,4,5};
      int b[]={6,7,8,9};
      int length;
      length =a.length+b.length;
      
      int c[]=new int[length];
      for(int n:a){
        c[i]=n;
        i++;
      }
      for(int z:b)
      {
        c[i]=z;
        i++;
      }
      System.out.println("Merged elements are:-");
      for(i=0;i<length;i++)
      {
      System.out.println(c[i]);
      }
      m.merging(c,length);


      }


    }