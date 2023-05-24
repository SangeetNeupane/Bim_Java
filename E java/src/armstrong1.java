//armstrong number 1to 1000
public class armstrong1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=0,a,sum=0,i;
		System.out.println("Armstrong numbers between 1 to 1000 are");
		for( i=1;i<=1000;i++)
		{
			for(n=i;n>0;n/=10)
			{
				a=n%10;
				sum=sum+(a*a*a);
				
			}
			if(sum == i)
			{
				System.out.print(i+",");
			}
			sum=0;
		}
	}

}
