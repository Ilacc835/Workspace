// Isaac Laccone 1/23/2024 Write a program which converts inches to feet and inches
import java.util.*;
public class InchesToFeet {

	public static void main(String[] args) {
		Scanner instuff = new Scanner(System.in);
		int inches = 86;
		final int INCHES_TO_FEET = 12;
		
		System.out.print("Enter the number of inches");
		inches = instuff.nextInt();
		
		int feet = inches / INCHES_TO_FEET;
		int remainder = inches % INCHES_TO_FEET;
		
		System.out.println(inches + " inches equals "+ feet + " feet plus " + remainder + " inches");
	}

}
