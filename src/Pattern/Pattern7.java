/*   Created by IntelliJ IDEA.
 *   Author: Gautam Sethi (GAUTAMSETHI123)
 *   Date: 13-05-2021
 *   Time: 11:51
 *   File: Pattern7.java
 */

package Pattern;
import java.util.Scanner;

public class Pattern7 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("enter the number of rows");
        int n = scn.nextInt();
        for (int i = 0; i <= (n - 1) / 2; i++) {
            for(int j=0; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=((n-1)/2)+1; i<n; i++)
        {
            for(int j =i; j<n; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
