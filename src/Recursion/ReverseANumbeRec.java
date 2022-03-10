/*   Created by IntelliJ IDEA.
 *   Author: Gautam Sethi (GAUTAMSETHI123)
 *   Date: 09-03-2022
 *   Time: 18:39
 *   File: ReverseANumbeRec.java
 */

package Recursion;

import java.util.Scanner;

public class ReverseANumbeRec {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        funcRec(n);
    }

    public static void funcRec(int n){
        if(n<10){
            System.out.println(n);
            return;
        }

        System.out.print(n%10);
        funcRec(n/10);
    }
}
