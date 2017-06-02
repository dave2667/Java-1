/* Create new classes Island and its subclass Hawaii
  */
package edu.acc.java;
public class Hawaii extends Island {
	public static void main (String... args) {
		Hawaii vacation1 = new Hawaii();
		System.out.println(vacation1);
		Island vacation2 = new Island();
		System.out.println(vacation2);

	} // End main

	public Hawaii () {
		System.out.println("in Hawaii");
	} // End constructor

	public String toString() {
		return "Danger: Volcanic.";
	} // End toString
} 