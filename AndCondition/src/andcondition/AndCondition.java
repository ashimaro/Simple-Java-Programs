
package andcondition;

import java.util.Scanner;

/**
 *
 * @author ashi
 */
public class AndCondition {

    public static void main(String[] args) {
    		 Scanner in = new Scanner(System.in);
		 System.out.print("Input first number: ");
         double n1 = in.nextDouble();
         System.out.print("Input second number: ");
         double n2 = in.nextDouble();
		 System.out.println(n1 > 0 && n1 < 1 && n2 > 0 && n2 < 1);
	}
}
//this program demosntrates on use of logical AND operator. 
//It will print true or false based on the logical expression (n1 > 0 && n1 < 1 && n2 > 0 && n2 < 1)