package com.johnmsaylor;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.IntStream;

public class MergeSort {

    public static int[] mergeSort(int[] arr) {
        if (arr.length == 1)
            return arr;
        int middle = arr.length / 2;


        int[] left = Arrays.copyOfRange(arr, 0, middle);
        int[] right = Arrays.copyOfRange(arr, middle, arr.length);

        printArray(left, "left");
        printArray(right, "right");

        return merge(mergeSort(left), mergeSort(right));
    }

    public static int[] merge(int[] left, int[] right) {
        int[] resultArray = new int[(left.length + right.length)];
        int leftIndex = 0;
        int rightIndex = 0;
        int resultIndex = 0;

        while (leftIndex < left.length && rightIndex < right.length) {
            if (left[leftIndex] < right[rightIndex]) {
                resultArray[resultIndex] = left[leftIndex++];
            } else {
                resultArray[resultIndex] = right[rightIndex++];
            }
            resultIndex++;
        }

        while (leftIndex < left.length) {
            resultArray[resultIndex] = left[leftIndex++];
            resultIndex++;
        }

        while (rightIndex < right.length) {
            resultArray[resultIndex] = right[rightIndex++];
            resultIndex++;
        }

        printArray(resultArray, "result array");
        return resultArray;
    }
    
    public static void printArray(int[] arr, String message) {
        System.out.print(message + " ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}

