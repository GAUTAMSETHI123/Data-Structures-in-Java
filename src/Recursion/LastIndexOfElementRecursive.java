/*   Created by IntelliJ IDEA.
 *   Author: Gautam Sethi (GAUTAMSETHI123)
 *   Date: 30-03-2022
 *   Time: 23:06
 *   File: LastIndexOfElementRecursive.java
 */

package Recursion;

import com.sun.source.tree.ClassTree;

import java.util.Scanner;

public class LastIndexOfElementRecursive {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int [] arr = {1,2,3,2,4};
        int target1 = sc.nextInt();

        int res = lastIndex(arr, target1, arr.length-1);
        System.out.println(res);

    }

    public static int lastIndex(int [] arr1, int target1,int i){

        if(i<=0){
            return -1;
        }

        if(arr1[i] == target1){
            return i;
        }
        return lastIndex(arr1, target1,i-1);
    }

}
