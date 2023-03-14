
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
       int count = sc.nextInt();
       int sum=0;
       for(int i=0;i<count;i++){
           System.out.println("Enter integer :");
           int num = sc.nextInt();
           sum =sum+num;
           
       }
       double average = sum/count;
       System.out.println("Average :"+average);
       
    }
    
}
