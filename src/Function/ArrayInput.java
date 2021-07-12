package Function;

import java.util.Scanner;

public class ArrayInput {
    public static int[] takeInput(int size){
        Scanner scn = new Scanner(System.in);

        int []arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = scn.nextInt();

        }
        return arr;

    }

    public static void print(int[] array){
        for (int val: array
             ) {
            System.out.print(val+" ");

        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the size of the array");
        int length = scanner.nextInt();
        int []ar1 = takeInput(length);
        print(ar1);
    }
}
