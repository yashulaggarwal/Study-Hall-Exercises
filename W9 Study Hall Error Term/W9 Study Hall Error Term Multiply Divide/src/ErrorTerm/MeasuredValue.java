package ErrorTerm;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * @author Yashul
 * 2018-03-08 The algorithm of multiplication and division of error terms
 */
public class MeasuredValue {
	/**
	 * @param args
	 * Introduce the Scanner Class and define double variables in it.
	 * Define character in the main method.
	 */
	
	public static void main(String[] args) {
		double a,b,d,e, Product, div1, div2, divsum, producterr, Division, Divisionerr;
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
	/**
	 * Perform the operations of multiplication and subtraction one at a time.
	 */
		keyboard.close();
		DecimalFormat New = new DecimalFormat();	// The result should be rounded off
		New.format(Product = a*b);				// Product of first and second numbers
		New.format(div1 = d/a);					// Divide the error term of first number by the number itself
		New.format(div2 = e/b);					// Divide the error term of second number by the number itself
		New.format(divsum = div1+div2);			// Add the results of the  above divided terms
		New.format(producterr = divsum*Product);		// Multiply the sum of the results of the above divided terms with the product of first and second numbers 
		New.format(Division = a/b);					// Divide the first term from the second term
		New.format(Divisionerr = divsum*Division);		// Multiply the sum of the results of the above division of error terms with the product of first and second numbers
		
		// For Multiplication
		System.out.println("--->Multiplication <---");		// Announce the multiplication
		System.out.println("");

		System.out.println(getSignificant(Product, 9) + "±" + getSignificant(producterr, 1));	// Round off the Product to 9 significant digits
		System.out.println("");																	// and the error term to 1 significant digit
		
		// For Division
		System.out.println("--->Division <---");		// Announce the division
		System.out.println("");

		System.out.println(getSignificant(Division, 9) + "±" + getSignificant(Divisionerr, 1));	// Round off the Division to 9 significant digits
		System.out.println("");																	// and the error term to 1 significant digit
	}

	public static String getSignificant(double value, int sigFigs) {		// Method for rounding off the result
	    MathContext mc = new MathContext(sigFigs, RoundingMode.DOWN);
	    BigDecimal bigDecimal = new BigDecimal(value, mc);
	    return bigDecimal.toPlainString();
	}
	
}