/*
 *  * NetPay.java
 * Author: Armaan Shah 
 *
 * Purpose: The following program calculates how long it will take to pay off credit card debt based on the principle amount, the interest rate, and the monthly payment.
 * Using these values as inputs, it calculates the months needed to pay off, the total amount paid, the total interest paid, and the total amount of overpay. 


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
























