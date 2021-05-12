/*   Created by IntelliJ IDEA.
 *   Author: Gautam Sethi (GAUTAMSETHI123)
 *   Date: 12-05-2021
 *   Time: 20:32
 *   File: Pattern5.java
 */

package Pattern;
import java.util.Scanner;

public class Pattern5 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("enter the number of rows");
        int rows = scn.nextInt();
        System.out.println("enter the number of columns");
        int columns = scn.nextInt();
        for(int i = 0; i<rows; i++){
            for (int j = rows-1; j>i; j--) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i ; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
