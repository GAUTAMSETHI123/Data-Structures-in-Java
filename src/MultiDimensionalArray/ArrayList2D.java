/*   Created by IntelliJ IDEA.
 *   Author: Gautam Sethi (GAUTAMSETHI123)
 *   Date: 03-02-2022
 *   Time: 12:51
 *   File: ArrayList2D.java
 */

package MultiDimensionalArray;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList2D {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<ArrayList<Integer>> list =  new ArrayList<>();

        for (int i = 0; i <3 ; i++) {
            list.add(new ArrayList<>());
            
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                list.get(i).add(scanner.nextInt());
                
            }
        }
        System.out.println(list);
    }
}
