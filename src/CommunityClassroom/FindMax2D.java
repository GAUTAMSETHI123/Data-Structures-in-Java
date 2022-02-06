/*   Created by IntelliJ IDEA.
 *   Author: Gautam Sethi (GAUTAMSETHI123)
 *   Date: 06-02-2022
 *   Time: 12:43
 *   File: FindMax2D.java
 */

package CommunityClassroom;

import java.util.Arrays;
import java.util.Scanner;

public class FindMax2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[3][3];
        System.out.println("enter the array elements");

        for(int row=0; row< arr.length; row++){
            for(int col=0; col< arr[row].length; col++){
                arr[row][col] = sc.nextInt();

            }
        }



        int ans = max(arr); // format of return value {row, col}
        System.out.println("largest element is: " + ans);


    }

    static int max(int[][] arr1) {
        int max = Integer.MIN_VALUE;
        for (int row = 0; row < arr1.length; row++) {
            for (int col = 0; col < arr1[row].length; col++) {
                if (arr1[row][col] > max) {
                    max = arr1[row][col];
                 //we are using this line because here it is not declared like it is
                    // done above
                }
            }
        }
        return max;
    }
}
