package edu.acc.java;
public class First {
	public static void main (String[] args) {
		byte myByte = 8;
		short myShort = 501;
		int myInt = 32000; // This is an integer declaration
		/* Block
			comment
		*/
		long myLong = 7000000;
		float myFloat = 3.14f;
		double myDouble = 3.14159;
		boolean myBool = true;
		char myChar = 'w';
		System.out.println("Hello " + myBool + 
			(myByte + myShort) + " Dude!");
		System.out.println(myShort%2 == 0);
	}
}