package file_handling;
import java.io.*;
public class write_name_by_char {

	public static void main(String[] args) {
		try {
			FileWriter rz =new FileWriter("E://file//me.txt");
			String name="Sangeet Neupane\n";
			String College="Birgunj Public College";
			char a[]=name.toCharArray();
			char b[]=College.toCharArray();
			rz.write(a);
			rz.write(b);
			rz.close();
			System.out.println("Write Successfully.");
		}
		catch(IOException rk)
		{
			System.out.println(rk);
		}
	}

}
