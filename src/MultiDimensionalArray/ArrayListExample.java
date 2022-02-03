/*   Created by IntelliJ IDEA.
 *   Author: Gautam Sethi (GAUTAMSETHI123)
 *   Date: 03-02-2022
 *   Time: 12:09
 *   File: ArrayList.java
 */

package MultiDimensionalArray;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list  = new ArrayList<>();
//        list.add(10);
//        list.add(15);
//        list.add(20);
//        list.add(23);
//        list.add(24);
//        list.add(25);

        for (int i = 0; i < 5; i++) {
            list.add(sc.nextInt());
            
        }

        for (int i = 0; i < 5; i++) {
            System.out.print(list.get(i)+ " ");

        }

    }
}
