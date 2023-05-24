package nimeshsir;

public class nested_try_catch {

	public static void main(String[] args) {
		try{
			 int a=2;//a=1;//a=0;
			 int b=24/a;
			 System.out.println(b);
		 try{
			 if(a==1) 
			 {
				 a=a/(a-a);
			 }
			 if(a==2) {
			  int c[]={32,64};
			  c[2]=94;
			  System.out.println(c[2]);
			 }
			  
		 	}
		catch(ArrayIndexOutOfBoundsException rk){
			  System.out.println(rk);
			  System.out.println("Error when we enter a=2");
			}
			  
		}
			  
		catch(ArithmeticException rz)
			  {
			  System.out.println(rz);
			  System.out.println("Error when we enter a=0 & a=1");
			  
			  }

	}

}
