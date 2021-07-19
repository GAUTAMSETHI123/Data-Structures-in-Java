/*   Created by IntelliJ IDEA.
 *   Author: Gautam Sethi (GAUTAMSETHI123)
 *   Date: 19-07-2021
 *   Time: 13:34
 *   File: PairSum.java
 */

package Scratch;

import java.util.Scanner;

public class PairSum {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("enter the size of the array");
        int N = scn.nextInt();
        System.out.println("Enter the number you want find pair of:");
        int N2 = scn.nextInt();
        System.out.println("enter the array elements");
        int[] arr = new int[N];

        for(int i=0; i<N; i++){
            arr[i] = scn.nextInt();

        }
        for (int val : arr
             ) {
            System.out.print(val + " ");

        }

        int count=0;
        for(int i=0; i<N; i++){

            for(int j=i+1; j<N; j++){

                if((arr[i] + arr[j]) == N2){
                    count++;

                }

            }

        }
        System.out.println();
        System.out.println(count);
    }
}
