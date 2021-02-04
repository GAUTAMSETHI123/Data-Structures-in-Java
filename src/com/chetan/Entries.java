/*   Created by IntelliJ IDEA.
 *   Author: Gautam Sethi (GAUTAMSETHI123)
 *   Date: 03-02-2021
 *   Time: 10:31
 *   File: Entries.java
 */

package com.chetan;

import java.util.Scanner;

class info {
    private String name;
    private int money;
    private int adhaarno;

    public int setName(String n) {
        this.name = n;
        return 0;
    }

    public void setMoney(int m) {
        this.money = m;
    }

    public void setAdhaarno(int an) {
        this.adhaarno = an;
    }

    public String getName()
    {
        return name;
    }

    public int getMoney() {
        return money;
    }

    public int getAdhaarno() {
        return adhaarno;
    }
}

public class Entries
{
    public static void main(String[] args)
    {
        int arr[][] = new int[10][3];
        Scanner ask = new Scanner(System.in);
        info obj1 = new info();

        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter the name : ");
            arr[i][0] = obj1.setName(ask.next());
            ask.nextLine();
            System.out.print("Enter the money : ");
            obj1.setMoney(ask.nextInt());
            ask.nextLine();
            System.out.print("Enter the adhaarno. : ");
            obj1.setAdhaarno(ask.nextInt());
            ask.nextLine();
        }
        System.out.println();
    }
}
