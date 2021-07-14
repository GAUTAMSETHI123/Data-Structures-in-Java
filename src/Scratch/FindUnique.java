/*   Created by IntelliJ IDEA.
 *   Author: Gautam Sethi (GAUTAMSETHI123)
 *   Date: 15-07-2021
 *   Time: 00:39
 *   File: FindUnique.java
 */

package Scratch;

import java.util.Scanner;

public class FindUnique {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("enter the size of the array");
        int size= scn.nextInt();
        int[] arr = new int[size];
        System.out.println("enter array elements");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }
        for(int i=0; i<arr.length; i++){
            int count = 0;
            for(int j=0; j< arr.length; j++){

                if(arr[j]==arr[i]) {
                    count++;

                }

                }
            if(count == 1){
                System.out.println(arr[i]);

            }



        }
    }
}
