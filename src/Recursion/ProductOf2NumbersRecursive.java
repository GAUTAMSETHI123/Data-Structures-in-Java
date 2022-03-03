/*   Created by IntelliJ IDEA.
 *   Author: Gautam Sethi (GAUTAMSETHI123)
 *   Date: 03-03-2022
 *   Time: 11:46
 *   File: ProductOf2NumbersRecursive.java
 */

package Recursion;

import java.util.Scanner;

public class ProductOf2NumbersRecursive {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int res = product(num1 ,num2);
        System.out.println(res);
    }

    static int product(int a , int b){
        if(b==1)
            return a;
        else
            return a +product(a,b-1);
    }
}
