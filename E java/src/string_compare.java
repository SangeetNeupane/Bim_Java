import  java.util.*;
public class string_compare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner rz  = new Scanner(System.in);
		String a[]= new String[5];
		System.out.println("Enter the names:");
		int temp=0;
		for(int i=0;i<5;i++)
		{
			a[i]=rz.nextLine();
		}
		for(int i=0;i<5;i++)
		{
			if (a[i].equals("Ram"))
			{
				temp=1;
				break;
				
			}
			
		}
		if(temp==1)
		{
			System.out.println("Ram is present in the class");
		}
		else
		{
			System.out.println("Ram isn't present in the class");	
		}
		
				int b[]= new int[5];
				System.out.println("Enter the roll number of  who are present:");
				Scanner av  = new Scanner(System.in);
				int temp1=0;
				for(int i=0;i<5;i++)
				{
					b[i]=av.nextInt();
				}
				for(int i=0;i<5;i++)
				{
					if (b[i] == 7)
					{
						temp1=1;
						break;
						
					}
					
				}
				if(temp1==1)
				{
					System.out.println("Roll num 07 is present in the class");
				}
				else
				{
					System.out.println("Roll num 07 isn't present in the class");	
				}

		
		
	}

}
