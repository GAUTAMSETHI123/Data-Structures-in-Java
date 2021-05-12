/*   Created by IntelliJ IDEA.
 *   Author: Gautam Sethi (GAUTAMSETHI123)
 *   Date: 12-05-2021
 *   Time: 18:43
 *   File: Pattern4.java
 */

package Pattern;
import java.util.Scanner;

public class Pattern4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int rows = scan.nextInt();
        System.out.println("enter the number of columns");
        int columns = scan.nextInt();
        for(int i=rows; i>0; i--){
            for (int j = 0; j<i; j++) {
                System.out.print("* ");
                
            }
            System.out.println();
        }
    }
}
