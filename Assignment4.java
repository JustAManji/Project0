/*
// AUTHOR: Manji Hui
// FILENAME: Assignment4
// SPECIFICATION: takes in integers till the user inputs -1, returns if the number is prime or not, and returns some computations of the numbers inputed
// FOR: CS 1400 - ASSIGNMENT #4
// TIME SPENT: 1 hour
//*/

import java.util.Scanner; // importing the scanner class
public class Assignment4 { // start of class

	public static void main(String[] args) { // start of main method
		
		Scanner input = new Scanner(System.in); // creating a scanner object
		
		int sent = 0; // initializing a sentinel
		int max = 0; // initializing a maximum
		int min = 1000000000; // initializing a minimum
		int sum = 0; // initializing a sum
		double count = 0.0; // initializing a count
		
		while(sent != -1) // runs loop until the sentinel value is negative 1
		{
			System.out.println("Enter a positive integer. Enter -1 to quit."); // prompting the user to input 
			int userInput = input.nextInt(); // takes in the input
			
			boolean isPrime = true; // declares a boolean isPrime as true
			
			if (userInput != -1) // checks if user input is negative 1
			{	
				if(userInput > max) // checks if user input is lager than current maximum
					max = userInput; // updates the maximum to be the user input
				
				if(min > userInput) // checks if user input is smaller than current minimum
					min = userInput; // updates the minimum to be the user input
				
				sum = sum + userInput; // adds the user input to the sum
				
				count++; // increments count by 1
				
				for(int j = 2; j < userInput; j++)
				{
					if(userInput % j == 0) // checks if user input is divisible by anything between 2 and userInput-1
					{
						isPrime = false; // updates isPrime to false
						j = userInput; // updates j to the value of user input to escape the for loop
					}
				}
				
				if(isPrime == true)
					System.out.println("The number " + userInput + " is a prime number."); // prints the number inputed was prime 
				else
					System.out.println("The number " + userInput + " is not a prime number."); // prints the number inputed was not prime
			}
			
			else
				sent--; // decrementing the sentinel value by 1, ending the while loop
		}
		if(min >= 1000000000) // if the user enters -1 first, min is set to 0
			min = 0;
		
		System.out.println("The maximum positive number is: " + max); // prints out the maximum
		
		System.out.println("The minimum positive number is: " + min); // prints out the minimum
		
		System.out.println("The sum is: " + sum); // prints out the sum
		
		System.out.println("The count of number(s) is: " + (int) count); // prints out the count
		
		if(count > 0)
			System.out.println("The average is: " + (sum/count)); // prints out the average
		else
			System.out.println("The average is: N/A"); // it the user enters -1 first, the average  is N/A
	} // end of main method 
} // end of class
