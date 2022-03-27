package Scratch;/*   Created by IntelliJ IDEA.
 *   Author: Gautam Sethi (GAUTAMSETHI123)
 *   Date: 29-06-2021
 *   Time: 01:00
 *   File: SumOrProduct.java
 */

import java.util.Scanner;

public class SumOrProduct {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("enter the number");
        int N = scan.nextInt();
        System.out.println("enter the choice");
        int C = scan.nextInt();
        if(C==1){
            int sum =0;
            for (int i = 1; i <=N ; i++) {
                sum = sum+i;
            }
            System.out.println(sum);
        }
        else if(C==2){
            int product = 1;
            for(int j = 1; j<=N; j++){
                product = product*j;
            }
            System.out.println(product);
        }
        else{
            System.out.println("-1");
        }

    }
}
