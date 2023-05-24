package haddi;
import java.io.*;
import java.util.*;
public class Example_file {
	public static void main(String[] args)
	{
	try
	{ 
	FileWriter bv=new FileWriter("haddi.txt");
	BufferedWriter bd=new BufferedWriter(bv);
	String name;
     String age;
	String address;
	System.out.println("enter the data");
	Scanner rz=new Scanner(System.in);
	Scanner kj=new Scanner(System.in);
	name=rz.nextLine();
	age=rz.nextLine();
	address=rz.nextLine();
	bd.write(name);
	bd.write(age);
	bd.write(address);
	bd.close();
	}
	catch(IOException e)
	{
		System.out.println(e);
	}
	try
	{
		FileReader rk=new FileReader("haddi.txt");
		BufferedReader sr=new BufferedReader(rk);
		FileWriter rs=new FileWriter("reezu.txt");
		BufferedWriter b=new BufferedWriter(rs);
		String c= null;
		while((c=sr.readLine())!=null)
				{
			rs.write(c);
			System.out.println(c);
				}
		sr.close();
		rs.close();
	
	}
	
	catch(IOException e)
	{
		System.out.println(e);
	}
	
}
}


	


