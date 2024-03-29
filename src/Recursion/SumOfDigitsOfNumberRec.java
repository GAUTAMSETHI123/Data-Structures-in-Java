/*   Created by IntelliJ IDEA.
 *   Author: Gautam Sethi (GAUTAMSETHI123)
 *   Date: 09-03-2022
 *   Time: 14:53
 *   File: SumOfDigitsOfNumberRec.java
 */

package Recursion;

public class SumOfDigitsOfNumberRec {
    public static void main(String[] args) {
        int res = sumOfDigits(1340);
        System.out.println(res);
    }

    public static int sumOfDigits(int n){
        if(n ==0){
            return 0;

        }
        return (n%10) + sumOfDigits(n/10);
    }
}
