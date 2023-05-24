package file_handling;
import java.util.*;
import java.io.*;
public class Q13_2015 {

	public static void main(String[] args) {
		try {
		FileWriter rz=new FileWriter("E://file//Q13_2015.txt");
		BufferedWriter rk=new BufferedWriter(rz);
		String a;
		Scanner rs=new Scanner(System.in);
		System.out.println("Enter the line:-");
		a=rs.nextLine();
		rk.write(a);
		rk.close();
		}
		catch(IOException e)
		{
			System.out.println(e);
		}
		try {
			FileReader r=new FileReader("E:\\file\\Q13_2015.txt");
			BufferedReader rk=new BufferedReader(r);
			String out=null;
			while((out=rk.readLine())!=null)
			{
				System.out.print(out);
			}
			rk.close();
		}
		catch(IOException e)
		{
			System.out.println(e);
		}
		
	}

}
