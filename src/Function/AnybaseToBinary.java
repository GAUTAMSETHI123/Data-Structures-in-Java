/*   Created by IntelliJ IDEA.
 *   Author: Gautam Sethi (GAUTAMSETHI123)
 *   Date: 20-05-2021
 *   Time: 01:29
 *   File: AnybaseToBinary.java
 */

package Function;

import java.util.Scanner;

public class AnybaseToBinary {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int src = scn.nextInt();
        int srcB = scn.nextInt();
        int res = anybaseToBinary(src,srcB);
        System.out.println(res);

    }


    public static int anybaseToBinary(int srcNo , int srcBase){
        int multiplier = 1;
        int ans =0;
        while(srcNo!=0){
            int rem = srcNo%10;
            ans = ans + (rem*multiplier);
            multiplier*=srcBase;
            srcNo/=10;

        }
        return ans;
    }
}
