/*   Created by IntelliJ IDEA.
 *   Author: Gautam Sethi (GAUTAMSETHI123)
 *   Date: 01-03-2022
 *   Time: 12:19
 *   File: PrintNumbersRecursion.java
 */

package Recursion;

import java.util.Scanner;

public class PrintNumbersRecursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int n = sc.nextInt();

        numRec(n);


    }

    public static void numRec(int n){
        if (n == 0)
        {
            return;

        }
        else
        {
            System.out.print(n + " ");

            // Recursive call of the function
            numRec(n - 1);
            //System.out.println("sethi");
        }
    }




}


