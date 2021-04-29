/*   Created by IntelliJ IDEA.
 *   Author: Gautam Sethi (GAUTAMSETHI123)
 *   Date: 30-01-2021
 *   Time: 15:08
 *   File: Array2.java
 */

package Scratch;

public class Array2 {
    public static void main(String[] args) {
        int[] array = new int[5];


        int i=0,j =2;

        array[0] = 10;
        array[1] = 20;
        array[2] = 30;
        array[3] = 40;
        array[4] = 50;


        int[] other = {100 , 200, 300};
        // for (int i = 0; i < array.length ; i++) {
        // System.out.println(array[i]);
        System.out.println("values are:" + array[i] + "and " + array[j]);
        //Swap(array,i,j);
        System.out.println("values are:" + array[i] + "and " + array[j]);
        System.out.println("values are:" + array[i] + "and " + other[i]);
        swap(array,other);
        //no change after the swap function is called.
        System.out.println("values are:" + array[i] + "and " + other[i]);

    }

    public static void Swap(int[] arr, int i , int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }


    public static void swap(int[] one, int[]two){
        int[]temp1 = one;
        one = two;
        two = temp1;
    }


}
