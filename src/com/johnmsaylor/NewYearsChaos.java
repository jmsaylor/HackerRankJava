package com.johnmsaylor;

public class NewYearsChaos {
    public static void minimumBribes(int[] q) {
        int bribes = 0;
        for (int i = 1; i < q.length; i++) {
            if (q[i - 1] > i + 2) {
                System.out.println("Too chaotic");
                System.exit(1);
            }
        }
        for (int i = q.length - 1; i > 0; i--) {
            for (int j = i; j >= Math.max(0, i - 2); j--) {
                if (q[j] > q[i]) {
                    int temp = q[j];
                    q[j] = q[i];
                    q[i] = temp;
                    bribes++;
                }
            }
        }
        System.out.println(bribes);
    }
}
