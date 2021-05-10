/*   Created by IntelliJ IDEA.
 *   Author: Gautam Sethi (GAUTAMSETHI123)
 *   Date: 10-05-2021
 *   Time: 20:40
 *   File: PrimeNumber.java
 */

package Scratch;
import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the number you want to check");
        int n = scanner.nextInt();
        int counter = n-1;
        boolean flag = true;
        int divisor =2;
        while(divisor < n-1){
            if(n% divisor == 0){
                flag = false;
            }
            divisor++;
        }

        if(flag == true){
            System.out.println(n + " is prime");
        }
        else{
            System.out.println(n + " is not prime");
        }
    }
}
