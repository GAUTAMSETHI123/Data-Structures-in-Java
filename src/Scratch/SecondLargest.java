/*   Created by IntelliJ IDEA.
 *   Author: Gautam Sethi (GAUTAMSETHI123)
 *   Date: 27-07-2021
 *   Time: 12:56
 *   File: SecondLargest.java
 */

package Scratch;

import java.util.Scanner;

public class SecondLargest {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("enter the size of the array");
        int N = scn.nextInt();
        System.out.println("enter array elements");
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = scn.nextInt();

        }

        for (int val : arr
        ) {
            System.out.print(val+ " ");

        }




            for ( int i = 0; i < N; i++) {
                for ( int j = i + 1; j < N; j++) {
                    if (arr[j] < arr[i]) {
                        int temp = arr[j];
                        arr[j] = arr[i];
                        arr[i] = temp;


                    }
                }
            }




        System.out.println();

        for (int val2: arr
             ) {
            System.out.print(val2 + " ");

        }
        System.out.println();

        System.out.println("second largest element in the array is " + arr[N-2]);
    }
}

