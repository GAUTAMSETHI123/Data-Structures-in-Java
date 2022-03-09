/*   Created by IntelliJ IDEA.
 *   Author: Gautam Sethi (GAUTAMSETHI123)
 *   Date: 09-03-2022
 *   Time: 14:40
 *   File: SumOfNumbers.java
 */

package Recursion;

public class SumOfNumbers {
    public static void main(String[] args) {
        int ans = sum(5);
        System.out.println(ans);
    }

    public static int sum(int n){
        if(n<=1)
            return 1;
        return n+sum(n-1);
    }
}
