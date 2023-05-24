class arrayindexexception{
public static void main(String[] args)
{
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
  }
  