/*   Created by IntelliJ IDEA.
 *   Author: Gautam Sethi (GAUTAMSETHI123)
 *   Date: 10-05-2021
 *   Time: 23:54
 *   File: ReverseNumber.java
 */

package Scratch;
import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the number you want to reverse");
        int n = scan.nextInt();
        int answer = 0;
        while(n!=0){
            int remainder = n%10;
            answer = answer*10+remainder;
            n = n/10;
        }
        System.out.print("reversed number is ");
        System.out.println(answer);
    }

}
