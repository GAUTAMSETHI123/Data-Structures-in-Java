/*   Created by IntelliJ IDEA.
 *   Author: Gautam Sethi (GAUTAMSETHI123)
 *   Date: 29-06-2021
 *   Time: 23:54
 *   File: SquareRoot.java
 */

package Conditionals;
import java.lang.Math;

import java.util.Scanner;

public class SquareRoot {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("enter the number ");
        double N = scn.nextInt();
        double value;
        value = Math.sqrt(N);
        int changed = (int)value;
        System.out.println("square root of the number is " + changed);

    }
}
