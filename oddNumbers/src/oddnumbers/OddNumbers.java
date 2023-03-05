package oddnumbers;

import java.util.Scanner;

/**
 *
 * @author ashi
 */
public class OddNumbers {

    public static void main(String[] args) {
        
        int[] numbers = new int[10];
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 10 integers :");

        for(int i=0; i<10;i++){
            numbers[i] = sc.nextInt();
     }
       findOdd(numbers);
    }
    public static void findOdd(int[] numbers){
         System.out.println("\nThe odd numbers are :");
        for(int i=0;i<10;i++){
            if(numbers[i] %2 !=0){
               
                System.out.print(+numbers[i]+",");
            }
        }
    }
}