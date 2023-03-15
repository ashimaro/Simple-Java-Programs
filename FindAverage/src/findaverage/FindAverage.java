
package findaverage;

import java.util.Scanner;

/**
 *
 * @author Ashi
 */
public class FindAverage {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter number counts :");
       //declare variable for count
       int count = sc.nextInt();
       //declare variable for sum up in for loop
       int sum=0;
       for(int i=0;i<count;i++){
           //the loop will repeat based on count length
           System.out.println("Enter integer :");
           int num = sc.nextInt();
           sum =sum+num;
           
       }//end loop
       double average = sum/count;
       System.out.println("Average :"+average);
       
    }
    
}
