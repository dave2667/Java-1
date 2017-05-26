package edu.acc.java;
public class ArrayOfArrayDemo {
	public static void main (String[] args) {



		int[][]a={{1,2,3},{4,5,6,7}};

		for (int i=0; i<a.length; i++) {
			for (int k=0; k<a[i].length; k++) {
				System.out.println("a[i][k] is a[" + i + "]["
				 + k + "] = " + a[i][k]);

			} //End for k

		} //End for i
	} // End of main
} // End of class
