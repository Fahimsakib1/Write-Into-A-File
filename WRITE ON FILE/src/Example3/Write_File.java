package Example3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Formatter;
import java.util.Scanner;

public class Write_File 
{

	public static void main(String[] args) throws IOException 
	{

		
		
		
		File Newfolder = new File(" FAHIM "); // this line showes the path where will be the folder created
		Newfolder.mkdir(); // create the folder FAHIM

		File f1 = new File(" FAHIM/student.txt ");

		try {

			f1.createNewFile();
			
			System.out.println(" Files are created ");

		}

		catch (FileNotFoundException e) // FileNotFoundException e dile hobe na tokhon 28,29 line error show kore
		{
			System.out.println(" Files are not created  and exception is : " + e);

		}
		
		
		String id,Name;

		try

		{

			Formatter ob = new Formatter(" FAHIM/student.txt ");

			Scanner item = new Scanner(System.in);
			System.out.print(" Number Of Student is : "); // input the number of player
			int number = item.nextInt();

			for (int i = 1; i <= number; i++) 
			{
				System.out.print(" StudentsID And  Name : ");
				id = item.next();
				Name = item.next();
				ob.format(" %s %s\r\n ", id, Name);

			}
			
			ob.close();
			System.out.println(" End Of Student List");

		}

		catch (FileNotFoundException e) // Exception.e dile hoy na
		{

			System.out.println(" Exception is :  " + e);
		}
      
		
		

	}

}
