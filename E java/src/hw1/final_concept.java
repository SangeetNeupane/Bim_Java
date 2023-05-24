package hw1;

class abc_final{ 
	  int a=20;  
	 final void abc1(){ // we can't over ride the function
	       a=a+a;
	        System.out.println("a+a="+a);
	    }
	}
	class abcd_final extends abc_final
	{
	    final int b=30;
	     void abcd1()
	     {
	        a=b+b;  // we can't over ride the b variable
	        System.out.println("b+b="+a);
	        
	     }
	}

	
public class final_concept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		abcd_final rz =new abcd_final ();
        
        rz.abc1();
        rz.abcd1();

	}

}
