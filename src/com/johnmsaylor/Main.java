package com.johnmsaylor;
import com.johnmsaylor.medium.CompositeNumbers;

import java.util.Arrays;


public class Main {

    public static void main(String[] args) {

        long[] result = CompositeNumbers.bonetrousle(12,6, 3);

        System.out.println(Arrays.toString(result));
        System.out.println(Arrays.stream(result).sum());
    }

}
