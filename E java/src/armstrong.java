//Armstrong between 1 to 500
public class armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n, a, sum = 0,i;
        System.out.println("Armstrong numbers from 1 to 500 are:");
        for(i = 1; i <= 500; i++)
        {
            n = i;
            while(n > 0)
            {
                a = n % 10;
                sum = sum + (a* a * a);
                n = n / 10;
            }
            if(sum == i)
            {
                System.out.print(i+"\t");
            }
            sum = 0;
        }

	}

}
