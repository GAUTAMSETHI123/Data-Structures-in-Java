/*   Created by IntelliJ IDEA.
 *   Author: Gautam Sethi (GAUTAMSETHI123)
 *   Date: 04-04-2022
 *   Time: 23:55
 *   File: KadaneAlgorithm.java
 */

package Questions;


import java.util.*;
import java.lang.*;
import java.io.*;
    class Main {
        public static int maximumSubarraySum(int[] arr) {
            int n = arr.length;
            int maxSum = Integer.MIN_VALUE;

            for (int i = 0; i <= n - 1; i++) {
                int currSum = 0;
                for (int j = i; j <= n - 1; j++) {
                    currSum += arr[j];
                    if (currSum > maxSum) {
                        maxSum = currSum;
                    }
                }
            }

            return maxSum;
        }
        public static void main(String args[]) {
            // Your code goes here
            int a[] = {1, 3, 8, -2, 6, -8, 5};
            System.out.println(maximumSubarraySum(a));
        }
    }

