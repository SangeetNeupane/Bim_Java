package file_handling;
import java .util.*;
import java.io.*;
public class read_char {

	public static void main(String[] args) throws IOException
	{
		try {
		char a;
		BufferedReader rz=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the Character");
		while((a=(char)rz.read())!='q')
		{
			System.out.println(a);
		}
		rz.close();
		}
		catch(IOException rk)
		{
			System.out.println(rk);
		}
	}

}
