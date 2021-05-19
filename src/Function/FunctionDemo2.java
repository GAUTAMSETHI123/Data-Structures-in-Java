/*   Created by IntelliJ IDEA.
 *   Author: Gautam Sethi (GAUTAMSETHI123)
 *   Date: 19-05-2021
 *   Time: 19:12
 *   File: FunctionDemo2.java
 */

package Function;

public class FunctionDemo2 {
    public static void main(String[] args) {
        int sum1 = sum(17,19);
        if(sum1> 78){
            System.out.println("hi");
        }
        else{
            System.out.println("byee");
        }

    }

    public static int sum(int a , int b){
        int sum = a+b;
        System.out.println(sum);
        return sum;
    }
}
