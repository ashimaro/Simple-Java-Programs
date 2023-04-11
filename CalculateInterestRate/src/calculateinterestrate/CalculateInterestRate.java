/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculateinterestrate;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class CalculateInterestRate {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

        System.out.print("Enter loan amount: ");
        double P = scanner.nextDouble();

        System.out.print("Enter number of years : ");
        int N = scanner.nextInt() * 12;

        System.out.print("Enter monthly repayment amount: ");
        double c = scanner.nextDouble();

        double r = 0.01; // initial guess for interest rate

        
        for (int i = 0; i < 1000; i++) {
            double f = c - P * r / (1 - Math.pow(1 + r, -N));
            double fp = -P / (1 - Math.pow(1 + r, -N)) + P * r * N * Math.pow(1 + r, -N - 1) / Math.pow(1 - Math.pow(1 + r, -N), 2);
            double delta = f / fp;
            r -= delta;
            if (Math.abs(delta) < 1e-6) {
                break;
            }
        }

        System.out.printf("The interest rate for a loan of RM %.2f over %d years with monthly repayments of RM %.2f is %.2f%% per annum.%n", P, N / 12, c, r * 12 * 100);
    }
}