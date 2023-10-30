package sep21;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.File;
import java.io.PrintWriter;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
//import java.io.FileNotFoundException;
/**
 * @author Luis Sanjuan-Cruz
 */
public class Demo9_21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String inputFile1 = "file1.txt";
		String inputFile2 = "file2.txt";
		String inputFile3 = "file3.txt";
		Scanner myobj = new Scanner(System.in);
		System.out.println("What name do you want to name this file (Add .txt at the end)");
		String fileName = myobj.nextLine();
		PrintWriter outputStream = null;
		
		try
		{
			outputStream = new PrintWriter(fileName);
		}
		
		catch(IOException e)
		{
			System.out.println("Error File Handling");
			
		}
		
		
		makefile(fileName,inputFile1, 1);
		makefile(fileName,inputFile2, 2);
		makefile(fileName,inputFile3, 3);
		
		outputStream.close();
		myobj.close();
	}
		
		/**
		 * Copies from one file into another
		 * @param newFile
		 * @param InputFile
		 * @param num
		 */
		
		public static void makefile(String newFile, String InputFile, int num)
		{
		
		try(BufferedReader reader = new BufferedReader(new FileReader(InputFile)))
		{
			String line;
			
			Scanner scanner = new Scanner(new FileReader(InputFile));
			//while (line = reader.readLine != null)
			{
				line = scanner.nextLine();
			//	writer.write(num + ": " + line);
		//		writer.File.newLine();
			}
			
		}
		
		catch(IOException e)
		{
			System.out.println("Error File Handling");
			
		}
		
		
		
	}
	
}
