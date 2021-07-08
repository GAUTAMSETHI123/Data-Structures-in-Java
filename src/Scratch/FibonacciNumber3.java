/*   Created by IntelliJ IDEA.
 *   Author: Gautam Sethi (GAUTAMSETHI123)
 *   Date: 08-07-2021
 *   Time: 12:59
 *   File: FibonacciNumber3.java
 */

package Scratch;

import java.util.Scanner;

public class FibonacciNumber3 {

    public static boolean checkNumber(int num, int check) {
        int a = 0;
        int b = 1;
        int c;


        for (int i = 1; i <= num-2; i++) {
            c = a + b;
            a = b;
            b = c;
            if (check == c || check==0)
                return true;
        }
        System.out.println();
        return false;
    }







    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        System.out.println("enter the number for the series");
        int num = scn.nextInt();
        System.out.println("enter the number you want to check");
        int check = scn.nextInt();
        boolean checkedNumber = checkNumber(num,check);

        if(checkedNumber == true){
            System.out.println("number belongs to fibonacci series");
        }
        else{
            System.out.println("number does not belong to fibonacci series");
        }

    }
}
