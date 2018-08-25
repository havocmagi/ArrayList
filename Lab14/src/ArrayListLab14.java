/**
Author:Trushan Patel
Date:12/3/15
Program Name:ArrayListLab14
Course:CS 1043
Lab Section:01
Assignment Lab Number:14
 */
import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;

public class ArrayListLab14 
{
	public static void main(String[] args) 
	{
		// 1. Instantiate an ArrayList to hold the wrapper class used for
		// integers.
		ArrayList<Integer> list=new ArrayList<Integer>();
		// 2. Check the length of the args array. If the array is of length
		// zero, exit with a Usage message. Otherwise, assign a String variable to
		// args[0]. This is your file name passed from the command line.
		if(args.length==0)
		{
			System.out.println("Error");
			return;
		}
	            String a=args[0];
		try 
		{ 
			// 2. Open the data file.
			File in = new File(a);
			// 3. Instatniate an object with the Scanner class. This will be
			// used to extract the values from the input file.
			Scanner extract = new Scanner(in);
			// 4. Read the first data value
			int b=extract.nextInt();
			// 5. "add" (insert) the first data value into the ArrayList.
			list.add(b);
			// 6. Write a nested loop to read data and insert the remaining
			// data values into the ArrayList in ascending order:
			while(extract.hasNextInt())
			{
				b=extract.nextInt();
				for(int i=0;i<list.size();i++)
				{
						if(list.get(i)>b)
						{
							list.add(i,b);
							break;
						}
						if(i==list.size()-1)
						{
							list.add(b);
							break;
						}
				}
			}
			
			} 
		catch (IOException err)
		{
			System.err.printf("File error: %s\n", "err");
			System.exit(2);
		} // end IOException handler
			// 8. Display the ArrayList contents using an enhanced-for loop.
		for(int val:list)
		{
			System.out.print(val+" ");
		}
	} // end main
} // end ArrayListLab14 class