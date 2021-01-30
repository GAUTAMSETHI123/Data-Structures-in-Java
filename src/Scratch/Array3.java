/*   Created by IntelliJ IDEA.
 *   Author: Gautam Sethi (GAUTAMSETHI123)
 *   Date: 31-01-2021
 *   Time: 01:59
 *   File: Array3.java
 */

package Scratch;

public class Array3 {
    public static void main(String[] args) {
        int[] array = new int[5];
        int [] array1 = new int[3];

        int i=0,j =0;

        array[0] = 10;
        array[1] = 20;
        array[2] = 30;
        array[3] = 40;
        array[4] = 50;

        array1[0] = 100;
        array1[1] = 200;
        array1[2] = 300;

        // for (int i = 0; i < array.length ; i++) {
        // System.out.println(array[i]);
        System.out.println("values are:" + array[i] + "and " + array1[j]);
        Swap(array,array1,i,j);
        System.out.println("values are:" + array[i] + "and " + array1[j]);

    }

    public static void Swap(int[] arr , int [] arr1, int i , int j){
        int temp = arr[i];
        arr[i] = arr1[j];
        arr1[j] = temp;

    }
}
