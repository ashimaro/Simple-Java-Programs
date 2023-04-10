
package checkdigit;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class CheckDigit {

    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
String number;
int digit, sum = 0;
char c;

System.out.print("Enter a base value: ");
number = scanner.next();

for(int i = 0; i < number.length(); i++){
c = number.charAt(i);
digit = c - '0'; 

sum = sum + digit;
if (sum % 2 == 0) //even
sum = sum/2;
else
sum = (sum-1)/2; // odd

}
System.out.println("The check digit is " + sum);
String number1 = number + sum;
System.out.println("The generated value is " + number1); }
}

//test question for an interview to find check digit