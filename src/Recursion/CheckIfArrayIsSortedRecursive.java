/*   Created by IntelliJ IDEA.
 *   Author: Gautam Sethi (GAUTAMSETHI123)
 *   Date: 14-03-2022
 *   Time: 23:03
 *   File: CheckIfArrayIsSortedRecursive.java
 */

package Recursion;

import java.util.Scanner;

public class CheckIfArrayIsSortedRecursive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of the array");
        int n = sc.nextInt();
        int [] A = new int[n];


        System.out.println("enter the elements ");
        for(int i=0; i<n; i++){
            A[i] = sc.nextInt();
        }

        boolean res = Sorted(A,n);
        System.out.println(res);

    }


    public static boolean Sorted(int[] array, int length) {
        if (array == null || length < 2)
            return true;
        if (array[length - 2] > array[length - 1])
            return false;
        return Sorted(array, length - 1);
    }


}
