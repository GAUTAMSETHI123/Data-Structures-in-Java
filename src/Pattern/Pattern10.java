/*   Created by IntelliJ IDEA.
 *   Author: Gautam Sethi (GAUTAMSETHI123)
 *   Date: 15-05-2021
 *   Time: 09:52
 *   File: Pattern10.java
 */

package Pattern;
import java.util.Scanner;

public class Pattern10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the number of rows");
        int rows = scanner.nextInt();
        for(int i=1; i<=rows; i++){
            for(int j=rows; j>i; j--){
                System.out.print(" ");
            }
            for(int k=1; k<=i; k++){
                System.out.print(" *");
            }

            System.out.println();
        }


        for(int i=1; i<=rows+1; i++){
            for(int j = 1; j<i; j++){
                System.out.print(" ");

            }
            for(int k= i; k<=rows+1; k++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

}
