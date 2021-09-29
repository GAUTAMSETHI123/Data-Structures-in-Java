/*   Created by IntelliJ IDEA.
 *   Author: Gautam Sethi (GAUTAMSETHI123)
 *   Date: 30-09-2021
 *   Time: 03:06
 *   File: CalculatorProgram.java
 */

package CommunityClassroom;

import java.util.Scanner;

public class CalculatorProgram {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int ans =0;
        while(true){
            System.out.println("enter the operator");
            char op = scn.next().trim().charAt(0);

            if(op == '+' || op == '-' || op == '*' || op == '/') {
                System.out.println("enter first number");
                int a = scn.nextInt();
                System.out.println("enter second number ");
                int b = scn.nextInt();
                if (op == '+') {
                    ans = a + b;
                }
                if (op == '-') {
                    ans = a - b;
                }
                if (op == '*') {
                    ans = a * b;
                }
                if (op == '/') {
                    if (b != 0) {
                        ans = a / b;
                    }
                }
            }
            else if(op == 'x' || op == 'X'){
                break;
            }
            else {
                System.out.println("invalid operator");
            }

            System.out.println(ans);

        }

    }
}
