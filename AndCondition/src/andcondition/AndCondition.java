/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package andcondition;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class AndCondition {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    		 Scanner in = new Scanner(System.in);
		 System.out.print("Input first number: ");
         double n1 = in.nextDouble();
         System.out.print("Input second number: ");
         double n2 = in.nextDouble();
		 System.out.println(n1 > 0 && n1 < 1 && n2 > 0 && n2 < 1);
	}
}