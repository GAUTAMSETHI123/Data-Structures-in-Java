/*   Created by IntelliJ IDEA.
 *   Author: Gautam Sethi (GAUTAMSETHI123)
 *   Date: 03-02-2021
 *   Time: 00:40
 *   File: ArrayOps.java
 */

package Scratch;

import java.util.Scanner;

public class ArrayOps {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("enter the size of the array");
        int n = scan.nextInt();

        int [] array = new int[n];


       int[] arr1 = takeInput();
       display(arr1);



    }

    public static int[] takeInput(){

        int n = scan.nextInt();

        int [] array = new int[n];



        for (int i = 0; i < array.length; i++) {
            System.out.println("the value at index " + i + "is");
            array[i] = scan.nextInt();

        }
        return array;
    }

    public static void display(int[] arr){
        for (int val : arr) {
            System.out.println(val);

        }

    }
}


