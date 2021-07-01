/*   Created by IntelliJ IDEA.
*   Author: Gautam Sethi (GAUTAMSETHI123)
*   Date: 01-07-2021
*   Time: 13:26
*   File: FibonacciNumber2.java
*/

package Scratch;

import java.util.Scanner;

public class FibonacciNumber2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("enter the number");
        int n = scn.nextInt();
        int a = 1;
        int b = 1;
        if(n==1 || n==2){
            System.out.println(a);
        }
        else{
            int c = 0;
            for(int i =3; i<=n; i++){
                 c=a+b;
                 a=b;
                 b=c;
            }
            System.out.println(c);
        }

    }
}
