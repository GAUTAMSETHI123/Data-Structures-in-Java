/*   Created by IntelliJ IDEA.
 *   Author: Gautam Sethi (GAUTAMSETHI123)
 *   Date: 05-02-2021
 *   Time: 02:35
 *   File: LinearSearch.java
 */

package Scratch;

import java.util.Scanner;


public class LinearSearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the size of the array");
        int n = scanner.nextInt();

        int [] arr = new int[n];

        System.out.println("enter array elements");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();

        }

        System.out.println("enter the item you want to search");
        int item = scanner.nextInt();

        int result = search(arr,item);

        if(result == -1){
            System.out.println("element is not present in the list");
        }
        else {
            System.out.println(result + "is present in the list");
        }

    }

    public static int search(int[]arr1 , int item){


        for (int i = 0; i < arr1.length; i++) {
            if(arr1[i] == item){
                return arr1[i];

            }

        }
        return -1;
    }
}
