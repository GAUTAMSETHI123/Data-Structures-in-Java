/*   Created by IntelliJ IDEA.
 *   Author: Gautam Sethi (GAUTAMSETHI123)
 *   Date: 09-03-2022
 *   Time: 15:05
 *   File: ProductOfDigitsOfNumber.java
 */

package Recursion;

public class ProductOfDigitsOfNumber {
    public static void main(String[] args) {
        int res = sumOfDigits(1340);
        System.out.println(res);
    }

    public static int sumOfDigits(int n){
        if(n%10 == n){
            return n;

        }
        return (n%10) * sumOfDigits(n/10);
    }
}
