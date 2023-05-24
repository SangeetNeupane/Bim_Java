package nimeshsir;

import java.util.Scanner;

class students_details
{
	String name;
	int roll;
	int mark;
	
	void output_data() 
	{
		System.out.println("The Name of  student:- "+name);
		System.out.println("The Roll no of  student:- "+roll);
		System.out.println("The marks obtained by  student is :- "+mark);
	}
}

public class array_objects
{
	public static void main(String[]args)
	  {
	     Scanner rk=new Scanner(System.in);
	     Scanner rs=new Scanner(System.in);
	     System.out.println("Enter the number of students:-");
	     int n=rk.nextInt();
	     students_details rz[]=new students_details[n];
	     int i;
	     for(i=0;i<n;i++) 
	     {
	    	rz[i]=new students_details();
	    	
	     }
	     int j=1;
	     for(i=0;i<n;i++) 
	     {
	    	
	    	 
	    	 System.out.println("Enter the Name  of serial no "+j+" student:-");
	    	rz[i].name=rs.nextLine();

	    	 System.out.println("Enter the roll no of serial no  "+j+"  student:-");
		    	rz[i].roll=rk.nextInt();
		    	System.out.println("Enter the marks obtained by serial no "+j+" student:-");
		    	rz[i].mark=rk.nextInt();
		    	j++;
	     }
	     for(i=0;i<n;i++) 
	     {
	    	 if(rz[i].mark>50)
	    	 {
	    		 rz[i].output_data();
	    	 }
	     }
	     

}
}
