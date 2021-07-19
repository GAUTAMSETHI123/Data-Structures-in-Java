/*   Created by IntelliJ IDEA.
 *   Author: Gautam Sethi (GAUTAMSETHI123)
 *   Date: 19-07-2021
 *   Time: 11:32
 *   File: ArrayIntersection.java
 */

package Scratch;

import java.util.Scanner;

public class ArrayIntersection {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("enter the size of the first array");
        int N = scn.nextInt();
        int[] arr = new int[N];
        System.out.println("enter elements for first array");
        int i;
        for(i =0; i<N; i++){
            arr[i] = scn.nextInt();

        }
        for (int val: arr
             ) {
            System.out.print(val+" ");

        }
        System.out.println();
        System.out.println("enter the size of the second array");
        int N2  = scn.nextInt();
        int [] arr2 = new int[N2];
        System.out.println("enter the elements for second array");

        int j;
        for(j=0; j<N2; j++){
            arr2[j] = scn.nextInt();

        }
        for (int val2: arr2
        ) {
            System.out.print(val2+ " ");

        }
        System.out.println();

        System.out.println("array intersection is");

        for(i=0; i<N; i++){
            for(j=0; j<N2; j++){
                if(arr2[j] == arr[i]){
                    System.out.print(arr[i]+ " ");

                }
            }
        }


    }
}
