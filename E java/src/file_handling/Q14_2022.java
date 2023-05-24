package file_handling;
import java.io.*;
public class Q14_2022 {

	public static void main(String[] args) {
		try {
		FileReader rs=new FileReader("E:\\file\\abc.txt");
		BufferedReader rz=new BufferedReader(rs);
		String sr=null;
		int count=0;
		while((sr=rz.readLine())!=null)
		{
			if(sr.contains("BIM"))
			{
				count++;	
			}
		}
		System.out.println(count);
		
		}
		catch(IOException e)
		{
			System.out.println(e);
		}
	}

}
