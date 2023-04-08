
package task1;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author Ashwini
 */
public class LoanCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter your principal amount borrowed : RM ");
        double loan = scanner.nextDouble();
        
        System.out.print("Enter the annual fixed interest rate (%): ");
        double annualRate = scanner.nextDouble();
        
        System.out.print("Enter the number of years: ");
        int years = scanner.nextInt();
        int months = years * 12;
        
        double monthlyRate = annualRate / 100 / 12;
        
        double c = loan * monthlyRate / (1 - Math.pow(1 + monthlyRate, -months));
        
        DecimalFormat df = new DecimalFormat("#,##0.00");
        System.out.println("Monthly repayment amount: RM " + df.format(c));
        
        scanner.close();
    }
}