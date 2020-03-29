package Example1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Formatter;



public class Write_On_File 
{

	public static void main(String[] args) 
	{
		
		// ****************** We will create two new files on a new folder "WRITE" and then write into the file ******************************************* //
		
		// ********************* Creating Folder And Files ********************** //
		
		File folder = new File ("Write "); // this line showes the path where will be the folder created
		folder.mkdir();
		
		File file1 = new File ("Write/virus.txt ");
		File file2 = new File ("Write/bacteria.txt ");
		
		try
		{
			file1.createNewFile();
			file2.createNewFile();
			System.out.println(" Files are created ");
			
		}
		catch (Exception e) // FileNotFoundException e dile hobe na tokhon 27,28 line error show kore
		{
			System.out.println(" Files are not created  and exception is : " + e);
			
		}
		
		// ************************* Now we will write into the file virus.txt *********************************** //
		
		try
		
		{
			
			Formatter ob = new Formatter ("Write/virus.txt ");
			ob.format ("%s %s\r\n" , " 101 "," Corona ");
			ob.format ("%s %s\r\n" , " 102 "," AIDS ");
			ob.format ("%s %s\r\n" , " 103 "," Dengue ");
			
			ob.close();
			
		}
		
		catch (FileNotFoundException e)  //Exception.e dile hoy na 
		{
			
			System.out.println(" Exception is :  " +e);
		}
		
		
		// ******************* Now we will write into the file bacteria.txt **************************** //
		
		
        try
		
		{
			
			Formatter ob1 = new Formatter ("Write/bacteria.txt ");
			
			ob1.format ("%s %s\r\n" , " 001 "," Acetobacter aurantius ");
			ob1.format ("%s %s\r\n" , " 002 "," Bacillus cereus");
			ob1.format ("%s %s\r\n" , " 003 "," Clostridium tetani");
			
			ob1.close();
			
		}
		
		catch (FileNotFoundException e)  //Exception.e dile hoy na 
		{
			
			System.out.println(" Exception is :  " +e);
		}
		
		
	}

}
