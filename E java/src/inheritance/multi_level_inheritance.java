package inheritance;
class cba{
	int a=56,b=81,sum=0;
	void sum()
	{
		sum=a+b;
		System.out.println("Add of two Number in abc class "+sum);
	}
	
}
class def extends cba{
	int sub=0;;
	void difference()
	{
		sub=a-b;
		System.out.println("Difference of two Number in def class "+sub);
	}
}
class ghi extends def{
	int multi=0;
	void multiply() 
	{
		multi=a*b;
		System.out.println("Multiply of two Number in ghi class "+multi);
	}
}
class zxy extends ghi{
	int a=5,b=8,c=2,d=0;
	void arthimetic() 
	{
		d=a*b+c;
		System.out.println("Simplify of  Numbers in xyz class "+d);
	}
}

public class multi_level_inheritance {

	public static void main(String[] args) {
		zxy rz =new zxy();
		rz.sum();
		rz.difference();
		rz.multiply();
		rz.arthimetic();

	}

}
