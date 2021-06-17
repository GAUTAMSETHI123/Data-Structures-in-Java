/*   Created by IntelliJ IDEA.
 *   Author: Gautam Sethi (GAUTAMSETHI123)
 *   Date: 17-06-2021
 *   Time: 22:48
 *   File: validTriangle.java
 */

package Flowcharts;

public class validTriangle {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 40;
        if((a+b > c) && (a+c >b) && (b+c > a)){
            System.out.println("triangle is valid");
        }
        else{
            System.out.println("not valid");
        }
    }
}
