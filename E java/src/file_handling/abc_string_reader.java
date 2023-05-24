package file_handling;

import java.io.*;
public class abc_string_reader
	{
	public static void main(String args[]) throws IOException
		{
	// create a BufferedReader using System.in
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String sanu;
		System.out.println("Enter lines of text.... 'Quit' will terminate the Program"); 
		
		do{
			sanu = br.readLine(); 
			System.out.println(sanu);
			} while(!sanu.equals("Quit"));

		}
	}


