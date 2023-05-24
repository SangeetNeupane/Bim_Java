interface num{
int add(int x,int y);
int diff(int x,int y);
}
class number implements num{
public int add(int x, int y)
{
int add=x+y;
return add;
}
public int diff(int x,int y){
int diff=x-y;
return diff;
}
}
class interfacenum{
public static void main(String [] args)
{
number r=new number();
int k,m;
k=r.add(4,6);
System.out.println(k);
m=r.diff(6,4);
System.out.println(m);
}
}
