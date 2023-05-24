package nimeshsir;

public class caughtExceptionArrayIndexOutOfBoundsException {

	public static void main(String[] args) {
		try{
			  int arr[]={5,7};
			  arr[2]=32;
			  System.out.println(arr[2]);
			  }
			  catch(ArrayIndexOutOfBoundsException rz)
			  {
			  System.out.println(rz);
			  }

	}

}
