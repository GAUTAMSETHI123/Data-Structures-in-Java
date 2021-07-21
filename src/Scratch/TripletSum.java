/*   Created by IntelliJ IDEA.
 *   Author: Gautam Sethi (GAUTAMSETHI123)
 *   Date: 21-07-2021
 *   Time: 09:02
 *   File: TripletSum.java
 */

package Scratch;

import java.util.Scanner;

public class TripletSum {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("enter the size of the array");
        int N = scn.nextInt();
        System.out.println("enter the number you want triplet of");
        int N2 = scn.nextInt();
        System.out.println("enter the array elements");
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = scn.nextInt();

        }

        for (int val: arr
             ) {
            System.out.print(val+ " ");

        }
        int count = 0;
        for (int i = 0; i < N; i++) {
            for (int j = i+1; j < N; j++) {
                for (int k = j+1; k < N; k++) {
                    if((arr[i]+arr[j]+arr[k]) == N2 ){
                        count++;
                    }


                }

            }

        }
        System.out.println();
        System.out.println(count);
    }
}
