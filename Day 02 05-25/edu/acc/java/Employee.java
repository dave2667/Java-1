package edu.acc.java;
public class Employee {
	String name;
	int ssn;
	int title;
	int paygrade;
	double annualSalary;

	public Employee (double annualSalary, String name) {
		System.out.println ("Employee created");
		this.name = name;
		this.annualSalary = annualSalary;
	} // End method Employee

	public double getSalary () {
		return this.annualSalary;

	} // End getSalary

	public String getName () {
		return this.name;

	} // End getName

} // End Class Employee