package haddi;


 class number {
	 
	 int suruchi(int a)
	 {
		 int temp;
		 if(a%2==0)
		 {
			temp=1; 
		 }
		 else
		 {
			 temp=0;
		 }
		 return temp;
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		number rz=new number();
		int x=33;
		int b=rz.suruchi(x);
		if(b==1)
		 {
			System.out.println("Even"); 
		 }
		 else
		 {
			 System.out.println("odd");
		 }

	}

}
