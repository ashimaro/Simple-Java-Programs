package reversestring;

import java.util.Scanner;

/**
 *
 * @author Ashi
 */
public class ReverseString {

    static String string;

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter here :");
        string = input.nextLine();

        usingReverseMethod();
        withoutReverseMethod();
    }
//method 1: using reverse method

    public static void usingReverseMethod() {
        StringBuffer sb = new StringBuffer(string);

//StringBuffer is used if want to modify a string in a multi-threaded environment.
//StringBuilder is not thread-safe, mutable. We can also use this class in this case.
        sb.reverse();

        System.out.println("Reversed of " + string + " using reverse method is " + sb + "\n");

    }
    //method 2: without using reverse method

    public static void withoutReverseMethod() {

        char[] charArray = string.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (int i = charArray.length - 1; i >= 0; i--) {
            sb.append(charArray[i]);
           
        }

        System.out.println("Reversed output (Without using reverse method) :" + sb);

    }
}
