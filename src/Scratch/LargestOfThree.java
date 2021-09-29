/*   Created by IntelliJ IDEA.
 *   Author: Gautam Sethi (GAUTAMSETHI123)
 *   Date: 30-09-2021
 *   Time: 01:46
 *   File: LargestOfThree.java
 */

package Scratch;

import java.util.Scanner;


public class LargestOfThree {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int b = scn.nextInt();
        int c = scn.nextInt();

        int max = a;
        if(b>max){
            max =b;

        }

        if(c> max){
            max = c;
        }

        System.out.println(max);

    }
}
