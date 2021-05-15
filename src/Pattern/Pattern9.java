/*   Created by IntelliJ IDEA.
 *   Author: Gautam Sethi (GAUTAMSETHI123)
 *   Date: 15-05-2021
 *   Time: 09:20
 *   File: Pattern9.java
 */

package Pattern;
import java.util.Scanner;

public class Pattern9 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("enter the number of rows");
        int rows = scn.nextInt();
        for(int i=1; i<=rows; i++){
            for(int j=rows; j>i; j--){
                System.out.print(" ");
            }
            for(int k=1; k<=i; k++){
                System.out.print(" *");
            }

            System.out.println();
        }


    }

}
