/*   Created by IntelliJ IDEA.
 *   Author: Gautam Sethi (GAUTAMSETHI123)
 *   Date: 21-07-2021
 *   Time: 12:08
 *   File: Sort0And1.java
 */

package Scratch;

import java.util.Arrays;
import java.util.Scanner;

public class Sort0And1 {

    public static int[] sort(int []arr, int size){
        Scanner scn = new Scanner(System.in);


        for(int i=0; i<size; i++){
            for(int j=i+1; j<size; j++ ){
                if(arr[i] > arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        return arr;
    }
    public static void main(String[] args) {
        Scanner scn1 = new Scanner(System.in);
        System.out.println("enter the size of the array");
        int size = scn1.nextInt();
        int [] arr = new int[size];
        System.out.println("enter array elements");
        for(int i=0; i<size; i++){
            arr[i] = scn1.nextInt();
        }

        for (int val : arr) {
            System.out.print(val+ " ");
        }

        int[] ret = sort(arr, size);
        System.out.println();
        for (int val2 : ret
             ) {
            System.out.println(val2 + " ");

        }

    }
}
