/*   Created by IntelliJ IDEA.
 *   Author: Gautam Sethi (GAUTAMSETHI123)
 *   Date: 09-03-2022
 *   Time: 14:20
 *   File: PrintNumberInReverse.java
 */

package Recursion;

import java.util.Scanner;

public class PrintNumberInReverse {   // from 1 to n
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        funcRev(n);
    }


    public static void funcRev(int n){
        if(n==0){
            return;
        }

        funcRev(n-1);
        System.out.println(n);
    }
}
