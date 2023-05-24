import java.util.*;
public class array {
public static void main(String [] args){
int a[]=new int[15];
int n;
Scanner s=new Scanner(System.in);
System.out.println("enter the size of array");
n=s.nextInt();
System.out.println("enter the element of array");
for( int i=0;i<n;i++)
{
    a[i]=s.nextInt();
}
System.out.println( "output:");
int sum =0;
for( int i=0;i<n;i++)
{  
System.out.println( a[i]);
sum=sum+a[i];

}
System.out.println( "sum of array:"+sum);
int temp=0;
int position=0; 
 int search;
System.out.println("enter the search element");
search=s.nextInt(); 
for( int i=0;i<n;i++)
{
    position++;
    if(search==a[i])
    {
       temp=1;
    break;
    }
}
if(temp==1)
{
System.out.println(search+" is present at position  "+position);

}
else
{
System.out.println( search+" is not present ");

}
}
    
}
