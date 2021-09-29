/*   Created by IntelliJ IDEA.
 *   Author: Gautam Sethi (GAUTAMSETHI123)
 *   Date: 30-09-2021
 *   Time: 02:50
 *   File: FindDuplicate.java
 */

package CommunityClassroom;

import java.util.Scanner;

public class FindDuplicate {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int number = 564345;
        System.out.println("enter the number whose count you want");
        int n = scn.nextInt();

        int count =0;
        while(number>0){
            int remainder = number%10;
            if(remainder == n){
                count++;
            }
            number = number/10;
        }
        System.out.println(count);
    }
}
