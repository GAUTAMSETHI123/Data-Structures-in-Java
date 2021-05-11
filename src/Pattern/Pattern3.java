/*   Created by IntelliJ IDEA.
 *   Author: Gautam Sethi (GAUTAMSETHI123)
 *   Date: 11-05-2021
 *   Time: 20:16
 *   File: Pattern3.java
 */

package Pattern;
import java.util.Scanner;

public class Pattern3 {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.println("enter the number of rows");
        int row = scn.nextInt();
        System.out.println("enter the number of columns");
        int column = scn.nextInt();
        for(int i =0; i<row; i++){
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");

            }
            System.out.println();
        }

    }
}
