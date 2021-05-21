/*   Created by IntelliJ IDEA.
 *   Author: Gautam Sethi (GAUTAMSETHI123)
 *   Date: 05-05-2021
 *   Time: 01:53
 *   File: BubbleSort.java
 */

package Scratch;

import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("enter the size of the array");
        int N = scan.nextInt();

        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = scan.nextInt();

        }

        System.out.println("Array is:");
        for (int val : arr
        ) {
            System.out.print(val + " ");

        }
        System.out.println();

        int[] ret = bubbleSort1(arr, N);
        System.out.println("sorted array is");
        for (int val1 : ret
        ) {
            System.out.print(val1 + " ");

        }
    }

    public static int[] bubbleSort1(int[] arr1, int size) {
        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - 1 - i; j++) {
                if (arr1[j] > arr1[j + 1]) {
                    int temp = arr1[j];
                    arr1[j] = arr1[j + 1];
                    arr1[j + 1] = temp;
                }


            }

        }
        return arr1;
    }

}
