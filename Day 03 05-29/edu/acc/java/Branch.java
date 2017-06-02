package edu.acc.java;
/*    2) Type as much of the Branch.java class in from memory as you can, then look at
     your notes or the github version of Branch.java and add the rest. Make sure
     it compiles and runs as expected. Now add a constructor that initializes 
     the branch number and address. Use the constructor in the main() method to 
     make myBranch and myBranch2 instances initialized with different numbers 
     and addresses using the constructor. You need to change the getBranchNum() and
     getBranchAddress() to return the actual data in the instance, not the String
     literal we made up in class. */
public class Branch {
	String branchName;
	String branchAddress;
	int branchNumber;
	int branchEmployees;

	public static void main (String[] args) {
		Branch myBranch1 = new Branch (1, "Main", "901 Pine St\nAustin TX", 50);
		Branch myBranch2 = new Branch (2, "Round Rock", "500 Deep Ellum Ave\nRound Rock TX", 20);

	}  // End main

	public int getBranchNum () {
		return branchNumber;
	} // End getBranchNum

	private String getBranchName () {
		return branchName;
	} // End getBranchName

	public String getBranchAddress () {
		return branchAddress;
	} // End getBranchAddress
		
	private Branch (int number, String name, String address, int employees) {
		branchName = name;
		branchAddress = address;
		branchNumber = number;
		branchEmployees = employees;

	}  // End Branch constructor
}  // End class Branch