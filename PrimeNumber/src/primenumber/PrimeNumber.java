/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primenumber;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class PrimeNumber {

    public static void main(String[] args) {
        int x;
        
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter positive integer :");
        x = sc.nextInt();
boolean isPrime = true;
        if (x < 2) {
            isPrime = false;
        } else {
            for (int i = 2; i <= Math.sqrt(x); i++) {
                if (x % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }
       if(isPrime){
           System.out.println(x+" is prime number");
       }else{
           System.out.println(x+" is NOT prime number");
       }

    }
}
