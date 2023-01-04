package question1;

import java.util.Random;
import java.util.Arrays;
import java.util.Scanner;

/**
 * This class performs a binary search on an array of 20 random integers in the 
 * range 1 to 100 to discover whether or not it contains an integer input from
 * the keyboard.
 *
 * @author Jing Hua Ye
 * @date Nov/6/2021
 * @version 1.0
 */
 class BinarySearchTest {
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random generator = new Random();

        //Task: create an array of 20 random integers between 1 to 100 
        //to-complete
        int[] array = new int[20];
        for (int i = 0; i < array.length; i++) {
        	array[i] = generator.nextInt(100);
            //System.out.println(Arrays.toString(array));
         }

        //Task: which method should be used in Arrays class to make sure data in a sorted 
        //order
        //to-complete
        Arrays.sort(array);
        //System.out.println(Arrays.toString(array));
                
        //Task: display array as below: for example [-1, 10, 40, 30]
        //Hint: use the Arrays class, which method should we use to output data in a such 
        //format?
        //to-complete
        System.out.println(Arrays.toString(array));
        
        //Task: repeatedly input an integer from user: -1 terminates the program
        //after reading an input of search key, we perform a binary search on 
        //data with this search key. Finaaly print out the result of the binary search as the
        //sample outputs provided in the task specification
        //to-complete
        boolean running = true;
        while (running == true){        	
        	System.out.print("Please enter integer, enter -1 to terminate");
        	int searchKey = input.nextInt();
            if (searchKey == -1) {
            	running = false;
            }
            
            binarySearch(array, searchKey);
        }

        
     }
/* =============================================================================
                           HELPER METHODS 
   =============================================================================
 */
/**
 * To perform a binary search on an array of data
 *
 * @param data a static array of integers
 * @param searchKey the search key of performing the search
 * @return -1 if the searchKey is not found in the data, otherwise the position 
 * of the searchKey in the data
 */
 private static int binarySearch(int[] data, int searchKey)
 {   //to-complete7
	 int res = -1;
	 int first = 0, last = 0;
	 int mid = (first + last)/2; 
	 
	 while (first <= last) {
		 if (data[mid]< searchKey ) {
			 first = mid -1;
		 }
		 else if (data[mid] == searchKey) {
			 System.out.println("Element is found at index: " + mid); 
			 res = mid;
		     break;  
		 }
		 else {
			 last = mid-1;
		 }
		 mid = (first + last)/2;  
		 if ( first > last ){  
		      System.out.println("Not Found in Array");
		      break;
	 }
	   }
	return res;
 }
  
  //you may need to consider to define some other helper methods to format the final outputs

/* ============================================================================
                            CLASS VARIABLES
   ============================================================================
 */
     //the maximum size of the static array
     private static final int MAX_SIZE = 20; 
}
