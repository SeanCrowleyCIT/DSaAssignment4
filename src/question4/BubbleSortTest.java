package question4;

import java.security.SecureRandom;
import java.util.Arrays;

/**
 * Sorting an array into ascending order with bubble Sort
 *
 * @author Jing Hua Ye
 * @date Nov/20/2021
 * @version 1.0
 */
public class BubbleSortTest {

 /**
  * Sort elements of array with bubble sort
  * @param data an array of unsorted integers
  */              
  private static void bubbleSort(int[] data) {
     //to-complete
	  int length = data.length;
      for (int i = 0; i < length - 1; i++)
          for (int j = 0; j < length - i - 1; j++)
              if (data[j] > data[j + 1]) {
            	  swap();
                  // swap arr[j+1] and arr[j]
                  int temp = data[j];
                  data[j] = data[j + 1];
                  data[j + 1] = temp;
              }
  } 

  /**
   * Swap values in two elements
   * @param data an array of integers to be sorted
   * @param first the first element in the array to be swapped
   * @param second the second element in the array to be swapped
   */
   private static void swap(int[] data, int first, int second)
   {  //store first in temporary variable
      int temporary = data[first];

      //replace first with second
      data[first] = data[second];

      //put temporary in second
      data[second] = temporary;  
   } 

   public static void main(String[] args) {
      SecureRandom generator = new SecureRandom();

      // create unordered array of 10 random ints
      int[] data = generator.ints(10, 10, 91).toArray(); 

      System.out.printf("Unsorted array: %s%n", Arrays.toString(data));
      bubbleSort(data); // sort array
      System.out.printf("Sorted array: %s%n", Arrays.toString(data));
   }
}
