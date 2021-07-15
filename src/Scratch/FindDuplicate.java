/*   Created by IntelliJ IDEA.
 *   Author: Gautam Sethi (GAUTAMSETHI123)
 *   Date: 15-07-2021
 *   Time: 10:50
 *   File: FindDuplicate.java
 */

package Scratch;

import java.util.Scanner;

public class FindDuplicate {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("enter the size of the array");
        int size = scn.nextInt();
        System.out.println("enter array elements");
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = scn.nextInt();

        }

        for (int i = 0; i < size; i++) {
            int count=0;
            for (int j = i+1; j < size; j++) {
                if ((arr[i] == arr[j]) ) {
                    count++;
                }
            }
            if(count==1 ||  count>=2){
                System.out.print(arr[i]);
            }


        }
    }
}
