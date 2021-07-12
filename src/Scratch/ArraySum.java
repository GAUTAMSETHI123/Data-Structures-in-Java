package Scratch;

import java.util.Scanner;

public class ArraySum {
    public static int arrSum(){
        Scanner scn = new Scanner(System.in);
        int size = scn.nextInt();
        int[] array = new int[size];
        int sum =0;
        for (int i = 0; i < size ; i++) {
            array[i] = scn.nextInt();
            sum = sum + array[i];
        }

        return sum ;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int sum1 = arrSum();
        System.out.println(sum1);
    }
}
