/*   Created by IntelliJ IDEA.
 *   Author: Gautam Sethi (GAUTAMSETHI123)
 *   Date: 05-02-2022
 *   Time: 01:15
 *   File: FindCharacter.java
 */

package CommunityClassroom;

import java.util.Scanner;

public class FindCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the name ");
        String str = sc.nextLine();
        System.out.println("enter the character you want to check");
        char c = sc.next().charAt(0);
        boolean result = checkChar(str,c);
        if(result == true){
            System.out.println("character is present in the string");
        }
        else
            System.out.println("character is not present in the string");


    }

    static boolean checkChar(String name1, char c1){
        if(name1.length()==0) {
            return false;
        }

        for(int i=0; i<name1.length(); i++){
            if(name1.charAt(i)== c1){
                return true;
            }
        }
        return false;
    }


}
