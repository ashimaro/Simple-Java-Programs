package primenumber;

import java.util.Scanner;

/**
 * The PrimeNumber class contains a main method that takes a positive integer input from the user
 * and determines whether it is a prime number or not.
 * 
 * @author Ashi
 */
public class PrimeNumber {

    public static void main(String[] args) {
        int x;
        
        // Create a Scanner object to read input from the user
        Scanner sc = new Scanner(System.in);
        
        // Prompt the user to enter a positive integer
        System.out.println(" Enter positive integer :");
        
        // Read the integer input from the user
        x = sc.nextInt();
        
        // Initialize a boolean variable to track whether the input number is prime
        boolean isPrime = true;
        
        // Check whether the input number is less than 2 (which is not a prime number)
        if (x < 2) {
            isPrime = false;
        } else {
            // Check whether the input number is divisible by any number between 2 and its square root
            for (int i = 2; i <= Math.sqrt(x); i++) {
                if (x % i == 0) {
                    // If the input number is divisible by a number between 2 and its square root, it is not a prime number
                    isPrime = false;
                    break;
                }
            }
        }
        
        // Print the result whether the input number is a prime number or not
        if(isPrime){
            System.out.println(x+" is prime number");
        } else {
            System.out.println(x+" is NOT prime number");
        }

    }
}
