/*   Created by IntelliJ IDEA.
 *   Author: Gautam Sethi (GAUTAMSETHI123)
 *   Date: 30-01-2021
 *   Time: 14:25
 *   File: Array1.java
 */

package Scratch;

public class Array1 {
    public static void main(String[] args) {
        int[] arr = new int[5];

        //set
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;

        for (int i = arr.length-1; i< arr.length; i--){
            System.out.println(arr[i]);
        }

        System.out.println();

        // enhanced for loop
        for(int var : arr){
            System.out.println(var);
        }
    }
}

