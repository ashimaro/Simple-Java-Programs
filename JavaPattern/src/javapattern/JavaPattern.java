
package javapattern;

/**
 *
 * @author Ashi
 */
public class JavaPattern {

    public static void main(String[] args) {
     // iterate over the rows of the pattern
for (int i = 1; i <= 5; i++) {
    // iterate over the columns of the pattern
    for (int j = 1; j <= 9; j++) {
        // check if the current column should contain a space or a digit
        if (j <= 5 - i || j >= 5 + i) {
            // print a space if the column is outside the range of the current row
            System.out.print("*");
        } else {
            // print the current row number if the column is within the range
            System.out.print(i);
        }
    }
    // move to the next row by printing a newline character
    System.out.println();
}
    }
}