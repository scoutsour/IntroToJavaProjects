import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Project9
{
	public static void main(String[] args) throws FileNotFoundException
	{
Scanner keyboard = new Scanner(System.in);
System.out.println("Please enter a file name");
String filename = keyboard.nextLine();
		
String array[] = readFile(filename);
	
	lowercase(array);
	
	String mostPopularMovie = findMostFrequent(array);
	System.out.println("Most popular movie: " + mostPopularMovie);
	
	}

	
	
	public static String[] readFile(String filename) throws FileNotFoundException
	{
		
		Scanner keyboard = new Scanner(new File(filename));
		int count = 0;
		
		while(keyboard.hasNextLine()) 
		{keyboard.nextLine();
		count = count + 1;
		
		}
		keyboard.close();
		
		String[] array = new String[count];
		keyboard = new Scanner(new File(filename));

		for(int i = 0; i < array.length && keyboard.hasNextLine(); i ++)
		{
			array[i] = keyboard.nextLine();
		}
		
		keyboard.close();
		
		return array;
		
	}

	public static void lowercase(String[] array)
	{

		for(int i = 0; i < array.length; i ++)
		{
			array[i] = array[i].toLowerCase();
		}
	}

	public static String findMostFrequent(String[] array)
	{
		Arrays.sort(array);
		
		int count = 1;
		int maxCount = 0;
		String movieName = array[0];
		String mostPopular = movieName;
		
		for(int i = 1; i< array.length; i++ )
		{
			if(movieName.equals(array[i]))
			{
				count = count+1;
				if(count > maxCount)
				{
					maxCount = count;
					mostPopular = movieName;
				}
			}
			else 
			{
				count = 1;
				movieName = array[i];
			}
		}
		
		return mostPopular;
	}
}