/*   Created by IntelliJ IDEA.
 *   Author: Gautam Sethi (GAUTAMSETHI123)
 *   Date: 13-03-2022
 *   Time: 22:50
 *   File: CheckIfArrayIsSorted.java
 */

package Scratch;

import java.util.Scanner;

public class CheckIfArrayIsSorted {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of the array");
        int n = sc.nextInt();
        int [] A = new int[n];


        System.out.println("enter the elements ");
        for(int i=0; i<n; i++){
            A[i] = sc.nextInt();
        }

        boolean res = func(A);
        System.out.println(res);



    }

    public static boolean func(int [] a){
        // base case
        if (a == null || a.length <= 1) {
            return true;
        }

        for(int i=0; i<a.length-1; i++){
            if(a[i] > a[i+1]){
                return false;
            }
        }
        return true;
    }
}
