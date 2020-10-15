package com.johnmsaylor;

import java.util.ArrayList;
import java.util.List;

public class QuickSort {

    public static List<Integer> quickSort(List<Integer> arr) {
        System.out.println(arr);
        if (arr.size() == 1)
            return arr;

        List<Integer> left = new ArrayList<>();
        List<Integer> right = new ArrayList<>();
        int pivot = arr.get(0);


        for (var number : arr) {
            if (number < pivot) {
                left.add(number);
            } else {
                right.add(number);
            }
        }
            quickSort(left);
            quickSort(right);

            left.add(pivot);

            for (var number : right) {
                left.add(number);
            }
return null;
//        return new ArrayList<>(quickSort(left), quickSort(right));
    }
}
