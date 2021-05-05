/*   Created by IntelliJ IDEA.
 *   Author: Gautam Sethi (GAUTAMSETHI123)
 *   Date: 06-05-2021
 *   Time: 01:11
 *   File: SelectionSort.java
 */

package Scratch;

 import java.util.Scanner;

public class SelectionSort {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the size of the array");
        int N = scan.nextInt();
        int[] arr = new int[N];

        for (int k = 0; k < arr.length; k++) {
            arr[k] = scan.nextInt();
        }

        System.out.println("Array is");
        for (int val: arr
             ) {
            System.out.print(val + " ");
        }

        System.out.println();
        int[] ret = selectionSort(arr);
        System.out.println("sorted array is");
        for (int val1 : ret
             ) {
            System.out.print(val1 + " ");

        }

    }

    public static int[] selectionSort(int[] arr1){
        for(int i =0; i< arr1.length-1; i++){
            int min =i;
            for(int j=i+1; j< arr1.length; j++){
                {
                    if(arr1[j] < arr1[min]){
                        min=j;
                    }

                }
            if(min!=i){
                int temp = arr1[min];
                arr1[min] = arr1[i];
                arr1[i] = temp;
            }
            }
        }
        return arr1;

    }
}
