// Pick a random birthday.
  // convert to the day of the year.

package edu.acc.java;
import java.util.Random;

public class BirthdayParadox {
	public static void main (String[] args) {
		Random randy = new Random ();
// Do loop for number of samples (1,000)
		int[] loopCounts = new int[1000];
		int randomBirthdayBase;
		int randomBirthdayTrial;
		int matchCount;  // Random tries before matching birthday
		int countTotal=0;

// Pick a random birthday.
  // convert to the day of the year.
		randomBirthdayBase = randy.nextInt (366);
//  Loop, picking random birthdays until a duplicate has been found.
//  When the dupe is found, save the loop count.
		for (int trialCount=0; trialCount<loopCounts.length; trialCount++) {
			matchCount=0;
			do {
				matchCount++;
				randomBirthdayTrial = randy.nextInt(366);
			}  while (randomBirthdayTrial!=randomBirthdayBase); // End do
			loopCounts[trialCount]=matchCount;
		} // End loopCount

// Print average of counts
//		for (matchCount : loopCounts) {
//			countTotal += matchCount;
		for (int trialCount=0; trialCount<loopCounts.length; trialCount++) {
			countTotal += loopCounts[trialCount];
		}
		System.out.println("Out of 1000 trials, the average number of random tries to get to " + randomBirthdayBase
		                   + " is " + countTotal/loopCounts.length );
	} // End main

}  // End class