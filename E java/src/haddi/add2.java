package haddi;

//without argu with return
class add2
{

int a;
int b;
int sum()
{
a=15;
b=17;
int c=a+b; 
return c;
}

  public static void main(String[]args)
{
  //Scanner rz=new Scanner(System.in);
  add2 ravi=new add2();
  int suruchi=ravi.sum();
  System.out.println("sum =" +suruchi );
  
}

} 

