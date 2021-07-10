package Scratch;

import java.util.Scanner;


public class PrimeTillN{
    public static void printPrimes(int n) {
        System.out.println("enter the number");

        for (int i = 2; i <= n; i++) {
            boolean flag = true;
            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag){
                System.out.println(i);
        }}
    }


    public static void main(String[] args) {
                    Scanner scn = new Scanner(System.in);
        System.out.println("enter the number");

                    int num = scn.nextInt();
                    printPrimes(num);
                }



    }






