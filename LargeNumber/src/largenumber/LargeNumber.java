package largenumber;

import java.util.Scanner;

/**
 *
 * @author Ashi
 */
public class LargeNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 3 numbers :");
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();

        findLargeNumber(x, y, z);
    }

    public static void findLargeNumber(int x, int y, int z) {

        if (x > y && x > z) {
            System.out.println("First number is the largest");
        } else if(y > x && y > z){
             System.out.println("Second number is the largest");
        }
        else{
            System.out.println("Third number is the largest");
        }
   }
}
