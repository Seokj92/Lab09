package edu.handong.csee.java.lab09; //package name

import java.util.ArrayList;
import java.util.Scanner; //importing a package, java.util.Scanner

/**
 * This is a class to get data from user, and print out the result of the salesreport.
 * This class has double, int, variable and array.
 * This class has salesReporter(), get_Data(), calculateAverage(), highestSales(), printoutresult() and main method.
 * @author JS
 *
 */

public class SalesReporter {
	
	private double highestSales; //declare a double variable
	private double averageSales; //declare a double variable
	private ArrayList<SalesAssociate> list = new ArrayList<SalesAssociate>(); //declare arraylist.
	public int numOfSalesman; //declare int variable.
	
	/**
	 * This is a method to get the number of sales associate from user.	 *
	 */
	
	public SalesReporter() {
		
		System.out.println("Enter number of sales associates"); //print out the string.
		Scanner sc = new Scanner(System.in); //make the Scanner instance to get the number from keyboard.
		
		numOfSalesman = sc.nextInt(); //get the number of sales associates from keyboard
		
	}
		
	/**
	 * This is a main method.
	 * This method is to get data, calculate the average, rank of salesman and print out the result. 
	 * @param args unused
	 */
	public static void main(String[] args) {
		
		SalesReporter myReporter = new SalesReporter(); //instantiate SalesReporter class.
		myReporter.get_Data(); //call a method to get data
		myReporter.calculateAverage(); //call a method to calculate average
		myReporter.highestSales(); //call a method to know who highestSales person is
		myReporter.printoutResult(); //call a method to print out the result.
	}
	
	/**
	 * This is a method to get data from user.
	 */

	public void get_Data() {
		
		boolean done = false; //declare boolean variable.
		
		while(!done) { //when done returns false, run below sentence
			
			Scanner myScanner = new Scanner(System.in); //make the Scanner instance to get the number from keyboard.
			
						
			System.out.print("Enter name of sales associate : " ); // print out the string.
			String name = myScanner.nextLine(); //get the name from user(Keyboard).
			System.out.print("Enter associate's sales : $"); //print out the string.
			double sales = myScanner.nextDouble(); //get the sales from user(Keyboard).
			
			SalesAssociate mySalesman = new SalesAssociate(); //instantiate SalesAssociate class
			mySalesman.set_name(name); //call the instance and set the name.
			mySalesman.set_Sales(sales); //call the instance and set the sales.
			list.add(mySalesman); //add mySalesman to the list.
			

			System.out.println("more item for the list?(enter Yes if you want)"); //print out the string.
			String enter = myScanner.nextLine(); // '\w' react with nextline(), so this sentence is needed.						
			String ans = myScanner.nextLine();//get the answer from user
			if (!ans.equalsIgnoreCase("Yes"))
				done = true; //if input is not Yes or yes(do not care about whether word is upper case or not), exit this loop.
		}
		
		
			
			
	}
	
	/**
	 * This is a method to calculate the average of sales.
	 */

	public void calculateAverage() {
		
		double sum = 0; //initialize the value of sum
		int listLength = list.size(); //declare int variable
		
		for(SalesAssociate member : list) { //run the loop as many times as number of salesman.
			
			double i = member.get_Sales(); //get the sales from arraylist
			sum = sum + i; // add all of the sales.
		}
	averageSales = sum/listLength; //calculate the average of sales.
	
	}
	
	/**
	 * This is a method to know who the highestSales person is.		
	 */
	

	public void highestSales() {
		
		double num = 0; //declare double variable.
	
		for(SalesAssociate member : list) { //compare each other. run the loop as many times as number of salesman.
			
			if(member.get_Sales() > num) { //compare the two sales.
				
				num = member.get_Sales(); //get the highestsales person.
				
				
			}
		}
		highestSales = num;	// initiate highestSales with num.
	}
	
	/**
	 * This is a method to print out the result of this program.
	 */

	public void printoutResult() {
		
		System.out.println("Average sales per associate is : " + "$" + averageSales); //print out the string.
		System.out.println("The Highest sales figure is : $" + highestSales + "\n"); //print out the string.
		
		System.out.println("The following had the highest sales :"); //print out the string
		
		for(SalesAssociate member : list) { //run this loop as many times as number of salesman.
			if(member.get_Sales() == highestSales) { //when the person is highestsales person print out below sentences.
				System.out.println("Name : " +member.get_Name()); //print out the name
				System.out.println("Sales : $" + member.get_Sales()); //print out the sales
				System.out.println("$" + (highestSales-averageSales)+" above the average \n"); //print out the difference between highestsales and average.
			}
		}
		
		
		System.out.println("The rest performed as follows :"); //print out the string.
		for(SalesAssociate member : list) { // run this loop as many times as number of salesman.
			if(member.get_Sales() < highestSales) { //when the person is not highestsales peroson, print out below sentences.
				System.out.println("Name : " +member.get_Name()); //print out the name
				System.out.println("Sales : $" + member.get_Sales()); //print out the sales
				
				if(member.get_Sales() > averageSales) { //when person's sales is bigger than average. print out below sentence.
					System.out.println("$" + (member.get_Sales()-averageSales) + " above the average.\n"); //print out the difference between sales and average.
				}
				
				else //when person's sales is smaller than average. print out below sentence
					System.out.println("$" + (averageSales-member.get_Sales()) + " below the average."); ///print out the difference between sale and average.		
	}
	
		}
	}
	
}
