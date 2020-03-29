package Example2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.Scanner;

public class Write_On_File_Input_By_User {

	public static void main(String[] args) {

		//String JurseyNumber, PlayerName;

		// ****************** We will create two new files on a new folder " Cricket "
		// and then write into the file ******************************************* //

		// ********************* Creating Folder And Files ********************** //
		
		

		File folder1 = new File(" Cricket "); // this line showes the path where will be the folder created
		folder1.mkdir(); // cretae the folder Cricket

		File file3 = new File("Cricket/Bangladesh.txt ");
		File file4 = new File("Cricket/India.txt ");

		try 
		{
			
			file3.createNewFile();
			file4.createNewFile();
			System.out.println(" Files are created ");

		} 
		
		catch (Exception e) // FileNotFoundException e dile hobe na tokhon 28,29 line error show kore
		{
			System.out.println(" Files are not created  and exception is : " + e);

		}

		// ************************* Now we will write into the file virus.txt
		// *********************************** //

		String JurseyNumber,PlayerName;

		try

		{

			Formatter ob = new Formatter(" Cricket/Bangladesh.txt ");

			Scanner item = new Scanner(System.in);
			System.out.print(" Number Of bangladeshi Player is : "); // input the number of player
			int number = item.nextInt();

			for (int i = 1; i <= number; i++) 
			{
				System.out.print(" Enter Bangladeshi Player's  Jursey Number And  Name : ");
				JurseyNumber = item.next();
				PlayerName = item.next();
				ob.format(" %s %s\r\n ", JurseyNumber, PlayerName);

			}
			
			ob.close();
			System.out.println(" End Of Bangladeshi Player List");

		}

		catch (FileNotFoundException e) // Exception.e dile hoy na
		{

			System.out.println(" Exception is :  " + e);
		}

		// ******************* Now we will write into the file India.txt
		// **************************** //

		try

		{

			Formatter ob = new Formatter(" Cricket/India.txt ");

			Scanner item = new Scanner(System.in);
			System.out.print(" Number Of Indian Player is : "); // input the number of player
			int number = item.nextInt();

			for (int i = 1; i <= number; i++) {
				System.out.print(" Enter Indian  Player's  Jursey Number And  Name : ");
				JurseyNumber = item.next();
				PlayerName = item.next();
				ob.format("%s %s\r\n", JurseyNumber, PlayerName);

			}
			// System.out.println(" End Of Player List");
			ob.close();
			System.out.println(" End Of Indian Player List");

		}

		catch (FileNotFoundException e) // Exception.e dileo hobe
		{

			System.out.println(" Exception is :  " + e);
		}

	}

}
