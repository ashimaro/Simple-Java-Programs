package vowelchecker;

import java.util.Scanner;

/**
 *
 * @author Ashi
 */
public class VowelChecker {

    public static void main(String[] args) {
        String a;
        Scanner input = new Scanner(System.in);
        System.out.println("VOWEL CHECKER");

        System.out.println("\nEnter your word :");
        a = input.nextLine();

        System.out.println("\nRESULT");

        //call method
        boolean hasVowel = vowelChecker(a); //boolean is used to express true or false

        if (hasVowel) {
            System.out.println("Vowel found!");

        } else {
            System.out.println("Vowel is not found");

        }
//call method
        String vowel = printVowels(a);

        if (vowel.length() > 0) {
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
