/*   Created by IntelliJ IDEA.
 *   Author: Gautam Sethi (GAUTAMSETHI123)
 *   Date: 20-05-2021
 *   Time: 01:49
 *   File: DecimalToAnybase.java
 */

package Function;

import java.util.Scanner;

public class DecimalToAnybase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int srNo = scanner.nextInt();
        int dB = scanner.nextInt();
        int res = decimalToAnybase(srNo,dB);
        System.out.println(res);

    }

    public static int decimalToAnybase(int srcNo, int dBase){
        int multiplier = 1;
        int ans = 0;
        while(srcNo!=0){
            int rem = srcNo%dBase;
            ans = ans + (rem*multiplier);
            multiplier*=10;
            srcNo = srcNo/dBase;
        }
        return ans;
    }
}
