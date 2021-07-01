/*   Created by IntelliJ IDEA.
 *   Author: Gautam Sethi (GAUTAMSETHI123)
 *   Date: 01-07-2021
 *   Time: 12:29
 *   File: FibonacciNumber.java
 */

package Scratch;

import java.util.Scanner;





public class FibonacciNumber {
    public static int fibNumber(int input){
        if(input==1){
            return 1;
        }
        else if(input==2) {
            return 1;
        }
        else if(input==3){
            return 2;
        }
        else{
            return fibNumber(input-1) + fibNumber(input-2);
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int num, result;
        num = scn.nextInt();
        result = fibNumber(num);
        System.out.println(result);

    }
}

