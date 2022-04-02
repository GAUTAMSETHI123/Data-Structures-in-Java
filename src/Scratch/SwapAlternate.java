package Scratch;

import java.util.Scanner;

public class SwappingAlternate {
    public static int[] takeInput(int size){
        Scanner scn = new Scanner(System.in);

        int []arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = scn.nextInt();

        }
        return arr;

    }

    public static int[] swap(int[] array){
        for (int i = 0; i <= array.length-1; i=i+2) {
            int temp = array[i];
            array[i] = array[i+1];
            array[i+1] = temp;

        }
        return array;
    }
    public static void print(int[] array1){
        for (int val: array1
        ) {
            System.out.print(val+" ");

        }
    }

    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int size1 = scn.nextInt();
        int[] arr1 = takeInput(size1);
        print(arr1);
        System.out.println();
        int[] arr2 = swap(arr1);
        print(arr2);
    }
}
