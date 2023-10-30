package sep26;
import java.io.PrintWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Scanner;
import java.io.File;

public class demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String outFile = "files/outFile.txt";
		PrintWriter outputStream = null;
		
		try
		{
			outputStream = new PrintWriter(new FileOutputStream(outFile, true));
		}
		catch (FileNotFoundException e)
		{
			System.out.println("Cannot open the output file");
			System.exit(0);
		}
		
		// Start to read from input files
		for(int i = 0; i < args.length; i++)
		{
			int lineNumber = 1;
			Scanner input = null;
			try
			{
				input = new Scanner(new File("files/file1.txt"));
			}
			catch(FileNotFoundException e)
			{
				System.out.println("Cannot open the file " + args[i]);
				System.out.println("Countinue with the next file...");
				continue;
			}
			
			
			// really start to read
			while(input.hasNextLine())
			{
				String aLine = input.nextLine();
				outputStream.println(lineNumber + " " + aLine);
				lineNumber++;
			}
			input.close();
		}
		outputStream.close();
	}

}
