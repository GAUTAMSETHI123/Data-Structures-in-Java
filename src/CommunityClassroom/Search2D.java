/*   Created by IntelliJ IDEA.
 *   Author: Gautam Sethi (GAUTAMSETHI123)
 *   Date: 06-02-2022
 *   Time: 12:04
 *   File: Search2D.java
 */

package CommunityClassroom;

import java.util.Arrays;
import java.util.Scanner;

public class Search2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[3][3];
        System.out.println("enter the array elements");

        for(int row=0; row< arr.length; row++){
            for(int col=0; col< arr[row].length; col++){
                arr[row][col] = sc.nextInt();

            }
        }

        System.out.println("enter the target element");
        int target = sc.nextInt();
        int[] ans = search(arr, target); // format of return value {row, col}
        System.out.println(Arrays.toString(ans));


    }

    static int[] search(int[][] arr, int target) {
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] == target) {
                    return new int[]{row, col};  //we are using this line because here it is not declared like it is
                    // done above
                }
            }
        }
        return new int[]{-1, -1};
    }
}

