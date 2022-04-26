package Scratch;/*   Created by IntelliJ IDEA.
 *   Author: Gautam Sethi (GAUTAMSETHI123)
 *   Date: 10-05-2021
 *   Time: 23:15
 *   File: Scratch.Fibonacci.java
 */
import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter number");
        int N = scan.nextInt();
        int a =0;
        int b = 1;

        int counter = 1;
        while(counter <= N+1){
            System.out.println(a);
            int sum = a+b;
            a=b;
            b=sum;
            counter++;
        }

    }

}
