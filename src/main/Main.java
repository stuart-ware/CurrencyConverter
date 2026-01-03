package main;


import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) throws IOException {
		
		Scanner scn = new Scanner(System.in);
		Methods methods = new Methods();
		History history = new History();
		
		while (true)
		{
			System.out.println(" ======= #AluraLatam ======= ");
			System.out.print("""
					Currency Converter v0.0.1
					1) USD to DOP
					2) DOP to USD
					3) USD to EUR
					4) EUR to USD
					5) Other currencies
					6) Currency List
					7) Exit
					8) About
					9) History
		
					Option:\t """);
			
			try {
				int option = scn.nextInt();
				
				switch (option)
				{
					case 1:
					case 2:
					case 3:
					case 4:
						System.out.println(methods.userRequestCurrency(option));
						break;
					case 5:
						System.out.println(methods.userRequestCurrency());
						break;
					case 6:
						System.out.println(methods.printCurrencies());
						continue;
					case 7:
						System.out.println("Thanks!");
						return;
					case 8:
						methods.printAbout();
						break;
					case 9:
						history.readHistory();
						break;
					default:
						System.out.println("Error, try again");
						break;
				}
			}
			catch (InputMismatchException e)
			{
				System.out.println("Try to type a number: " + e.getMessage());
				break;
			}
			
			
		}
		scn.close();
	}

}
