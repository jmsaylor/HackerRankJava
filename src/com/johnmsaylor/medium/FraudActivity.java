package com.johnmsaylor.medium;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FraudActivity {

    public static void main(String[] args) {
        for (int i = 0; i < 4; i++) {
            System.out.println(i);
        }
    }

    static int activityNotifications(int[] expenditure, int d) {
        int totalWarnings = 0;
        for (int i = d; i < expenditure.length; i++) {
            List<Integer> history = new ArrayList<>();
            for (int back = i - d; back < i; back++) {
                history.add(expenditure[back]);
            }
            Collections.sort(history);
            int len = history.size();
            int median = len % 2 == 0
                    ? ((expenditure[len/2] + expenditure[(len/2) - 1]) / 2)
                    : expenditure[len/2];
            if (expenditure[i] >= median * 2) {
                totalWarnings++;
            }
        }

        return totalWarnings;
    }
}
