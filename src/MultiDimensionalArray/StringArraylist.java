/*   Created by IntelliJ IDEA.
 *   Author: Gautam Sethi (GAUTAMSETHI123)
 *   Date: 03-02-2022
 *   Time: 13:06
 *   File: StringArraylist.java
 */

package MultiDimensionalArray;

import java.util.ArrayList;
import java.util.Arrays;

public class StringInArraylist {
    public static void main(String[] args) {
        ArrayList<ArrayList<String>> ls2d = new ArrayList<>();
        ArrayList<String> x = new ArrayList<>();
        x.add("Hello");
        x.add("world!");
        ls2d.add(x);

        System.out.println(Arrays.deepToString(ls2d.toArray()));
    }
}
