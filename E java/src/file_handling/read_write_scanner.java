package file_handling;
import java.io.*;
import java.util.*;
public class read_write_scanner {
	public static void main(String args[])
	{
	// to write content in file 
	try{
	FileOutputStream fout=new FileOutputStream("info.dat"); 
	Scanner rz =new Scanner(System.in);
	System.out.println("Enter the name of country and city:");
	String country=rz.nextLine();
	String city =rz.nextLine();
	byte bcountry[]=country.getBytes();
	//converting string into byte array 
	byte bcity[]=city.getBytes();
	fout.write(bcountry);
	fout.write(bcity);
	fout.close();
	}
	catch(Exception e)
	{
	System.out.println(e);
	}

//		to read and display content of file
	try
	{
	FileInputStream fin=new FileInputStream("info.dat");
	int i=0;
	while((i=fin.read())!=-1)
	{
	System.out.print((char)i);
	}
	fin.close();
	}
	catch(Exception e)
	{
	System.out.println(e);
	}
	}
	}



