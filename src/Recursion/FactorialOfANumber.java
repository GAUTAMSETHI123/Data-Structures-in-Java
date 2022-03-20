/*   Created by IntelliJ IDEA.
 *   Author: Gautam Sethi (GAUTAMSETHI123)
 *   Date: 09-03-2022
 *   Time: 14:37
 *   File: Factorial.java
 */

package Recursion;

public class FactorialOfANumber {
    public static void main(String[] args) {
        int ans = fact(5);
        System.out.println(ans);

    }

    public static int fact(int n){
        if(n<=1){
            return 1;

        }
        return n* fact(n-1);
    }
}
