/*   Created by IntelliJ IDEA.
 *   Author: Gautam Sethi (GAUTAMSETHI123)
 *   Date: 09-05-2021
 *   Time: 01:55
 *   File: InsertionSort.java
 */

package Scratch;

import java.util.Scanner;

public class InsertionSort {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int N = scan.nextInt();
        int[] arr = new int[N];

        for (int k = 0; k < arr.length; k++) {
            arr[k] = scan.nextInt();
        }

        System.out.println("Array is");
        for (int val: arr
        ) {
            System.out.print(val + " ");
        }

        System.out.println();
        int[] ret = insertionSort(arr);
        System.out.println(" The sorted array is");
        for (int val1 : ret
        ) {
            System.out.print(val1 + " ");

        }

    }

    public static int[] insertionSort(int[] arr1){
        for(int i =1; i<arr1.length; i++){
            int temp = arr1[i];
            int j = i;
            while(j>0 && arr1[j]> temp){
                arr1[j+1] = arr1[j];
                j--;
            }
            arr1[j+1] = temp;

        }
        return arr1;
    }


}



