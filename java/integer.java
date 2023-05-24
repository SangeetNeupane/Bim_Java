/*make an array of integers of
 size 30 , store 30 integers 
 , then display integers that
 are between 16 and 47*/
import java.util.*;
class size{
void array(int a[]){
for(int i=0;i<a.length;i++){
if(a[i]>16&&a[i]<47)
{
System.out.println(a[i]);
}
}
}
}
class integer{
public static void main(String[] args)
{
System.out.println("enter the number");
int arr[]=new int[30];
Scanner s=new Scanner(System.in);
for(int i=0;i<arr.length;i++)
{
arr[i]=s.nextInt();
}
size z=new size();
z.array(arr);
}
}

