import java.io.PrintWriter;
import java.io.IOException;
import java.io.File;
import java.util.Scanner;

/**
 * Create a program that allows the user to enter lines of text.
 * Write each line to a new file named "InputLog.txt".
 * When the user enters "exit", close the file and end the program.
 * 
 * @author Josh Alcoba
 */
public class TextLog {
	public static void main(String[] args) throws IOException  { 
		
		PrintWriter outputFile = new PrintWriter(new File("InputLog.txt"));
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("This program records lines of text and outputs a log of your entries. "
				+ "\nEnter text: ");
		String newLine = keyboard.nextLine();
		
		while(!newLine.equalsIgnoreCase("quit")){
            outputFile.println(newLine);
		    System.out.print("Enter 'quit' to exit program. Otherwise enter text: ");
		    newLine = keyboard.nextLine();
            if(newLine.equalsIgnoreCase("quit")) {
                outputFile.close();
                break;
            }
        }
		
		keyboard.close();
		System.exit(0);
		
		
		
		/*** SAMPLE INPUT/OUTPUT ***
		 * 
		 * Enter text: This all
		 * Enter text: will be saved
		 * Enter text: to a log file
		 * Enter text: that this program is writing to.
		 * Enter text: exit
		 * 
		 * 
		 * The contents of InputLog.txt would then contain:
		 * 
		 * This all
		 * will be saved
		 * to a log file
		 * that this program is writing to.
		 */

	}

}
