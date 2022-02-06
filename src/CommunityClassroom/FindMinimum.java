/*   Created by IntelliJ IDEA.
 *   Author: Gautam Sethi (GAUTAMSETHI123)
 *   Date: 06-02-2022
 *   Time: 11:44
 *   File: FindMinimum.java
 */

package CommunityClassroom;

import java.util.Scanner;

public class FindMinimum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of the array");
        int n = sc.nextInt();
        int [] arr = new int[n];
        System.out.println("enter array elements");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();

        }

        System.out.println("minimum element is " + findMinimum(arr,n));



        }
    static int findMinimum(int[]arr1, int size){
        int ans = arr1[0];
        for(int i=1; i<size; i++){
            if(arr1[i]<ans){
                ans = arr1[i];
            }
        }
        return ans;
    }
}
