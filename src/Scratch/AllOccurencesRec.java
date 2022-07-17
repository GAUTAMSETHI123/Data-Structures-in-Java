/*   Created by IntelliJ IDEA.
 *   Author: Gautam Sethi (GAUTAMSETHI123)
 *   Date: 17-07-2022
 *   Time: 20:05
 *   File: AllOccurencesRec.java
 */

package Scratch;

import java.util.Arrays;

public class AllOccurencesRec {
    public static int[] allOccurences(int[] arr, int n , int search, int current, int count){
        if(current==n){
            return new int [count];

        }
        if(arr[current]== search ){
            int[] arri = allOccurences(arr, n , search,current+1, count+1);
            arri[count] = current;
            return arri;

        }else{
            int[] arri = allOccurences(arr, n , search,current+1, count);
            return arri;

        }

    }


    public static void main(String[] args) {
        int [] arr = {1,2,4,2,5,2};
        int n = 6;
        int[] array = allOccurences(arr,n,2,0,0);
        System.out.println(Arrays.toString(array));
    }
}
