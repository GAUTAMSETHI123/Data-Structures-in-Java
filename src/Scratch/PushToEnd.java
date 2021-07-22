/*   Created by IntelliJ IDEA.
 *   Author: Gautam Sethi (GAUTAMSETHI123)
 *   Date: 22-07-2021
 *   Time: 10:58
 *   File: PushToEnd.java
 */

package Scratch;

import java.util.Scanner;

public class PushToEnd {

    public static int[] push(int [] arr , int size){
        int index = 0;
        int [] arr2 = new int[arr.length];
        for(int i=0; i<size; i++){
            if(arr[i]!= 0){
                arr2[index] = arr[i];
                index++;
            }
        }
        return arr2;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("enter the size of the array");
        int N = scn.nextInt();
        int[] arr = new int[N];
        System.out.println("enter array elements");
        for (int i = 0; i < N; i++) {
            arr[i] = scn.nextInt();
        }

        for (int val: arr
             ) {
            System.out.print(val + " ");

        }

        System.out.println();

        int [] ret = push(arr, N);
        for (int val2: ret
             ) {
            System.out.print(val2 + " ");

        }


    }
}
