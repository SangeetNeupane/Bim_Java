package haddi;

//with argument with return
class add3
{


int sum(int a, int b)
{

int c=a+b; 
return c;
}

  public static void main(String[]args)
{
  //Scanner rz=new Scanner(System.in);
  add3 ravi=new add3();
  int x=15;
  int y=17;
  int suruchi=ravi.sum(x,y);
  System.out.println("sum =" +suruchi );
  
}

} 

