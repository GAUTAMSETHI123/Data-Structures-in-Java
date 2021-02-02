/*   Created by IntelliJ IDEA.
 *   Author: Gautam Sethi (GAUTAMSETHI123)
 *   Date: 03-02-2021
 *   Time: 01:14
 *   File: ArrayMax.java
 */

package Scratch;

import java.util.Scanner;

public class ArrayMax {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("enter the size of the array");
        int n = scan.nextInt();

        int [] array = new int[n];

        System.out.println(returnMax(array));


    }


    public static int returnMax(int[] arr){
        int max= Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            arr[i] = scan.nextInt();
            if(arr[i] > max){
                max = arr[i];
            }
        }

        return max;

    }

    public static void display(int [] arr2){
        for (int val: arr2
             ) {
            System.out.println(val);
        }
    }
}
