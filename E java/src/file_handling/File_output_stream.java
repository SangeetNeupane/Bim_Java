package file_handling;
import java.io.*;
public class File_output_stream {

	public static void main(String[] args) {
		try {
			FileOutputStream rz =new FileOutputStream("E://file//me.txt");
			String a="Reezu is Cutest\n";
			String b="Suruchi is like as haddi";
			byte aa[]=a.getBytes();
			byte bb[]=b.getBytes();
			
			rz.write(aa);
			rz.write(bb);
			System.out.println(" write Successfully.");
			rz.close();
		}
		
		catch(IOException rk)
		{
			System.out.println(rk);
		}
		
	}

	}





