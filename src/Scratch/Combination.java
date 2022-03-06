/*   Created by IntelliJ IDEA.
 *   Author: Gautam Sethi (GAUTAMSETHI123)
 *   Date: 05-07-2021
 *   Time: 22:34
 *   File: Combination.java
 */

package Scratch;

import java.util.Scanner;

public class Combination {

    public static int factorialIterative(int n) {
        int ans = 1;
        for (int i = 1; i <= n; i++) {
            ans = ans * i;

        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        int n = scan.nextInt();
        int r = scan.nextInt();

        int num = factorialIterative(n);

        int num2 = factorialIterative(r);

        int num3 = factorialIterative(n - r);
        int num4 = num / (num2 * num3);
        System.out.println(num4);

    }
}
