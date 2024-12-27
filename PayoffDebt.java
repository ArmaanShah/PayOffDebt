/*
 *  * NetPay.java
 * Author: Armaan Shah 
 * Submission Date: September 5th
 *
 * Purpose: The following program calculates how long it will take to pay off credit card debt based on the principle amount, the interest rate, and the monthly payment.
 * Using these values as inputs, it calculates the months needed to pay off, the total amount paid, the total interest paid, and the total amount of overpay. 
 *
 * Statement of Academic Honesty:
 *
 * The following code represents my own work. I have neither 
 * received nor given inappropriate assistance. I have not copied 
 * or modified code from any source other than the course webpage 
 * or the course textbook. I recognize that any unauthorized 
 * assistance or plagiarism will be handled in accordance with 
 * the University of Georgia's Academic Honesty Policy and the 
 * policies of this course. I recognize that my work is based 
 * on an assignment created by the School of Computing 
 * at the University of Georgia. Any publishing or
 * posting of source code for this assignment is strictly 
 * prohibited unless you have written consent from the 
 * School of Computing at the University of Georgia.  
 */

import java.util.Scanner;

public class PayoffDebt {

	public static final Scanner Inputs = new Scanner(System.in);

	public static void main(String[] args) {

		// asking and printing all 3 inputs
		System.out.printf("Principal: \t\t\t");
		double PrincipalAmount = Inputs.nextDouble();

		System.out.print("Annual Interest Rate (%): \t");
		double AnnualInterestRate = Inputs.nextDouble();

		System.out.printf("Monthly Payment: \t\t");
		double MonthlyPayment = Inputs.nextDouble();

		// Calculation of Exact Number of Months and the Ceiling Number of Months
		double numerator = Math.log(MonthlyPayment)
				- Math.log(MonthlyPayment - (AnnualInterestRate / 1200.0) * PrincipalAmount);
		double denominator = Math.log(AnnualInterestRate / 1200.0 + 1.0);
		double ExactNumberOfMonths = numerator / denominator;
		int CeilingNumberOfMonths = (int) Math.ceil(ExactNumberOfMonths);

		// Calculating Total Amount Paid

		double TotalAmountPaid = CeilingNumberOfMonths * MonthlyPayment;

		// Calculating Total Interest Paid

		double TotalInterestPaid = TotalAmountPaid - PrincipalAmount;

		// Calculating Total Over Pay

		double TotalOverPay = MonthlyPayment * (CeilingNumberOfMonths - ExactNumberOfMonths);

		// Printing Results

		System.out.println("\nMonths Needed To Pay Off: \t" + CeilingNumberOfMonths);

		System.out.println("Total Amount Paid:\t\t$" + TotalAmountPaid);

		System.out.println("Total Interest Paid:\t\t$" + TotalInterestPaid);

		System.out.println("Overpayment:\t\t\t$" + TotalOverPay);

	}// main

}// class
























