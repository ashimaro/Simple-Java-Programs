package oddnumbers;

import java.util.Scanner;

/**
 *
 * @author ashi
 */
public class OddNumbers {

    public static void main(String[] args) {
        int[] numbers = new int[10];
        Scanner input = new Scanner(System.in);

        System.out.println("Enter 10 integers :");
        for (int i = 0; i < 10; i++) {
            numbers[i] = input.nextInt();
            
        }
        findOdd(numbers);
    }

    public static void findOdd(int[] numbers) {
        
        for (int i = 0; i < 10; i++) {

            if (numbers[i] % 2 != 0) {
                System.out.println("\n"+numbers[i]);
            }

        }}}
