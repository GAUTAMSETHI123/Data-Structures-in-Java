/*   Created by IntelliJ IDEA.
 *   Author: Gautam Sethi (GAUTAMSETHI123)
 *   Date: 05-02-2021
 *   Time: 02:56
 *   File: BinarySearch.java
 */

package Scratch;

import static java.util.Arrays.binarySearch;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {10, 14, 17, 23, 34, 56, 58, 60};
        System.out.println(binarySearch(arr, 67));
    }


    public static int binarySearch(int[]arr1, int item){
        int li = 0;
        int hi = arr1.length -1;

        while(li<=hi){
            int mid = (li+hi)/2;
            if(arr1[mid]== item)
                return mid;
            else if(arr1[mid] < item)
                 li=mid+1;
            else
                 hi = mid-1;

        }
        return -1;
    }
}
