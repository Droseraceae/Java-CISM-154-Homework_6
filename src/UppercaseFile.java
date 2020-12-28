import java.io.PrintWriter;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 * Create a program that reads in the supplied file (TheRoadNotTaken.txt) and
 * converts each line to all uppercase, and writes each new uppercase line to a
 * new file named Uppercase.txt
 * 
 * 
 * @author Josh Alcoba
 */
public class UppercaseFile {

	public static void main(String[] args) throws IOException {
		
		Scanner fileReader = new Scanner(new File("InputLog.txt"));
		PrintWriter outputFile = new PrintWriter(new File("Uppercase.txt"));

		while (fileReader.hasNextLine())
			outputFile.println(fileReader.nextLine().toUpperCase());

		outputFile.close();
		fileReader.close();

	}

}
