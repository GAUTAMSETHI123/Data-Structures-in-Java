/*   Created by IntelliJ IDEA.
 *   Author: Gautam Sethi (GAUTAMSETHI123)
 *   Date: 19-06-2021
 *   Time: 01:59
 *   File: CheckPrime.java
 */

package Scratch;

import java.util.Scanner;

import java.math.*;

public class CheckPrimes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number you want to check");
        int n = sc.nextInt();
        boolean flag = true;
        for(int i=2; i<=n/2; i++ ){
            if(n%i == 0){
                flag = false;
                break;
            }

            }
        if(flag){
            System.out.println("number is prime");
        }
        else{
            System.out.println("number is not prime");
        }



            }


        }





