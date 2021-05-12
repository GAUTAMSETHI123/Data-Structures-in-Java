/*   Created by IntelliJ IDEA.
 *   Author: Gautam Sethi (GAUTAMSETHI123)
 *   Date: 12-05-2021
 *   Time: 23:54
 *   File: Pattern6.java
 */

package Pattern;
import java.util.Scanner;

public class Pattern6 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("enter number of rows");
        int rows = scn.nextInt();
        for(int i=0; i<rows; i++){
            for (int j = 0; j<i ; j++)
            {
                System.out.print(" ");
            }
            for(int k=i; k<rows; k++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
