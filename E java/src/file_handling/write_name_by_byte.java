package file_handling;

import java.io.*;
public class write_name_by_byte {

	public static void main(String[] args) {
		try {
			FileInputStream rz =new FileInputStream("E://file//me.txt");
			
			int i;
			while((i=rz.read())!=-1 )
			{
				System.out.print((char)i);
			}
			
			System.out.println("  Read Successfully.");
			rz.close();
		}
		
		catch(IOException rk)
		{
			System.out.println(rk);
		}
		
	}

}
