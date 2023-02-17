package swapnumbers;

import java.util.Scanner;

/**
 *
 * @author Ashi
 */
public class SwapNumbers {

    public static void main(String[] args) {
        int x;
        int y;

        System.out.println("Enter first value: ");
        Scanner input = new Scanner(System.in);
        x = input.nextInt();

        System.out.println("Enter second value: ");
        Scanner input2 = new Scanner(System.in);
        y = input2.nextInt();

        System.out.println("Before swapped, first value is " + x + " and second value is " + y + ".\n");

        swapWithTemp(x, y); //method 1
        swapWithoutTemp(x, y); //method 2

    }

    //method 1 : Use a temporary variable to swap numbers
    public static void swapWithTemp(int x, int y) {

        int temp = x;
        x = y;
        y = temp;

        System.out.println("After swapping using temporary variable, first value is " + x + " and second value is " + y);

    }
    //method 2 : Swap numbers without using a temporary variable

    public static void swapWithoutTemp(int x, int y) {
        x = y - x;
        y = y - x;
        x = x + y;
        System.out.println("After swapping without using temporary variable, first value is " + x + " and second value is " + y);
    }

}
