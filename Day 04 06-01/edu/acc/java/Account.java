/* Write a new class called Account that contains the following instance variables:                               
    - name (account holder name)                                                                               
    - street                                                                                                   
     - city                                                                                                    
     - state (2 letters)                                                                                       
     - zip                                                                                                     
     - balance (integer)                                                                                       
     - maxOverdraft (integer)                                                                                  
                                                                                                               
                                                                                                               
 Write getters and setters for all instance variables.                                                         
 Write a default (no argument) constructor that sets default overdraft amount to $100 and balance to $500      
 Write another constructor that takes overdraft amount and balance and sets them                               
 Write another constructor that takes all instance values and sets them                                        
 Write a method called deposit(int amount) that takes cents and adds it to balance                             
 Write a method called withdraw() that takes cents amount and withdraws from account. Make sure                
   you don't overdraft the account past the limit.                                                             
 Write a main() that instantiates an Account object, tests all constructors and methods with output to console.
 */
 package edu.acc.java;
 class Account {
 	String name = "";
 	String street = "";
 	String city = "";
 	String state = "";
 	int zip = 0;
 	int balance = 0;  // Dollars and cents recorded without decimal
 	int maxOverdraft = 0; // Dollars and cents recorded without decimal
 	
 	public static void main (String[] args) {
 		Account customer1 = new Account(); // Just the default balance and limit
 		Account customer2 = new Account("Cuss Tomer Jr.", "750 Tron Ave", "Austin", "TX",
 		                                78701, 15000, 100000);  // $1,000.00 balance $150 limit
 		Account customer3 = new Account(7500, 75000);  // $750.00 balance, $75 limit
 		
 		customer1.setName("Cuss Tomer Sr.");
 		
 		customer3.setName("Cuss Tomer III");
 		customer3.setStreet("34567 Old Austin Hwy");
 		customer3.setCity("Bastrop");
 		customer3.setState("TX");
 		customer3.setZip(78555);
 		
 		System.out.println("\ncustomer1");
 		customer1.printAddress();
 		customer1.printFinancial(); 
 		
 		System.out.println("\ncustomer2");
 		customer2.printAddress();
 		customer2.printFinancial(); 
 		
 		System.out.println("\ncustomer3");
 		customer3.printAddress();
 		customer3.printFinancial(); 
 		
 		System.out.println("\ncustomer1");
 		customer1.deposit(2557); // deposit $25.57
 		customer1.printFinancial(); 
 		
 		System.out.println("\ncustomer2");
 		customer1.withdraw(2557); // withdraw $25.57
 		customer1.printFinancial(); 
 		
 		System.out.println("\ncustomer3");
 		customer1.withdraw(90000); // withdraw $900.00
 		customer1.printFinancial(); 
 		
 	} // End main
 	
//********** C O N S T R U C T O R S ****************// 	
 	/* "no argument" constructor */
 	public Account ( ) {
 		setMaxOverdraft(100 * 100); // $100 without decimal point
 		setBalance(500 * 100); // $500 without decimal point
 		
 	}  // End no arg constructor
 	
 	/* "overdraft & balance" constructor */
 	public Account (int overdraftIn, int balIn) {
 		setMaxOverdraft(overdraftIn); // without decimal point
 		setBalance(balIn); // without decimal point
 		
 	}  // End OD & bal constructor
 	
 	/* "all setter" constructor */
 	public Account (String nameIn, String streetIn, String cityIn,
 	 	String stateIn, int zipIn, int overdraftIn, int balIn) {
 	 	setName(nameIn); 
		setStreet(streetIn);
		setCity(cityIn); 
		setState(stateIn);
		setZip(zipIn);
 		setMaxOverdraft(overdraftIn); // without decimal point
 		setBalance(balIn); // without decimal point
 		
 	}  // End all setter constructor

//********** S E T T E R S ****************// 	
 	public void setName (String nameIn) {
 		name = nameIn; 
 		return;
 	} // End name setter
 	
 	public void setStreet (String streetIn) {
 		street = streetIn; 
 		return;
 	} // End street setter
 	
 	public void setCity (String cityIn) {
 		city = cityIn; 
 		return;
 	} // End city setter
 	
 	public void setState (String stateIn) {
 		state = stateIn; 
 		return;
 	} // End state setter
 	
 	public void setZip (int zipIn) {
 		zip = zipIn; 
 		return;
 	} // End zip setter
 	
 	public void setMaxOverdraft (int overdraftIn) {
 		maxOverdraft = overdraftIn; 
 		return;
 	} // End maxOverdraft setter
 	
 	public void setBalance (int balIn) {
 		balance = balIn; 
 		return;
 	} // End balance setter
 	
//********** G E T T E R S ****************// 	
 	public String getName ( ) {
 		return name;
 	} // End name getter
 	
 	public String getStreet ( ) {
 		return street;
 	} // End street getter
 	
 	public String getCity ( ) {
 		return city;
 	} // End city getter
 	
 	public String getState ( ) {
 		return state;
 	} // End state getter
 	
 	public int getZip ( ) {
 		return zip;
 	} // End zip getter
 	
 	public int getMaxOverdraft ( ) {
 		return maxOverdraft;
 	} // End maxOverdraft getter
 	
 	public int getBalance ( ) {
 		return balance;
 	} // End balance getter

//********** F U N C T I O N S ****************// 	
 	public int deposit(int balanceIn) {
 		// balance and balanceIn are both in "cents"
 		balance += balanceIn;
 		return balance;
 	} // End deposit
 	
 	public int withdraw(int balanceIn) {
 		// balance and balanceIn are both in "cents"
 		balance -= balanceIn;
 		if (balance<0) {
 			// test if too far overdrawn
 			if (0-balance>maxOverdraft) {
 				System.out.println("**Withdrawal rejected. Overdraft of $" + (0.-balance/100.) + 
 				                   " exceeds limit of $" + maxOverdraft/100.);
 				balance += balanceIn;
 			} // End > maxOverdraft
 		} // End if balance
 		return balance;
 	} // End deposit
 	
 	// Print the address of the selected account //
	public void printAddress (){
		System.out.println(name);
		System.out.println("Address:");
		System.out.println(street);
		System.out.println(city + " , " + state + "  " + zip);
		System.out.print("\n");
	} // End printAddress
	
 	// Print the financials of the selected account //
	public void printFinancial (){
		System.out.println("Balance: $" + balance/100.);
		System.out.println("Overdraft limit: $" + maxOverdraft/100.);
		System.out.print("\n");
	} // End printAddress
	
} // End class Account