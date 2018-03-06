package ErrorTerm;
import java.util.Scanner;

/**
 * @author Yashul
 *
 */
public class MeasuredValue {
	/**
	 * @param args
	 * Introduce the Scanner Class and define double variables in it.
	 * Define character in the main method.
	 */
	
	public static void main(String[] args) {
		double a,b,d,e, sum, sumerr, difference, differenceerr;
		char ch;
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter first number:");        // Enter the first number
		a = keyboard.nextDouble();
		
		System.out.println("Enter first number's Error Term:");		// Enter the first number's error term
		d = keyboard.nextDouble();
		
		System.out.println("Enter second value:");		// Enter the second number
		b = keyboard.nextDouble();
		
		System.out.println("Enter second number's Error Term:");		// Enter the second number's error term
		e = keyboard.nextDouble();
		System.out.println("Select an operation: (+/-)");		// Choose which among the two operators you want to use
		ch = keyboard.next().charAt(0);
	/**
	 * Perform the operations of addition and subtraction one at a time.
	 */
		if (ch == '+') {
			sum = a + b;		// Add the terms
			sumerr = d + e;		// Add the terms
			System.out.println("Sum:"+ sum + "" + "\u00b1" + "" + sumerr);		// Display the result
		}	
			else if (ch == '-') {
			difference = a - b;		// Subtract the second input from the first
			differenceerr = d - e;	// Subtract the second input from the first
			System.out.println("Difference:"+difference + "" + "\u00b1" + "" + differenceerr);		// Display the result
			}
		}
}
