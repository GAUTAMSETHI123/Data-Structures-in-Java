/*   Created by IntelliJ IDEA.
 *   Author: Gautam Sethi (GAUTAMSETHI123)
 *   Date: 03-02-2022
 *   Time: 11:10
 *   File: Arrays2D.java
 */

package MultiDimensionalArray;
import java.util.Arrays;
import java.util.Scanner;

public class Arrays2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int [][] arr = new int[3][3];

        for(int rows=0; rows< arr.length; rows++){
            for(int col=0; col< arr[rows].length; col++){
                arr[rows][col] = sc.nextInt();

            }
        }
//        for(int row=0; row< arr.length; row++){
//            for(int col=0; col< arr[row].length; col++){
//                System.out.print(arr[row][col] + " ");
//
//
//            }
//            System.out.println();  // output in matrix format
//        }


        for(int row=0; row<arr.length; row++){
            System.out.println(Arrays.toString(arr[row]));  //output in the array matrix format.

            }
        }


    }
