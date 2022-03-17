/*   Created by IntelliJ IDEA.
 *   Author: Gautam Sethi (GAUTAMSETHI123)
 *   Date: 17-03-2022
 *   Time: 20:35
 *   File: LinearSearchRecursive.java
 */

package Recursion;

public class LinearSearchRecursive {
    public static void main(String[] args) {

        int [] arr = {1,4,3,6,9};
        int res = indexFind(arr, 3, 0);
        System.out.println(res);

    }


    public static int  indexFind(int [] arr , int target, int index){
        if(index == arr.length-1){
            return -1;
        }

        if(arr[index] == target){
            return index;
        }
        else{
            return indexFind(arr, target, index+1);
        }
    }
}
