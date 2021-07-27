/*   Created by IntelliJ IDEA.
 *   Author: Gautam Sethi (GAUTAMSETHI123)
 *   Date: 26-07-2021
 *   Time: 01:52
 *   File: RotateArray.java
 */

package Scratch;

import java.util.Scanner;

public class RotateArray {
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

        int[] arr2 = new int[N];
        int index = 0;
        for(int i=N2; i<N; i++){
            arr2[index] = arr[i];
            index++;
        }

        int count =0;
        for(int index1 = N-N2;  index1<N; index1++  ){
            arr2[index1] = arr[count];
            count++;

        }

        for (int val2: arr2
             ) {
            System.out.print(val2);

        }

    }
}
