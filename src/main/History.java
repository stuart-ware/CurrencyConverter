package main;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalTime;

import stringmanipulation.JSONManipulation;

public class History 
{
	public void writeHistory(String cur1, String cur2, double amount) throws IOException
	{	
		JSONManipulation json = new JSONManipulation();
		FileWriter fw = new FileWriter("history.txt", true);
		LocalDate date = LocalDate.now();
		LocalTime time = LocalTime.now();
		fw.write(" --- \n" + date + "\t" + time + "\n" 
				+ json.prettyConvertApi(cur1, cur2, amount)
				+ "--- \n");
		fw.close();
		return;
	}
	
	public void readHistory() throws IOException 
	{
		try (FileReader rd = new FileReader("history.txt")) 
		{	
			System.out.println("History");
			int data;
			while ((data = rd.read()) != -1)
			{
				System.out.print((char)data);
			}
			System.out.println();
		}
		catch (IOException e)
		{
			System.out.println("File error: " + e.getMessage());
		}
		
		
	}
}
