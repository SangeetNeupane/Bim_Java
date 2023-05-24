package haddi;
import java.util.*;
class addition_matrix
{
	void addition()
	{
	int m,n;
	Scanner bv=new Scanner(System.in) ;
	System.out.println("enter the size of row of 1st matrix"); 
	m=bv.nextInt();
	System.out.println("enter the size of column of 1st matrix"); 
	n=bv.nextInt();
	
		int a[][]=new int[m][n];
	
     System.out.println("enter the matrix");
     for(int i=0;i<m;i++)
     {
    	 for(int j=0;j<n;j++)
    	 {
    		 a[i][j]=bv.nextInt();
    	 }}
    	 int sum=0;
    	 for(int i=0;i<m;i++)
         {
        	 for(int j=0;j<n;j++)
        	 {
        		 sum=sum+a[i][j];
        	 }
        	 
         }
    	 System.out.println("the sum of matrix="+sum);
    	 
     }}
public class matrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
addition_matrix rz=new addition_matrix();
rz.addition();
	}

}
