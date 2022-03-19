/*   Created by IntelliJ IDEA.
 *   Author: Gautam Sethi (GAUTAMSETHI123)
 *   Date: 26-07-2021
 *   Time: 01:52
 *   File: RotateArray.java
 */

package Scratch;

import java.util.Arrays;
import java.util.Scanner;

public class RotateTheArray {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("enter the size of the array");
        int N = scn.nextInt();
        System.out.println("enter the array elements");
        int [] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = scn.nextInt();

        }

        for (int val: arr
             ) {
            System.out.print(val + " ");
        }
        System.out.println();

        System.out.println("enter number the times you want to rotate the array ");
        int N2 = scn.nextInt();

        int[] temp = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            temp[(i + N2) % arr.length] = arr[i];
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = temp[i];
        }

        System.out.println(Arrays.toString(arr));


    }
}
