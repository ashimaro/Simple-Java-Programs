/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frequencycheckdigit;

/**
 *
 * @author User
 */
public class FrequencyCheckDigit {

   public static void main(String[] args) {
String num;
int digit, sum;
char c;
int[] frequency = new int[10]; 

for(int n = 1; n <= 1000000; n++) {
num = n + "";
sum = 0; //declare initial sum
for(int i = 0; i < num.length(); i++){
c = num.charAt(i);
digit = c - '0'; 
sum = sum + digit;
if (sum % 2 == 0) //even
sum = sum/2;
else
sum = (sum-1)/2; //odd

}

frequency[sum]++;
}

//print the frequencies
System.out.printf("%10s %10s\n", "Check Digit", "Frequency");
for(int i = 0; i < frequency.length; i++)
System.out.printf("%10d %10d\n", i, frequency[i]);

}
}
