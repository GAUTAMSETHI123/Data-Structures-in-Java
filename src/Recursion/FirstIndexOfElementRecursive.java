/*   Created by IntelliJ IDEA.
 *   Author: Gautam Sethi (GAUTAMSETHI123)
 *   Date: 30-03-2022
 *   Time: 23:05
 *   File: FirstIndexOfElementRecursive.java
 */

package Recursion;

import java.util.Scanner;

public class FirstIndexOfElementRecursive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int [] arr = {1,2,3,2,4};
        int target = sc.nextInt();

        int res = firstIndex(arr, target,0);
        System.out.println(res);

    }

    public static int firstIndex(int [] arr1, int target1,int i){
        if(i > arr1.length){
            return -1;
        }

        if(arr1[i] == target1){
            return i;
        }
        return firstIndex(arr1, target1,i+1);
    }




}
