/*   Created by IntelliJ IDEA.
 *   Author: Gautam Sethi (GAUTAMSETHI123)
 *   Date: 05-02-2021
 *   Time: 02:35
 *   File: LinearSearch.java
 */

package Scratch;

import java.util.Scanner;


public class LinearSearch {
    public static void main(String[] args) {
        int [] arr = new int[5];

        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;

        System.out.println(search(arr,40));

    }

    public static int search(int[]arr1 , int item){
        for (int i = 0; i < arr1.length; i++) {
            if(arr1[i] == item){
                return i;

            }

        }
        return -1;
    }
}
