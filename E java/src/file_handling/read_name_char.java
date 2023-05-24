package file_handling;
import java.io.*;
public class read_name_char {

	public static void main(String[] args) {
		
		try {
		FileReader rz=new FileReader("E://file//me.txt");
		
		int i;
		while((i=rz.read())!= -1)
		{
			System.out.print((char)i);
		}
		rz.close();
		}
		catch (IOException rk)
		{
			System.out.println(rk);
		}
		
	}

}
