package Recursion;/*   Created by IntelliJ IDEA.
 *   Author: Gautam Sethi (GAUTAMSETHI123)
 *   Date: 20-02-2022
 *   Time: 15:26
 *   File: FibonacciRecursion.java
 */

public class FibonacciRecursion {
    public static void main(String[] args) {
        int ans = fib(4);
        System.out.println(ans);
    }

    static int fib(int n ){
        if(n<2){
            return n;
        }
        return fib(n-1) + fib(n-2);
    }
}
