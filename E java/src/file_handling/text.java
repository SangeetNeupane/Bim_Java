package file_handling;

import java.io.*; 
public class text
	{
		public static void main(String args[]) 
			{
			try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				String str[] = new String[4];
				System.out.println("Enter lines of text & enter 'stop' to quit."); 

				for(int i=0; i<4; i++)
				{
					if(str[i].equals("stop"))
						break;
					str[i] = br.readLine(); 
					
				}
				System.out.println("\nHere is your file:");	// display the lines for(int i=0; i<4; i++)
				for(int i=0; i<4; i++)
				{
					
				System.out.println(str[i]);
				if(str[i].equals("stop"))
					break;
				}
			}
			catch(IOException rz)
			{
				System.out.println(rz);			}

					
}
}


