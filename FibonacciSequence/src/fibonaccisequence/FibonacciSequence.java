
package fibonaccisequence;

/**
 *
 * @author Ashi
 */
public class FibonacciSequence {

 public static void main(String[] args) {
     
     FibonacciSeq(10);
 }
 public static void FibonacciSeq(int count){
     int a=0;
     int b=1;
     int c= 1;
     
     for(int i=0; i<= count ; i++){
         System.out.print(a +",");
         a=b;
         b=c;
         c=a+b;
     }
 }
}

//Fibonacci Sequence is sum of two previous numbers.