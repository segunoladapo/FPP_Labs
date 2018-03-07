package fpp;


import fpp.lab3.StoreDirectory;

import java.util.Scanner;



public class Driver {
	Scanner sc = new Scanner(System.in);
	String userID;
	StoreDirectory directory;
	final String CONTINUE = "Review more options? (Y/N)";
	String n = System.getProperty("line.separator");
	public static void main(String[] args){
		new Driver();
		
		
	}
	private String continueQuestion() {
		System.out.println(CONTINUE);
		return sc.nextLine();
		
	}
	Driver(){
		
		System.out.println("What is your Id? (An Id is a 3-digit code, like 009.)");
		String userId = sc.nextLine();
		storeId(userId);
		String n = System.getProperty("line.separator");
		String inputString = "Y";
		String outputString = null;
		displayOptions();
		while(!inputString.equalsIgnoreCase("N")){
			inputString = sc.nextLine();
			
			if(inputString.equalsIgnoreCase("A")){
				
				displayNumberOfBooks();
				
			}
			else if(inputString.equalsIgnoreCase("B")){
				
				displayNumberOfEmployees();
				
			}
			else if(inputString.equalsIgnoreCase("C")){
				outputString = "In Input Area, type in the employee number using this format:"+n+
							   "   add employee xxx"+n+
							   "where 'xxx' is the 3-digit code for the employee number.";
				System.out.println(outputString);
				
			}
			else if(inputString.equalsIgnoreCase("D")){
				
				outputString = "In Input Area, type in the book id number using this format:"+n+
				   "   book xxx"+n+
				   "where 'xxx' is the 3-digit code for the employee number.";
				System.out.println(outputString);				
				
			}
			else if(inputString.equalsIgnoreCase("E")){
				
				outputString = "In Input Area, type in the book number using this format:"+n+
				   "   add book xxx"+n+
				   "where 'xxx' is the 3-digit code for the book number.";
				System.out.println(outputString);				
				
			}
			else if(inputString.equalsIgnoreCase("F")){
				displayNumberOfCDsInBookstore();				
			}
			else if(inputString.equalsIgnoreCase("G")){

				outputString = "In Input Area, type in the cd number using this format:"+n+
				   "   add cd xxx"+n+
				   "where 'xxx' is the 3-digit code for the cd number.";
				System.out.println(outputString);						
				
			}
			else if(inputString.equalsIgnoreCase("H")){
				
				outputString = "In Input Area, type in the name of the food item using this format:"+n+
				   "   food nn..."+n+
				   "where 'nn...' represents the name of the food item (like bananas or cherries).";
				System.out.println(outputString);					
				
			}	
			else if(inputString.trim().startsWith("add employee")){  //add employee
				
				int len = "add employee".length();
				addEmployee(inputString.substring(len).trim());
			}
			else if(inputString.trim().startsWith("add book")){  //add book
				
				int len = "add book".length();
				
				addBook(inputString.substring(len).trim());
			}
			else if(inputString.trim().startsWith("add cd")){  //add cd
				int len = "add cd".length();
				addCD(Integer.valueOf(inputString.substring(len).trim()));
			}
			else if(inputString.trim().startsWith("book")){  //add cd
				int len = "book".length();
				checkIfBookIsInStock(inputString.substring(len).trim());
			}			
			else if(inputString.trim().startsWith("food")){  //add cd
				int len = "food".length();
				checkWhetherFoodItemInMarket(inputString.substring(len).trim());
			}	
			else if(inputString.trim().equalsIgnoreCase("Y")){
				displayOptions();
			}
			else if(inputString.trim().equalsIgnoreCase("N")){
				System.out.println("Have a nice day! Bye!");
				System.exit(0);
			}
			
			else {
				System.out.println(n+"I did not understand your response."+n);
				displayOptions();
			}
		
		    			
		}

	}
	void storeId(String userID){
		this.userID = userID;
		directory = new StoreDirectory(userID);
	}
	//this implementation has been done for you
	void displayNumberOfBooks() {
		int numbooks = directory.getNumberOfBooks();
		if(numbooks > -1){
			System.out.println("Number of books is: "+ numbooks +" (Look for other console messages.)"+n+CONTINUE);
		}
		
	}
	void displayNumberOfEmployees() {
		int count = directory.getNumberOfBookstoreEmployees();
		System.out.println("Number of employees is: " + count +" (Look for other console messages.)"+n+CONTINUE);
		
	}
	
	void addEmployee(String employeeId){
		directory.addNewEmployee(employeeId);
		System.out.println("Employee added unless a console message says otherwise " + n+CONTINUE);
		
	}
	void addBook(String bookId){
		directory.addNewBook(bookId);
		System.out.println("Book added unless a console message says otherwise " + n+CONTINUE);
				
	}	
	void addCD(int cdId){
		directory.addNewCD(cdId);
		System.out.println("CD added unless a console message says otherwise " + n+CONTINUE);
			
	}		
	void checkIfBookIsInStock(String bookId){
		boolean found = directory.bookIsInStock(bookId);
		if(found){
			System.out.println("Yes, book with bookId " + bookId + " is in stock."  + n + CONTINUE);
		}else {
			System.out.println("No, book with bookId " + bookId + " is not in stock." + " (Look for console messages.)" + n + CONTINUE);
		}
	}
	
	void displayNumberOfCDsInBookstore(){
		System.out.println("Number of CD's is " + directory.getNumCDsInBookstore()+" (Look for console messages.)"+n+CONTINUE);
	}
	void checkWhetherFoodItemInMarket(String foodItem){
		boolean found = directory.marketCarriesFoodItem(foodItem);
		if(found){
			System.out.println("Yes the market carries " + foodItem + n + CONTINUE);
		}else {
			System.out.println("No the market carries " + foodItem + n + CONTINUE);
		}
	}
	
	void displayOptions(){
		String n = System.getProperty("line.separator");
		String display = "TYPE A LETTER IN INPUT AREA TO MAKE A SELECTION"+n+n+
						 "A. Learn how many books are in bookstore."+n+
						 "B. Learn how many employees are in bookstore."+n+
						 "C. Add an employee to the bookstore."+n+
						 "D. See if a book is in stock in the bookstore."+n+
						 "E. Add a book to the bookstore."+n+
						 "F. Get number of CD's in the bookstore."+n+
						 "G. Add a new CD to the bookstore's stock."+n+
						 "H. See if the market carries a particular food item."+n+
						 "N. Exit the system.";
		System.out.println(display);
		
	}
	
	

}
