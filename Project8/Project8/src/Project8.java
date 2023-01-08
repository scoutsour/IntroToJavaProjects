import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.File;

public class Project8
{

	/** Draw a simple histogram of data that are contained in a file. The histogram will be drawn by finding the smallest and largest
	 * values in the data. The range of data will then be divided into three equal pieces. The number of data in each range will
	 * be counted. A simple histogram of the data will then be drawn.
	 * 
	 * @param args There are no command line arguments.
	 * @throws FileNotFoundException If the data file that the user enters is not located in the Project main directory.
	 * 
	 * @author Deborah A. Trytten
	 * @version 1.0
	 */
	public static void main(String[] args) throws FileNotFoundException
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter a file name");
		
		String fileName = keyboard.nextLine();
		
		double smallest = findSmallest(fileName);
		double largest = findLargest(fileName);
		double middleSmall = (largest - smallest) / 3 + smallest;
		double middleBig = (largest - smallest) * 2/3 + smallest;
		int rangeSmall = countDataInRange(fileName,smallest,middleSmall);
		int rangeMiddle = countDataInRange (fileName,middleSmall,middleBig);
		int rangeLarge = countDataInRange(fileName,middleBig,largest);
		
		
		
		


	}
	
	/** Find the smallest double value stored in the file with the given file name.
	 * 
	 * @param fileName The name of the file that contains the data.
	 * @return The smallest double value found in the file. If the file does not contain any data, Double.MAX_VALUE will be returned.
	 * @throws FileNotFoundException If the file is not located in the main project directory.
	 */
	public static double findSmallest(String fileName) throws FileNotFoundException
	{
		
		Scanner file = new Scanner(new File(fileName));
		double result = Double.MAX_VALUE;
		while(file.hasNextDouble())
		{
			double value = file.nextDouble();
			if(value < result)
			{
				result = value;
			}
		
		}
		
		
		
		file.close();
		
		return result;  // This is a stub
		
	}
	
	/** Find the largest double value stored in the file with the given file name.
	 * 
	 * @param fileName The name of the file that contains the data.
	 * @return The largest double value found in the file. If the file does not contain any data, Double.MIN_VALUE will be returned.
	 * @throws FileNotFoundException If the file is not located in the main project directory.
	 */
	public static double findLargest(String fileName) throws FileNotFoundException
	{
		Scanner file = new Scanner(new File(fileName));
		double result = Double.MIN_VALUE;
		while(file.hasNextDouble())
		{
			double value = file.nextDouble();
			if(value > result)
			{
				result = value;
			}
		
		}
		
		// This is a stub
		file.close();
		return result;
	}
	
	/** Draw a simple histogram with the given title, followed by three lines that will contain
	 * the number of asterisks given in small, medium and large.
	 * @param title The title of the histogram.
	 * @param small The number of values in the small category.
	 * @param medium The number of values in the medium category.
	 * @param large The number of values in the large category.
	 * @return A String containing the histogram (including newline characters to separate the title and lines, and ending with a newline).
	 */
	public static String drawHistogram(String title, int small, int medium, int large)
	{
		
		
		
		
		return null; // A stub
	}
	
	/** Count the number of data values in the given range that that are contained in the file with the given
	 * name.
	 * @param fileName The name of the file of doubles.
	 * @param low The smallest value that should be counted (inclusive).
	 * @param high The largest value that should be counted (exclusive).
	 * @return The number of values in the data file that are between low (inclusive) and high (exclusive).
	 * @throws FileNotFoundException If the file with the given name is not stored in the main project directory.
	 */
	public static int countDataInRange(String fileName, double low, double high) throws FileNotFoundException
	{	
		int count = 0;
		Scanner file = new Scanner(new File(fileName));
		while(file.hasNextDouble())
		{
			double value = file.nextDouble();
			if(value >= low && value < high)
			{
				
				count++;
			}
			
		}
		
	file.close();
		return count;  
	}

	/** Draw one line of a histogram with a given number of asterisks.
	 * 
	 * @param count The number of asterisks to put on the line. Do not end with a newline character.
	 * @return A String containing count asterisks.
	 */
	public static String drawHistogramLine(int count)
	{
		String line = "";
		for(int i = 0; i < count; i++)
		{
			line = line + "*";
		}
		
		return line; // A stub
	}	
}
