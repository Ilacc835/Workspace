// Isaac Laccone 1/23/2024 
// Write a program that accepts a number of minutes and converts it both to hours and days. For example, 6,000 minutes equals 100 hours and equals 4.167 days. Save the program as MinutesConversion.java
import java.util.*;
public class MinutesConversion {

	public static void main(String[] args) {
		Scanner instuff = new Scanner(System.in); 
		int minutes = 0;
		final int MINUTES_TO_HOURS = 60; 
		
		System.out.print("Enter the number of minutes");
		minutes = instuff.nextInt();
		
		int hours = minutes / MINUTES_TO_HOURS;
		float days = hours / 24;
		
		System.out.println(minutes + " minutes equals " + hours + " hours and " + days + " days");

	}

}
