/*   Created by IntelliJ IDEA.
 *   Author: Gautam Sethi (GAUTAMSETHI123)
 *   Date: 20-02-2022
 *   Time: 14:24
 *   File: Recursion.java
 */

package CommunityClassroom;

import java.sql.SQLOutput;

public class Recursion {
    public static void main(String[] args) {

        print(1);
    }

    static void print(int n){
        if(n==5){   //base condition
            System.out.println(5);
            return;
        }
        System.out.println(n);
        print(n+1);
    }
}
