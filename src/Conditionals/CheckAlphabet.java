/*   Created by IntelliJ IDEA.
 *   Author: Gautam Sethi (GAUTAMSETHI123)
 *   Date: 22-06-2021
 *   Time: 00:58
 *   File: CheckAlphabet.java
 */

package Conditionals;

import java.util.Scanner;

public class CheckAlphabet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the alphabet");
        char ch = scanner.nextLine().charAt(0);
        if(Character.isUpperCase(ch)){
            System.out.println("alphabet is capital");
        }
        else
            if(Character.isLowerCase(ch)) {
            System.out.println("alphabet is small case");
        }
        else{
            System.out.println("not a alphabet");
        }
    }
}
