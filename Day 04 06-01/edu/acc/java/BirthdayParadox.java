package edu.acc.java;
import java.util.Random;
public class BirthdayParadox {
/* Class to test all the people in the room.  Each person will
   have a random birthday.  If their birthday matches the test 
   birthday, determine how many people should have been tested.  
   Parameter is the maximum number of people in tests.                            
   */
	public static void main (String[] args) { 
		int maxPeople = Integer.parseInt(args[0]);
		int[] people = new int[maxPeople];
		int[] test = new int[maxPeople];
		Random randy = new Random();
		int baseBirthday = randy.nextInt(366);
		int trialBirthday = 0;
		double peopleTestedTtl = 0.;
		int testsPassed = 0;
		
		for (int i=0; i<people.length; i++) {
			people[i] = i+1;
			test[i] = 0;  // Zero will indicate that a birthday match is not found
			for (int n=0; n<people[i]; n++) { // Test all the people in the room
				trialBirthday = randy.nextInt(366);
				if (trialBirthday == baseBirthday) {
					test[i]=n;
					break;
				} // End if birthday ==
		  	} // End for n
	  		System.out.print("\nPeople in room: " + people[i]);
			if (test[i]>0) {
		  		peopleTestedTtl += test[i];
		  		testsPassed++;
		  		System.out.print(" Match found @ " + test[i]);
		  	} // End if test[i]
		} //End for i

/* List ranges and match counts */
		System.out.print("\n\nRange of people 1");
		for (int i=0; i<people.length; i++) {
			if (test[i]>0) {
		  		peopleTestedTtl += test[i];
		  		testsPassed++;
		  	} // End if test[i]
		  	if (people[i]%10==0 || i==(people.length-1)) {
		  		System.out.print(" to " + people[i] +":");
				System.out.println("\n      Average number of people tested before match found: " 
		                    + peopleTestedTtl/testsPassed + " in " + testsPassed + 
							" tests passed."); 
				System.out.print("Range of people " + (people[i]+1));
		  		peopleTestedTtl = 0;
		  		testsPassed = 0;
		  	} // End of if people[i]
		} //End for i
	} // End main

} // End class 	
