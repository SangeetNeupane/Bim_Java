package past_question_part2;
import java.io.*;
public class Q2021 {

	public static void main(String[] args) {
		try {
		FileReader rs=new FileReader("E://file//tu.txt");
		BufferedReader sr=new BufferedReader(rs);
		String sanu=null;
		int count=0;
		while((sanu=sr.readLine())!= null)
		{
			System.out.println(sanu);
			count++;
			
		}
			System.out.println(count);
			sr.close();
		}
		catch (IOException e)
		{
			System.out.println(e);
		}
		
	}

}
