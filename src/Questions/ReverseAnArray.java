/*   Created by IntelliJ IDEA.
 *   Author: Gautam Sethi (GAUTAMSETHI123)
 *   Date: 22-05-2021
 *   Time: 00:01
 *   File: ReverseAnArray.java
 */

package Questions;

import java.util.Scanner;

public class ReverseAnArray {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("enter the size of the array");
        int size = scn.nextInt();
        int [] array = new int[size];

        for(int i=0; i<size; i++){
            array[i] = scn.nextInt();
        }

        for (int val:array
             ) {
            System.out.print(val+ " ");

        }
        int []res = reverse(array,0,size-1);

        System.out.println("reversed array is");

        for (int val1: res
             ) {
            System.out.print(val1+ " ");

        }
    }

    public static int[] reverse(int [] arr1, int start, int end){
        int temp;

        while(start < end){
            temp = arr1[start];
            arr1[start] = arr1[end];
            arr1[end] = temp;
            start++;
            end--;
        }

        return arr1;
    }
}
