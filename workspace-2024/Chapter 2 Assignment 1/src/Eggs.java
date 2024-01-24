import java.util.*;
public class Eggs {

	public static void main(String[] args) {
		Scanner instuff = new Scanner(System.in);
		int eggs = 27;
		final int DOZEN_EGGS = 12; 
		
		System.out.print("Enter the number of eggs");
		eggs = instuff.nextInt(); 
		
		int dozens = eggs / DOZEN_EGGS; 
		int remainder = eggs % DOZEN_EGGS; 
		float price1 = (int) ((int) dozens * 3.25); 
		float price2 = (int) (remainder * .45);
		float total = price1 + price2; 
		
		
		System.out.println("You ordered " +  eggs + " eggs. That's " + dozens + " dozen at $3.25 per dozen and " + remainder + " loose eggs at 45 cents each for a total of " + total);

	}

}
