/*   Created by IntelliJ IDEA.
 *   Author: Gautam Sethi (GAUTAMSETHI123)
 *   Date: 13-05-2021
 *   Time: 12:47
 *   File: Pattern8.java
 */

package Pattern;

import java.util.Scanner;

public class Pattern8 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("enter the number of rows");
        int rows = scn.nextInt();  //taking input for no of rows
        for(int i=1;i<=rows; i++){
            for (int j=rows; j>=i; j--) {
                System.out.print("*");
            }
            System.out.print(" ");

            for(int j=0; j<(2*i-2); j++) {
                System.out.print(" ");
            }
            for(int k=i; k<=rows; k++){
                System.out.print("*");
            }
            System.out.println(); // next line
        }
        System.out.println();
        for (int i = 1; i <= rows ; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print("*");
            }
            System.out.print(" ");
            for (int p =(2*i-2) ; p <(2*rows-2) ; p++) {
                System.out.print(" ");
            }
            for (int j = 1; j <=i ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
