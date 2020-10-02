package com.johnmsaylor;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        int[] arr = {3, 1, -1, -5, 10, 4, 7, 8, -100, 6, 2, 9, 5};

        int[] left = {2, 5};
        int[] right = {1, 3, 4};

//        int[] sorted = MergeSort.mergeSort(arr);
//
//        for (int i = 0; i < sorted.length; i++) {
//            System.out.print(sorted[i]);
//        }
//        MergeSort.merge(left, right);
            MergeSort.mergeSort(arr);
    }
}
