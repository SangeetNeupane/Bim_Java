//2015-16
class nested_try_catch{
public static void main(String[] args){
 try{
 int a=args.length;
 int b=20/a;
 System.out.println(b);
 try{
  int c[]={23,65};
  c[2]=34;
  System.out.println(c[2]);
  }
  catch(ArrayIndexOutOfBoundsException e)
  {
  System.out.println(e);
  }
  }
  catch(ArithmeticException w)
  {
  System.out.println(w);
  }
  }
  }
  