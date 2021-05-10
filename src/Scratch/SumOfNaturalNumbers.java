/*   Created by IntelliJ IDEA.
 *   Author: Gautam Sethi (GAUTAMSETHI123)
 *   Date: 10-05-2021
 *   Time: 20:40
 *   File: SumOfNaturalNumbers.java
 */

package Scratch;
import java.util.Scanner;

public class SumOfNaturalNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println(" sum of how many natural numbers?");
        int n = scan.nextInt();
        int counter = 1;
        int sum = 0;
        while (counter <=n){
            sum = sum + counter;
            counter = counter+1;
        }

        System.out.println(" sum of " + n + " Natural numbers is " + sum);

    }
}
