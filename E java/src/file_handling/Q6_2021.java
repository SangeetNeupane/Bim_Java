package file_handling;
import java.io.*;
public class Q6_2021 {
	public static void main(String args[])
	{
	try{
	FileOutputStream rz=new FileOutputStream("E://file//tu.txt"); 
	String tu="Tribhuvan University";
	//converting string into byte array 
	byte b_tu[]=tu.getBytes();
	rz.write(b_tu);
	rz.close();
	}
	catch(Exception e)
	{
	System.out.println(e);
	}

	//to read and display content of file
	try
	{
	FileInputStream rk=new FileInputStream("E://file//tu.txt");
	int i=0;
	while((i=rk.read())!=-1)
	{
	System.out.print((char)i);
	}
	rk.close();
	}
	catch(Exception e)
	{
	System.out.println(e);
	}
	}
	}



