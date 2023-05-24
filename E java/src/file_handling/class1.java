package file_handling;
import java.io.*;
import java.util.Scanner;
class class1{
public static void main(String arg[])throws IOException
{
	try{
		FileWriter f = new FileWriter("E:\\file\\Reeza.txt");
		BufferedWriter b = new BufferedWriter(f);
		String name, address, college;
		System.out.println("Enter the data:-");
		Scanner s = new Scanner(System.in);
		name=s.nextLine();
		address=s.nextLine();
		college=s.nextLine();
		b.write(name);
		b.write(address);
		b.write(college);
		b.close();
	}
	catch(IOException e){
		System.out.println(e);
	}
	
	try{
	FileReader rz=new FileReader("E:\\file\\Reeza.txt");
	FileWriter rs = new FileWriter("E:\\file\\haddi.txt");
	BufferedReader b = new BufferedReader(rz);
	BufferedWriter c = new BufferedWriter(rs);
	String reezu=null;
	while((reezu=b.readLine())!= null)
	{
			c.write(reezu);
			System.out.print(reezu);
		}
	
	
	b.close();
	c.close();
	}
	catch(IOException e)
	{
		System.out.println("Error  .");
	}
	}
	}

