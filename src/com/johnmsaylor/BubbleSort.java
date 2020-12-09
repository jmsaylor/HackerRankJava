package com.johnmsaylor;

public class BubbleSort {

    public static void countSwaps(int[] a){

        int totalSwaps = 0;

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length - 1; j++) {
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                    totalSwaps++;
                }
            }
        }
        System.out.printf("Array is sorted in %d swaps.\n", totalSwaps);
        System.out.printf("First Element: %d\n", a[0]);
        System.out.printf("Last Element: %d", a[a.length - 1]);
    }

}
