package vowelchecker;

import java.util.Scanner;

/**
 *
 * @author Ashi
 */
public class VowelChecker {

    public static void main(String[] args) {
        String a; //declare  a string
        Scanner input = new Scanner(System.in); // instantian of new Scanner object
        System.out.println("VOWEL CHECKER");

        System.out.println("\nEnter your word :");
        a = input.nextLine(); //assigns user'input to a

        System.out.println("\nRESULT");

        //call method to tell user there is vowel(s) in input
        //boolean is used to express true or false
        boolean hasVowel = vowelChecker(a); // invokes the vowelChecker method with the input String "a" and stores the result in a boolean variable (hasVowel)

        if (hasVowel) {// if hasVowel is true
            System.out.println("Vowel found!"); //print it on the console.

        } else {//if hasVowel is false
            System.out.println("Vowel is not found");

        }
//call method
        String vowel = printVowels(a);

        if (vowel.length() > 0) {// length of vowel string is set greater than 0, so that it will print the vowel(s) in input
            System.out.println("Vowels in " + a + " : " + vowel);

        } else {
            System.out.print("");
        }

    }

    //method to identify vowels in input
    public static boolean vowelChecker(String a) {
        return a.toLowerCase().matches(".*[aeiou].*");
    }

    //method to print vowels in input
    public static String printVowels(String a) {
        String vowels = "";

        for (int i = 0; i < a.length(); i++) {
            char ch = a.charAt(i); //charAt(i) method returns the character at index i of the input string a, and assigns it to the ch variable.

            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'
                    || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {

                vowels = vowels + ch; //vowels += ch;
            }
        }
        return vowels;
    }

}
