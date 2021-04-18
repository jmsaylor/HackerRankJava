package com.johnmsaylor.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FraudActivity {

    public static void main(String[] args) {
//        activityNotifications(new int[]{10, 20, 30, 40, 50}, 3);
//        activityNotifications(new int[]{2, 3, 4, 2, 3, 6, 8, 4, 5}, 5);
        activityNotifications(new int[]{1, 2, 3, 4, 4}, 4);
    }

    static int activityNotifications(int[] expenditure, int d) {
        System.out.println(Arrays.toString(expenditure));
        int totalWarnings = 0;
        for (int i = d; i < expenditure.length; i++) {
            List<Integer> history = new ArrayList<>();
            for (int back = i - d; back < i; back++) {
                history.add(expenditure[back]);
            }
            Collections.sort(history);
            int len = history.size();
            System.out.println(len/2);
            float median = len % 2 == 0
                    ? ((history.get(len/2) + history.get(len/2-1)) / (float) 2)
                    : history.get(len/2);
            if (expenditure[i] >= median * 2) {
                totalWarnings++;
            }
            System.out.println(history + " " + median);
        }

        return totalWarnings;
    }
}
