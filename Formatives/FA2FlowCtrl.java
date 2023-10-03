package Formatives;

import java.util.Scanner;

public class CompoundInterestCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continueCalculations = true;

        while (continueCalculations) {
            System.out.print("Enter the initial balance: $");
            double balance = scanner.nextDouble();
            System.out.print("Enter the annual interest rate (in percentage): ");
            double annualInterestRate = scanner.nextDouble() / 100;


            double futureValueAnnually = calculateFutureValue(balance, annualInterestRate, 1);
            double futureValueMonthly = calculateFutureValue(balance, annualInterestRate / 12, 12);
            double futureValueDaily = calculateFutureValue(balance, annualInterestRate / 365, 365);

            // Display results
            System.out.println("\nFuture Value with Annual Compounding: $" + futureValueAnnually);
            System.out.println("Future Value with Monthly Compounding: $" + futureValueMonthly);
            System.out.println("Future Value with Daily Compounding: $" + futureValueDaily);

            // Ask if the user wants to continue
            System.out.print("\nDo you want to repeat the program? (yes/no): ");
            String input = scanner.next();
            if (!input.equalsIgnoreCase("yes")) {
                continueCalculations = false;
            }
        }

        System.out.println("Program ended.");
    }

    public static double calculateFutureValue(double balance, double monthlyInterestRate, int periods) {
        for (int i = 0; i < periods; i++) {
            balance += balance * monthlyInterestRate;
        }
        return balance;
    }
}
