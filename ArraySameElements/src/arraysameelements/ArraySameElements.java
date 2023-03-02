
package arraysameelements;

import java.util.Arrays;

/**
 *
 * @author Ashi
 */
public class ArraySameElements {

    public static void main(String[] args) {
       int[] array1 = {1, 2, 3, 4, 5};
       int[] array2 = {5, 4, 3, 2, 1};
       
       
       //Sort the arrays
       Arrays.sort(array1);
       Arrays.sort(array2);
       
       //Check if the two arrays contain the same elements.
       boolean isEqual = Arrays.equals(array1, array2);
       
       //Output the result after comparison
       if (isEqual){
           System.out.println("The arrays contains the same elements.");
       }else{
           System.out.println("The arrays does NOT contain the same elements.");
       }
    }
    
}
