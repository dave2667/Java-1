package edu.acc.java;
public class Branch {
	int emplNum;
	int deptNum = 10;

	public static void main (String[] args) {
		Branch myBranch = new Branch();
		Employee joe = new Employee(175800.32, "Joe D Mann");
		Employee jane = new Employee(joe.annualSalary*0.93, "Jane Nottaman");

		System.out.println(joe.getName());
		System.out.println(joe.getSalary());

		System.out.println(jane.getName());
		System.out.println(jane.getSalary());
		
		System.out.println(myBranch.getAddr()); // print the address
		System.out.println(myBranch.getName()); // print the name

	} // End of main

	public String getAddr () {
		return "123 Pine St.";

	} // End getAddr

	public String getName () {
		return "Round Rock";

	} // End getName
} // End of class Branch