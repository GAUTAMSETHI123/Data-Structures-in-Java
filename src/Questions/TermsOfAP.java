/*   Created by IntelliJ IDEA.
 *   Author: Gautam Sethi (GAUTAMSETHI123)
 *   Date: 29-06-2021
 *   Time: 01:20
 *   File: TermsOfAP.java
 */

package Questions;

import java.util.Scanner;

public class TermsOfAP {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("enter the number");
        int N = scn.nextInt();
        int x;
        for (int i = 1; i < N + (N / 2); i++) {
            x = (i * 3) + 2;
            if ((x % 4) != 0) {
                System.out.print(x + " ");
            }


        }

    }
}