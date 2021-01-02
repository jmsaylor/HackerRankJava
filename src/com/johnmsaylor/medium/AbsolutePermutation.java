package com.johnmsaylor.medium;

public class AbsolutePermutation {

    static int[] absolutePermutation(int n, int k) {
        boolean[] table = new boolean[n + 1];
        int[] result = new int[n];

        for (int i = 0; i < n; i++) {
            int num = i + 1;
            if ( num - k > 0 && table[num - k] != true) {
                result[i] = num - k;
                table[num - k] = true;
            } else if (num + k <= n && table[num + k] != true) {
                result[i] = num + k;
                table[num + k] = true;
            } else {
                return new int[]{-1};
            }
        }
        return result;
    }

}
