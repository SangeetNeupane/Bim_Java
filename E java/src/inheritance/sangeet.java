package inheritance;
class addition 
{
	int add;

		void sum(int a,int b)
	  {
		  int add=a+b;
	    System.out.println("the sum of a and b:- "+add);
	    }
	
	 void sum(int a,int b,int c)
	 {    
		 add=a+b+c;
	 
	      System.out.println("the sum of a , b and c:-  "+add);
	      }
}
public class sangeet {

	
		  public static void main(String[] args) 
		{
		    int x=2;
		    int y=3;
		    int z=4;
		    addition rz=new addition ();

		   rz.sum(x,y);
		   rz.sum(x,y,z);
		      }
		}

